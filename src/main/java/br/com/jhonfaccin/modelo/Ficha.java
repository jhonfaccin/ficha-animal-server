package br.com.jhonfaccin.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ficha {
	private Integer id;
	private Date dataDeCadastro;
	private Boolean ativo;
	private String observacao;
	private List<Animal> animais = new ArrayList<>();
	
	public Ficha() {
	}
	
	public Ficha (Integer id,Date dataDeCadastro,Boolean ativo, List<Animal> animais) {
		this.id = id;
		this.dataDeCadastro = dataDeCadastro;
		this.setAtivo(ativo);
		this.animais = animais;
	}
	
	public Integer getId() {
		return id;
	}
	public List<Animal> getAnimais() {
		return animais;
	}

	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}
	
	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
