package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class User {

	@RequestMapping("/login")
	public String login(Model mode,@RequestParam(required=false)String name,@RequestParam(required=false)String pwd){
		//�ǵ�¼�������¼ҳ��
		if(name == null || pwd == null || name.length() < 5) return "login";
		
		//��¼��֤
		
		return "login";
	}
	
}
