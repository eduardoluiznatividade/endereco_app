package br.edu.infnet.enderecoApp.model.domain;

import javax.persistence.Id;

public class Municipio {
	@Id
	private Integer id;
	private String nome;
	
	public Municipio() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
