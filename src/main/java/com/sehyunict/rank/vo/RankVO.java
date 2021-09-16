package com.sehyunict.rank.vo;

public class RankVO {
	
	/** 직급 글순서 **/
	private String emp_rank_idx;
	
	/** 직급코드 **/
	private String emp_rank_code;
	
	/** 직급명 **/
	private String emp_rank_name;
	
	/** 직급등록자 **/
	private String emp_rank_reg_user;
	
	/** 직급등록일자 **/
	private String emp_rank_reg_date;
	
	/** 직급수정자 **/
	private String emp_rank_mod_user;
	
	/** 직급수정일자 **/
	private String emp_rank_mod_date;
	
	/** 직급사용여부 **/
	private String emp_rank_use_Yn;

	/** 직급사용여부 변경 **/
	private String empRankChangeYn;
	
	public String getEmp_rank_idx() {
		return emp_rank_idx;
	}

	public void setEmp_rank_idx(String emp_rank_idx) {
		this.emp_rank_idx = emp_rank_idx;
	}

	public String getEmp_rank_code() {
		return emp_rank_code;
	}

	public void setEmp_rank_code(String emp_rank_code) {
		this.emp_rank_code = emp_rank_code;
	}

	public String getEmp_rank_name() {
		return emp_rank_name;
	}

	public void setEmp_rank_name(String emp_rank_name) {
		this.emp_rank_name = emp_rank_name;
	}

	public String getEmp_rank_reg_user() {
		return emp_rank_reg_user;
	}

	public void setEmp_rank_reg_user(String emp_rank_reg_user) {
		this.emp_rank_reg_user = emp_rank_reg_user;
	}

	public String getEmp_rank_reg_date() {
		return emp_rank_reg_date;
	}

	public void setEmp_rank_reg_date(String emp_rank_reg_date) {
		this.emp_rank_reg_date = emp_rank_reg_date;
	}

	public String getEmp_rank_mod_user() {
		return emp_rank_mod_user;
	}

	public void setEmp_rank_mod_user(String emp_rank_mod_user) {
		this.emp_rank_mod_user = emp_rank_mod_user;
	}

	public String getEmp_rank_mod_date() {
		return emp_rank_mod_date;
	}

	public void setEmp_rank_mod_date(String emp_rank_mod_date) {
		this.emp_rank_mod_date = emp_rank_mod_date;
	}

	public String getEmp_rank_use_Yn() {
		return emp_rank_use_Yn;
	}

	public void setEmp_rank_use_Yn(String emp_rank_use_Yn) {
		this.emp_rank_use_Yn = emp_rank_use_Yn;
	}
	
	public String getEmpRankChangeYn() {
		return empRankChangeYn;
	}

	public void setEmpRankChangeYn(String empRankChangeYn) {
		this.empRankChangeYn = empRankChangeYn;
	}

	@Override
	public String toString() {
		return "RankVO [emp_rank_idx=" + emp_rank_idx + ", emp_rank_code=" + emp_rank_code + ", emp_rank_name="
				+ emp_rank_name + ", emp_rank_reg_user=" + emp_rank_reg_user + ", emp_rank_reg_date="
				+ emp_rank_reg_date + ", emp_rank_mod_user=" + emp_rank_mod_user + ", emp_rank_mod_date="
				+ emp_rank_mod_date + ", emp_rank_use_Yn=" + emp_rank_use_Yn + ", empRankChangeYn=" + empRankChangeYn
				+ "]";
	}
}
