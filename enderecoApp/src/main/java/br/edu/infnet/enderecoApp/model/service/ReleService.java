package br.edu.infnet.enderecoApp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.enderecoApp.model.domain.Role;
import br.edu.infnet.enderecoApp.model.repository.RoleRepository;

@Service
public class ReleService {
	@Autowired
	private RoleRepository roleRepository;
	
	public void incluir(Role role) {
		roleRepository.save(role);
		
	}
	
	public Role obterPorNome(String nome){
		return roleRepository.findByNome(nome);
		
	}

}
