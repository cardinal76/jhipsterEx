package it.cardinals.jhip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="primatabella")
public class ProvaEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="nome")
	private String nome;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
