package models;

import java.time.LocalDate;

abstract class Persona {
	
	private String nome;
	private String congnome;
	private LocalDate dataNascita;
	private String luogoNascita;
	private Sesso sesso;
	private String nazionalita;
	
	public Persona(String nome, String congnome, LocalDate dataNascita, String luogoNascita, Sesso sesso,
			String nazionalita) {
		super();
		this.nome = nome;
		this.congnome = congnome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.sesso = sesso;
		this.nazionalita = nazionalita;
	}
	public String getNome() {
		return nome;
	}
	public String getCongnome() {
		return congnome;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}

	public String getNazionalita() {
		return nazionalita;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCongnome(String congnome) {
		this.congnome = congnome;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita= nazionalita;
	}
	public Sesso getSesso() {
		return sesso;
	}
	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}
	

	

}
