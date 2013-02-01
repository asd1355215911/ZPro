package app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import app.services.UserService;

@Controller
public class User {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String login(Model mode,@RequestParam(required=false)String name,@RequestParam(required=false)String pwd){
		//�ǵ�¼�������¼ҳ��
		if(name == null || pwd == null || name.length() < 5) return "login";
		
		//��¼��֤
		System.out.println(userService);
		return "login";
	}
	
}
