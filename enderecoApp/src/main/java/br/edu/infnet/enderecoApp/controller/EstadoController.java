package br.edu.infnet.enderecoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.enderecoApp.model.service.EstadoService;

@Controller
public class EstadoController {
	
	@Autowired
	private EstadoService estadoService;
	
	@GetMapping(value = "/estados")
	public String telaListaEstados(Model model) {
		model.addAttribute("lista", estadoService.obterLista());
		
		return "estado/lista";
	}
	
	@GetMapping(value = "/estado/{id}/municipios")
	public String telaListaMunicipios(@PathVariable Integer id, Model model) {
		model.addAttribute("lista", estadoService.obterMunicipiosPorId(id));
		
		return "municipio/lista";
	}

}
