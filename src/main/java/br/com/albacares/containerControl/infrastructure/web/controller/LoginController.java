package br.com.albacares.containerControl.infrastructure.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	
	@GetMapping({"/login", "/"})
	public String login() {
		return "login";
	}

}
