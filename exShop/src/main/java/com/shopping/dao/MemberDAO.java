package com.shopping.dao;

import com.shopping.dto.Member;

public interface MemberDAO {

	public void signUp(Member member) throws Exception;

	public Member login(Member member) throws Exception;

}
