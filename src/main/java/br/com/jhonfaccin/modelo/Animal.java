package br.com.jhonfaccin.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal {
	private Integer id;
	private String nome;
	private Integer fichaId;
	
	public Animal() {
	}
	
	public Animal(Integer id,String nome, Ficha fichaId) {
		this.id = id;
		this.nome = nome;
//		this.ficha = fichaId;
	}
	
	@Column(name = "ficha_id")
	public Integer getFichaId() {
		return fichaId;
	}
	
	//,
//	@ManyToOne     
//	@JoinColumn(name="ficha_id",nullable=false, insertable=false, updatable=false)
//	public Ficha getFicha() {
//		return ficha;
//	}

//	public void setFicha(Ficha ficha) {
//		this.ficha = ficha;
//	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)	
	public Integer getId() {
		return id;
	}
	
	@Column(name = "nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setFichaId(Integer fichaId) {
		this.fichaId = fichaId;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
}
