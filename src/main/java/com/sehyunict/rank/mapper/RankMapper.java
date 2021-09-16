package com.sehyunict.rank.mapper;

import java.util.List;


import com.sehyunict.rank.vo.RankVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("rankMapper")
public interface RankMapper {
	
	/**
	 * 직급을 수정한다.
	 * @param RankVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	void changeUseYn(RankVO rankVO) throws Exception;
	
	/**
	 * 직급 목록을 조회한다.
	 * @param RankVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	List<?> selectRankList(RankVO rankVO) throws Exception;
}
