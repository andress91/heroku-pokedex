package com.humberto.springboot.pokedex.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.humberto.springboot.pokedex.app.models.services.Lectura;

@Controller
public class IndexController {

	@Autowired
	private Lectura servicio;
	
	@GetMapping({ "/", "", "/index" })
	public String index(Model model) {
		model.addAttribute("titulo", servicio.leer());
		return "index";
	}
}
