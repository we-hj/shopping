package com.shopping.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shopping.dao.DisplayDAO;
import com.shopping.dto.Goods;

@Service
public class DisplayServiceImpl implements DisplayService {
	
	@Inject
	private DisplayDAO dpDao;
	

	@Override
	public List<Goods> gdsList() throws Exception {
		return dpDao.gdsList();
	}

}
