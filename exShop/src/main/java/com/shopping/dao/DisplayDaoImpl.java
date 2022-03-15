package com.shopping.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shopping.dto.Goods;

@Repository
public class DisplayDaoImpl implements DisplayDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.shopping.mappers.goods";
	

	@Override
	public List<Goods> gdsList() throws Exception {
		return sql.selectList(namespace + ".gdsList");
	}

}
