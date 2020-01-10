package com.example.demo.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.login.model.SignupForm;
import com.example.demo.login.model.User;
import com.example.demo.login.service.UserService;
@Controller
public class SignupController {
	@Autowired
	private UserService userService;
    @GetMapping("/signup")
    public String getSignUp(@ModelAttribute SignupForm form,Model model) {

    	return "login/signup";
} /**
* ユーザー登録画面のPOSTメソッド用処理.
*/
    @PostMapping("/signup")
    public String postSignUp(@ModelAttribute @Validated(GroupOrder.class) SignupForm form,BindingResult bindingResult,Model model) {

    	//入力チェック
    	if(bindingResult.hasErrors()) {
    		//GETリクエスト用のメソッドを呼び出して、ユーザー登録画面に戻ります。
    		return getSignUp(form,model);
    	}
    	System.out.println(form);
    	//insert用変数
    	User user = new User();
    	user.setuserId(form.getuserId());
    	user.setPass(form.getPassword());
    	user.setuserName(form.getuserName());
    	user.setBirthday(form.getBirthday());
    	user.setAge(form.getAge());
    	user.setRole("ROLE_GENERAL");//一般ユーザー

    	//ユーザー登録処理
    	boolean result = userService.insert(user);

    	//ユーザー登録結果の判定
    	if(result == true) {
    		System.out.println("insert 成功");
    		return "redirect:/login";
    	}else {
    		System.out.println("insert 失敗");
    	}

    	return "redirect:/login";
}

}