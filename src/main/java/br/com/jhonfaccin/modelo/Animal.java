package br.com.jhonfaccin.modelo;

public class Animal {
	private Integer id;
	private String nome;
	
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
