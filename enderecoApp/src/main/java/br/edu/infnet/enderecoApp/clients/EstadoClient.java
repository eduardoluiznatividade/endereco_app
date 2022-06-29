package br.edu.infnet.enderecoApp.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.enderecoApp.model.domain.Estado;
import br.edu.infnet.enderecoApp.model.domain.Municipio;

@FeignClient(url = "https://servicodados.ibge.gov.br/", name = "estadoClient")
public interface EstadoClient {

	@GetMapping(value = "api/v1/localidades/estados?orderBy=nome")
	public List<Estado> obterLista();
	
	@GetMapping(value = "api/v1/localidades/estados/{id}/municipios")
	public List<Municipio> obterMunicipiosPorId(@PathVariable Integer id);
}
 