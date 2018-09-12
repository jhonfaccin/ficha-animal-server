package br.com.jhonfaccin.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Animal {
	private Integer id;
	private String nome;
	
	public Animal() {
	}
	
	public Animal(Integer id,String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
}
