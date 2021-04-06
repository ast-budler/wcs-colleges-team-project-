package net.teamproject.wic.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.teamproject.wic.service.KakaoLoginService;

@Controller
public class Rootcontroller {
	
	@Autowired
	KakaoLoginService ks;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("code") String code, HttpSession session) {
		String accessToken = ks.getAccessToken(code);
		HashMap<String, Object> userInfo = ks.getUserInfo(accessToken);		
		
		session.setAttribute("userId", userInfo.get("email"));
		session.setAttribute("accessToken", accessToken);
		return "index";
	}
}