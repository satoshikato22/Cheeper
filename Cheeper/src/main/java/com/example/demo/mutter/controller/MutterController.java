package com.example.demo.mutter.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.mutter.model.Mutter;
import com.example.demo.mutter.model.PostMutterLogic;

@Controller
public class MutterController {
	@Autowired
	ServletContext application;

	@GetMapping("/mutter")
	public String GetMutter() {

		List<Mutter> mutterList =
		        (List<Mutter>) application.getAttribute("mutterList");
		if (mutterList == null) {
		      mutterList = new ArrayList<Mutter>();
		      application.setAttribute("mutterList", mutterList);
		    }


		return "mutter/mutter";

	}

	@PostMapping("/mutter")
	public String PostMapping(@RequestParam("text")String text) {

		if (text != null && text.length() != 0) {
		      // アプリケーションスコープに保存されたつぶやきリストを取得
		      List<Mutter> mutterList =
		          (List<Mutter>) application.getAttribute("mutterList");

		      // つぶやきをつぶやきリストに追加
		      Mutter mutter = new Mutter();
		      mutter.setText(text);
		      mutter.setUserName("test");
		      PostMutterLogic postMutterLogic = new PostMutterLogic();
		      postMutterLogic.execute(mutter, mutterList);

		      // アプリケーションスコープにつぶやきリストを保存
		      application.setAttribute("mutterList", mutterList);
		    }

		return "mutter/mutter";


	}

}
