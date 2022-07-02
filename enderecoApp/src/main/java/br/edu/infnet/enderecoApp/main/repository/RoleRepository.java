package br.edu.infnet.enderecoApp.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.edu.infnet.enderecoApp.model.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

	@Query("")
	Role findByNome(String nome);

}
