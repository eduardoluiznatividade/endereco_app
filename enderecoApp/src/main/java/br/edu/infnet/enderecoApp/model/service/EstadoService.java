package br.edu.infnet.enderecoApp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.enderecoApp.clients.EstadoClient;
import br.edu.infnet.enderecoApp.model.domain.Estado;

@Service
public class EstadoService {

	@Autowired
	private EstadoClient estadoClient;
	
	public List<Estado> obterLista() {
		return estadoClient.obterLista();
	}

	public Object obterMunicipiosPorId(Integer id) {
		return estadoClient.obterMunicipiosPorId(id);
	}

}
