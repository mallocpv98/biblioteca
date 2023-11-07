package models;

import java.time.LocalDate;

abstract class Persona {
	
	private String nome;
	private String congnome;
	private LocalDate dataNascita;
	private String cittaNascita;
	private String sesso;
	public Persona(String nome, String congnome, LocalDate dataNascita, String cittaNascita, String sesso) {
		super();
		this.nome = nome;
		this.congnome = congnome;
		this.dataNascita = dataNascita;
		this.cittaNascita = cittaNascita;
		this.sesso = sesso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCongnome() {
		return congnome;
	}
	public void setCongnome(String congnome) {
		this.congnome = congnome;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getCittaNascita() {
		return cittaNascita;
	}
	public void setCittaNascita(String cittaNascita) {
		this.cittaNascita = cittaNascita;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	

}
