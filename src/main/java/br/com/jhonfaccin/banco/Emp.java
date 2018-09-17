package br.com.jhonfaccin.banco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="emp")
public class Emp {
	private Integer id;
	private String name;
	private Integer age;
	
	public Emp() {
	}
	
	public Emp(Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome;
	}
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "age")
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
