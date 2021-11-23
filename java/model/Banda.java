package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banda")
public class Banda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idbanda;
	@Column
	private String nome;
	@Column
	private String genero;
	
	public int getIdbanda() {
		return idbanda;
	}
	public void setIdbanda(int idbanda) {
		this.idbanda = idbanda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
