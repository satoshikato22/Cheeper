package com.example.demo.tweet.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.tweet.model.User;


@Controller
public class LoginController {
	@Autowired
	HttpSession session;
	@GetMapping("/login")
	public String GetLogin() {

		return "login/login";

	}
	@PostMapping("/login")
	public String PostLogin(@RequestParam("pass")String pass) {
		User user = new User();
		user.setName("test");
		user.setPass(pass);
		session.setAttribute("loginUser", user);

		return "login/loginResult";

	}
}
