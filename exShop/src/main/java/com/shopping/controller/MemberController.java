package com.shopping.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shopping.dto.Member;
import com.shopping.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	private MemberService memberService;

	
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public void	getSignUp() throws Exception {
		logger.info("get signUp");
	}
	
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String postSignUp(Member member) throws Exception {
		logger.info("post signUp");
		memberService.signUp(member);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void getLogin() throws Exception {
		logger.info("get login");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLogin(Member member) throws Exception {
		logger.info("post login");
		return "redirect:/";
	}	

}
