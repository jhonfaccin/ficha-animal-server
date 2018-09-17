package br.com.jhonfaccin.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "ficha")
public class Ficha {
	private Integer id;
	private Date dataDeCadastro;
	private Boolean ativo;
	private String observacao;
	private List<Animal> animais = new ArrayList<>();

	public Ficha() {
	}

	public Ficha(Date dataDeCadastro,String obsercacao, Boolean ativo, List<Animal> animais) {
		this.dataDeCadastro = dataDeCadastro;
		this.ativo = ativo;
		this.observacao = obsercacao;
		this.animais = animais;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	public Integer getId() {
		return id;
	}

	@Transient
	public List<Animal> listaDeAnimais() {
		return animais;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dataDeCadastro")
	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}

	@Column(name = "ativo")
	public Boolean getAtivo() {
		return ativo;
	}

	@Column(name = "observacao")
	public String getObservacao() {
		return observacao;
	}

	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
