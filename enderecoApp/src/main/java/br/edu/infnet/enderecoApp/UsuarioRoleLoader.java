package br.edu.infnet.enderecoApp;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import br.edu.infnet.enderecoApp.model.domain.Endereco;
import br.edu.infnet.enderecoApp.model.domain.Role;
import br.edu.infnet.enderecoApp.model.domain.Usuario;
import br.edu.infnet.enderecoApp.model.service.RoleService;
import br.edu.infnet.enderecoApp.model.service.UsuarioService;

@Component
public class UsuarioRoleLoader implements ApplicationRunner {

	@Autowired
	private RoleService roleService;
	@Autowired
	private UsuarioService usuarioService;

	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		roleService.incluir(new Role("ROLE_ADIMIN"));
		roleService.incluir(new Role("ROLE_USER"));
		
		Endereco endereco1 = new Endereco();
		endereco1.setBairro(null);
		endereco1.setCep(null);
		endereco1.setComplemento(null);
		endereco1.setLocalidade(null);
		endereco1.setLogradouro(null);
		endereco1.setUf(null);
		
		Usuario usuario1 = new Usuario();
		usuario1.setEmail(null);
		usuario1.setEndereco(endereco1);
		usuario1.setNome(null);
		usuario1.setSenha(null);
		usuario1.setRoles(Arrays.asList(new Role(1)));
		
		Endereco endereco2 = new Endereco();
		endereco2.setBairro(null);
		endereco2.setCep(null);
		endereco2.setComplemento(null);
		endereco2.setLocalidade(null);
		endereco2.setLogradouro(null);
		endereco2.setUf(null);
		
		Usuario usuario2 = new Usuario();
		usuario2.setEmail(null);
		usuario2.setEndereco(endereco2);
		usuario2.setNome(null);
		usuario2.setSenha(null);
		usuario2.setRoles(Arrays.asList(new Role(2)));
		
		usuarioService.incluir(usuario1);
		usuarioService.incluir(usuario2);
		
	}

}
