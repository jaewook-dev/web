package com.test.main.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.main.service.MainService;

@Controller
public class MainController {
	
	private static final Logger logger = LogManager.getLogger();
	
	@Autowired
	private MainService mainService;
	
	@GetMapping("/")
	public String signIn(Model model){
		
		/*
		 * List<Member> memberList = mainService.getMemberList();
		 * //System.out.println(memberList +
		 * " <-- memberList index() MainController.java");
		 * 
		 * model.addAttribute("memberList", memberList);
		 */
		
		logger.info("----------------");
		
		return "signin";
//		return "insertPlayer";
	}
	
	@PostMapping("/")
	public String signIn() {
		return "signin";
	}
	
    @RequestMapping(value = "/insertPlayer", produces = "application/text")
    public @ResponseBody String player(ModelMap model, HttpServletRequest request, 
    		HttpServletResponse response, HttpSession session){
        
    	String[] aParam = request.getParameterValues("data");
    	
    	System.out.println(Arrays.toString(aParam));
    	
        return "insertPlayer";
    }
    
    @RequestMapping(value = "/createMember") // 응답 URL
    public @ResponseBody int adminCheck(String sInsertID, String sInsertPW, String sInsertMemberName, String sInsertServer) {
        
//    	int iResult = mainService
        //int result = spendService.spendAdminCheck(shopCode, memberBirth, adminPw); // DB 조회
        System.out.println(sInsertID + sInsertPW + sInsertMemberName + sInsertServer);
            
        return 1;
    }
	
	/*
	 * @PostMapping("/insertPlayer") public String index(HttpServletRequest request)
	 * {
	 * 
	 * String[] ajaxMsg = request.getParameterValues("player");
	 * System.out.println(ajaxMsg);
	 * 
	 * return "insertPlayer"; }
	 */
}
