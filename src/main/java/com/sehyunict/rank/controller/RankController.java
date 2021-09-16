package com.sehyunict.rank.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sehyunict.rank.service.impl.RankService;
import com.sehyunict.rank.vo.RankVO;


@Controller
@RequestMapping(value = "/rank")
public class RankController {
	
	
	/** RankService */
	@Resource(name = "rankService")
	private RankService rankService;
	
	
	@RequestMapping(value = "/sample.do")
	public String selectSampleList() throws Exception {
		System.out.println("rank/sample");
		return "rank/sample";		
	}
	
	/**
	 * 직급 목록을 조회한다. (pageing)
	 * @param RankVO - 조회할 정보가 담긴 RankVO
	 * @param model
	 * @return "rankList"
	 * @exception Exception
	 */
	@RequestMapping(value = "/rankList.do")
	public String selectRankList( @ModelAttribute("rankVO") RankVO rankVO, ModelMap model) throws Exception {
		
		List<?> rankList = rankService.selectRankList(rankVO);
		model.addAttribute("resultList", rankList);
		System.out.println("rank/rankList");
		
		return "rank/rankList";
	}
	
	/**
	 * 직급 수정 목록을 조회한다.
	 * @param rankVO - 수정할 정보가 담긴 VO
	 * @param model
	 * @return "redirect:/rank/rankList.do"
	 * @exception Exception
	 */
	@RequestMapping(value = "/changeUseYn.do")
	public String changeUseYn( RankVO rankVO, ModelMap model) throws Exception {
		
		List<?> rankList = rankService.selectRankList(rankVO);
		model.addAttribute("resultList", rankList);
		// 특정 사용자의 useYn을 갱신
		System.out.println( rankVO );
		
		return "redirect:/rank/rankList.do";
	}
	
	/**
	 * 직급 등록 화면을 조회한다.
	 * @param rankVO - 목록 조회조건 정보가 담긴 VO
	 * @param model
	 * @return "addRank"
	 * @exception Exception
	 */
	@RequestMapping(value = "/addRank.do", method = RequestMethod.GET)
	public String addRank( RankVO rankVO, Model model) throws Exception {
		
		model.addAttribute("rankVO", new RankVO());
		System.out.println("rank/addRank");
		
		return "rank/addRank";
	}
}
