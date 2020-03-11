package com.test.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.main.dto.Member;
import com.test.main.service.MainService;

@Controller
public class MainController {

	@Autowired
	private MainService mainService;
	
	@GetMapping("/")
	public String index(Model model){
		
		List<Member> memberList = mainService.getMemberList();
		//System.out.println(memberList + " <-- memberList index() MainController.java");
		
		model.addAttribute("memberList", memberList);
		
		return "index";
	}
}
