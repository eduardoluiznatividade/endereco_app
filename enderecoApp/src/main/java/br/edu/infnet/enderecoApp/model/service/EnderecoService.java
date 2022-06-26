package br.edu.infnet.enderecoApp.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.enderecoApp.clients.EnderecoClient;
import br.edu.infnet.enderecoApp.clients.EnderecoViaCepClient;
import br.edu.infnet.enderecoApp.model.domain.Endereco;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoClient enderecoClient;
	@Autowired
	private EnderecoViaCepClient enderecoViaCepClient;
	
	public Endereco obterPorCep(String cep) {
		Endereco endereco = enderecoViaCepClient.obterPorCep(cep);
		
		if (endereco == null) {
			return new Endereco(cep);
			
		} else {
			return endereco;
			
		}
		
	}
	
	public List<Endereco> obterLista(){
		return enderecoClient.obterLista();
		
	}
	
	
	public void incluir(Endereco endereco) {
		enderecoClient.incluir(endereco);
		
	}
	
	public void excluir(Integer id) {
		enderecoClient.excluir(id);
		
	}

}
