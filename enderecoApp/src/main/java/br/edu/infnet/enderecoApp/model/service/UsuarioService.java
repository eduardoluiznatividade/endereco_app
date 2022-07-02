package br.edu.infnet.enderecoApp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.edu.infnet.enderecoApp.main.repository.UsuariRepository;
import br.edu.infnet.enderecoApp.model.domain.Usuario;

@Service
public class UsuarioService {
	@Autowired
	private UsuariRepository usuarioRepository;
	
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	
	public void incluir(Usuario usuario) {
		usuario.setSenha(bcryptPasswordEncoder.encode(usuario.getSenha()));
		usuarioRepository.save(usuario);
	}
	
	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public Usuario autenticar(String email, String senha) {
		Usuario usuario = usuarioRepository.findByEmail(email);
		
		if(usuario != null) {
			
			if(usuario.getSenha().equals(senha)) {
				return usuario;
			}
		} 
		
		return usuario;
	}

}
