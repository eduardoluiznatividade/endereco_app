package br.edu.infnet.enderecoApp.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.enderecoApp.model.domain.Usuario;

@Repository
public interface UsuariRepository extends CrudRepository<Usuario, Integer> {

	Usuario findByEmail(String email);

}
