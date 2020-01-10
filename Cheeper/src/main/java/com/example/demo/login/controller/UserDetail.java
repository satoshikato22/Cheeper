package com.example.demo.login.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.login.model.User;
import com.example.demo.login.service.UserService;

@Controller
public class UserDetail {
	@Autowired
	HttpSession session;
	@Autowired
	UserService userService;
	@GetMapping("/userDetail")
	public String GetUserDetail(Model model) {
		model.addAttribute("contents", "login/userDetail :: userDetail_contents");
		User user = new User();
		user = (User) session.getAttribute("loginUser");
		System.out.println(user.getId());
        //購入履歴一覧の生成
        List<User> userDetail = userService.selectMany(user.getId());

        model.addAttribute("user", userDetail);
        return "login/homeLayout";

	}
}
