package com.gafdot.bancoapirest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BemVindoController {

	@RequestMapping("/")
	@ResponseBody
	public String bemVindo() {
		return "Bem vindo ao Banco!";
	}

}
