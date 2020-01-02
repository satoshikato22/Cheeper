package com.example.demo.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.login.model.User;
import com.example.demo.login.service.UserService;


@Controller
public class LoginController {

	@Autowired
	HttpSession session;
	@Autowired
	UserService userService;
	@GetMapping("/login")
	public String GetLogin() {

		return "login/login";

	}
	@PostMapping("/login")
	public String PostLogin(@RequestParam("id")String id,@RequestParam("pass")String pass) {
		User user = new User();
		user.setId(id);
		user.setPass(pass);
		Boolean isbool = userService.selectOne(user.getId(),user.getPass());
    	if(isbool == true) {
    		user = userService.selectinfo(user.getId(),user.getPass());
    		session.setAttribute("loginUser", user);
    		return "redirect:/home";
    	}


		return "login/login";

	}
}
