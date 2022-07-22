package br.edu.infnet.enderecoApp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.enderecoApp.model.domain.Usuario;
import br.edu.infnet.enderecoApp.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	public UsuarioRepository usuarioRepository;
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public void excluir(Integer idUsuario) {
		usuarioRepository.existsById(idUsuario);
	}
	
	public Usuario autenticar(String email, String senha) {
		Usuario usuario = usuarioRepository.findByEmail(email);
		
		if (usuario != null) {
			if (usuario.getSenha().equals(senha)) {
				return usuario;
			}
		}
		return null;
		
	}

}
