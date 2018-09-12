package br.com.jhonfaccin.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Ficha {
	private Integer id;
	private Date dataDeCadastro;
	private boolean status;
	private ArrayList<Animal> animais;
	
	public Ficha(Integer id,Date dataDeCadastro,boolean status,ArrayList<Animal> animais) {
		this.id = id;
		this.dataDeCadastro = dataDeCadastro;
		this.status = status;
		this.animais = animais;
	}
	
	public Integer getId() {
		return id;
	}
	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public Boolean getStatus() {
		return status;
	}
	
	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
}
