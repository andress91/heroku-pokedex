package com.humberto.springboot.pokedex.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping({ "/", "", "/index" })
	public String index() {
		return "index";
	}
}