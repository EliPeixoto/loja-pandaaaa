package com.dev.loja.controle;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalControle {

	@GetMapping("/adm")
	public String acessarPrincipal(){
		return "adm/home";
		}
}
