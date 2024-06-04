package br.com.project.bazarhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/app")
	public String index() {
		return "index";
			
	}
}
