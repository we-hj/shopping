package com.shopping.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shopping.dto.Goods;
import com.shopping.service.DisplayService;

@Controller
@RequestMapping("/display/*")
public class DisplayController {
	
	@Inject
	private DisplayService dpService;
	
	
	@RequestMapping(value = "/gdsList", method = RequestMethod.GET)
	public void getGdsList(Model model) throws Exception {
		List<Goods> list = dpService.gdsList();
		model.addAttribute("gdslist", list);
	}
	
}
