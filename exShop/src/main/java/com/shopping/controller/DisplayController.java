package com.shopping.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopping.dto.Goods;
import com.shopping.service.DisplayService;

@Controller
@RequestMapping("/display/*")
public class DisplayController {
	
	private static final Logger logger = LoggerFactory.getLogger(DisplayController.class);
	
	@Inject
	private DisplayService dpService;
	
	
	@RequestMapping(value = "/gdsList", method = RequestMethod.GET)
	public void getGdsList(Model model) throws Exception {
		List<Goods> list = dpService.gdsList();
		model.addAttribute("gdslist", list);
		logger.info("get gdsList");
	}
	
	@RequestMapping(value = "/gdsDetail", method = RequestMethod.GET)
	public void getGdsDetail(Model model, @RequestParam("n") int gdsId) throws Exception {
		Goods gdsInfo = dpService.gdsDetail(gdsId);
		model.addAttribute("gds", gdsInfo);
		logger.info("get gdsDetail");
	}
	
}
