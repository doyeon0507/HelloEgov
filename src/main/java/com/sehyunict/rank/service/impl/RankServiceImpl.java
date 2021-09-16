package com.sehyunict.rank.service.impl;

import java.util.List;

import javax.annotation.Resource;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sehyunict.rank.mapper.RankMapper;
import com.sehyunict.rank.vo.RankVO;

@Service("rankService")
public class RankServiceImpl implements RankService{
	
	//private static final Logger LOGGER = LoggerFactory.getLogger(RankServiceImpl.class);

	
	// TODO mybatis 사용
	@Resource(name = "rankMapper")
	private RankMapper rankMapper;
	
	/**
	 * 직급 수정 목록을 조회한다.
	 * @param RankVO - 조회할 정보가 담긴 VO
	 * @return 직급 변경 목록
	 * @exception Exception
	 * */
	@Override
	public void changeUseYn(RankVO rankVO) throws Exception {
		rankMapper.changeUseYn(rankVO);
	}
	
	/**
	 * 직급 목록을 조회한다.
	 * @param RankVO - 조회할 정보가 담긴 VO
	 * @return 직급 목록
	 * @exception Exception
	 */
	@Override
	public List<?> selectRankList(RankVO rankVO) throws Exception {
		return rankMapper.selectRankList(rankVO);
	}
}
