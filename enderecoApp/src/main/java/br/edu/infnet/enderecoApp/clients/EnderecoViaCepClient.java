package br.edu.infnet.enderecoApp.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.enderecoApp.model.domain.Endereco;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoViaCepClient")
public interface EnderecoViaCepClient {
	
	@GetMapping(value = "/{cep}/json")
	public Endereco obterPorCep(@PathVariable String cep);

}
