package com.shopping.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String postLogin(Member member, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
		logger.info("post login");
		
		Member member_info = memberService.login(member);
		HttpSession session = req.getSession();
		
		if (member_info != null) {
			session.setAttribute("member_info", member_info);
		} else {
			session.setAttribute("member_info", null);
			rttr.addFlashAttribute("msg", false);
			return "redirect:/member/login";
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		logger.info("logout");
		session.invalidate();
		return "redirect:/";
	}

}
