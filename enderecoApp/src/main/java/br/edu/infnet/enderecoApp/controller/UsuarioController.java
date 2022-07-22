package br.edu.infnet.enderecoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.enderecoApp.model.domain.Usuario;
import br.edu.infnet.enderecoApp.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping(value = "/usuario")
	public String cadastro() {
		return "usuario/cadastro";
	}
		
	@PostMapping("/usuario/incluir")
	public String incluir(Usuario usuario) {
		usuarioService.incluir(usuario);
		
		return "redirect:/";
	}
}
