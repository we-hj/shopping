package com.shopping.service;

import com.shopping.dto.Member;

public interface MemberService {

	public void signUp(Member member) throws Exception;

	public Member login(Member member) throws Exception;

}
