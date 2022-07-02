package br.edu.infnet.enderecoApp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.enderecoApp.main.repository.RoleRepository;
import br.edu.infnet.enderecoApp.model.domain.Role;

@Service
public class RoleService {
	@Autowired
	private RoleRepository roleRepository;
	
	public void incluir(Role role) {
		roleRepository.save(role);
	}
	
	public List<Role> obterLista(){
		return (List<Role>) roleRepository.findAll();
	}
	
	public Role obterPorNome(String nome) {
		return roleRepository.findByNome(nome);
		
	}

}
