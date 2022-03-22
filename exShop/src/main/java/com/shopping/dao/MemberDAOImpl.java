package com.shopping.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shopping.dto.Member;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.shopping.mappers.member";
	

	@Override
	public void signUp(Member member) throws Exception {
		sql.insert(namespace + ".signUp", member);
	}

	@Override
	public Member login(Member member) throws Exception {
		return sql.selectOne(namespace + ".login", member);
	}

}
