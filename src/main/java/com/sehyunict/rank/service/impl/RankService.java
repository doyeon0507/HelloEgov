package com.sehyunict.rank.service.impl;

import java.util.List;

import com.sehyunict.rank.vo.RankVO;


public interface RankService {
	
	/**
	 * 직급 수정 목록을 조회한다.
	 * @param rankVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 * */
	void changeUseYn(RankVO rankVO) throws Exception;
	
	/**
	 * 직급 목록을 조회한다.
	 * @param rankVO 
	 * @param RankVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	List<?> selectRankList(RankVO rankVO) throws Exception;
}
