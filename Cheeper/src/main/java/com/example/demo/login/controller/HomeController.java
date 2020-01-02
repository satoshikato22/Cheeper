package com.example.demo.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.login.service.UserService;


@Controller
public class HomeController {

    @Autowired
    UserService userService;
    @Autowired
    HttpSession session;


    @GetMapping("/home")
    public String getHome(Model model) {

        //コンテンツ部分にユーザー詳細を表示するための文字列を登録
        model.addAttribute("contents", "login/home :: home_contents");

        return "login/homeLayout";
    }
    /**
     * ログアウト用処理.
     */
    @PostMapping("/logout")
    public String postLogout() {
    	//セッションの削除
    	session.removeAttribute("loginUser");
        //ログイン画面にリダイレクト
        return "redirect:/login";
    }
}
