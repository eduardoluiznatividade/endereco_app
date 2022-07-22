package br.edu.infnet.enderecoApp.controller;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.enderecoApp.model.domain.Usuario;
import br.edu.infnet.enderecoApp.model.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("user")
@Controller
public class AppController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping(value = "/")
	public String telaIndex() {
		return "index";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		Usuario usuario = usuarioService.autenticar(email, senha);
		
		if (usuario != null) {
			model.addAttribute("user", usuario);
			return "redirect:/";
			
		}
		return "redirect:/login";
		
	}
	
	@GetMapping(value = "logout")
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete();	
		session.removeAttribute("user");
		
		return "redirect:/";
	}
}
