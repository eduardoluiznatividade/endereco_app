package br.edu.infnet.enderecoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.edu.infnet.enderecoApp.main.repository.UsuarioDao;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired 
	private UsuarioDao usuarioDao;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(usuarioDao).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	protected void Configure(HttpSecurity http)  throws Exception {
		http.authorizeRequests()
			.antMatchers("/usuario").permitAll()
			.antMatchers("/usuario/incluir").permitAll()
			.antMatchers("/endereco/**").hasRole("ADMIN")
			.anyRequest().authenticated().and().csrf()
			.authenticated().and().formLogin()
			.loginPage("/login").permitAll();

		
	}
}
