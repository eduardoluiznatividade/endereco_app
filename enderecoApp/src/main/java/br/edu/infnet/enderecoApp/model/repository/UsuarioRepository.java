package br.edu.infnet.enderecoApp.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.enderecoApp.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

	Usuario findByEmail(String email);
	
}
