package br.edu.infnet.enderecoApp.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.enderecoApp.model.domain.Endereco;
import br.edu.infnet.enderecoApp.model.domain.Role;
import br.edu.infnet.enderecoApp.model.domain.Usuario;
import br.edu.infnet.enderecoApp.model.service.RoleService;
import br.edu.infnet.enderecoApp.model.service.UsuarioService;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;

	@GetMapping(value = "/usuario")
	public String telaCadastro(Model model) {
		model.addAttribute("roles", roleService.obterLista());
		
		return "usuario/cadastro";
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario, Endereco endereco, @RequestParam Integer acesso) {
		
		usuario.setSenha(bcryptPasswordEncoder.encode(usuario.getSenha()));
		
		usuario.setEndereco(endereco);
		usuario.setRoles(Arrays.asList(new Role(acesso)));
		
		usuarioService.incluir(usuario);
		
		return "redirect:/";
	}
	
}
