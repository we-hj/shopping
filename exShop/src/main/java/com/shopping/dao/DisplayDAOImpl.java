package com.shopping.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shopping.dto.Goods;

@Repository
public class DisplayDAOImpl implements DisplayDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.shopping.mappers.goods";
	

	@Override
	public List<Goods> gdsList() throws Exception {
		return sql.selectList(namespace + ".gdsList");
	}


	@Override
	public Goods gdsDetail(int gdsId) throws Exception {
		return sql.selectOne(namespace + ".gdsDetail", gdsId);
	}

}
