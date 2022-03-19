package com.shopping.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shopping.dao.MemberDAO;
import com.shopping.dto.Member;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO memberDao;

	
	@Override
	public void signUp(Member member) throws Exception {
		memberDao.signUp(member);
	}

}
