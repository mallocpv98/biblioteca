package models;

import java.time.LocalDate;

public class Bibliotecaria extends User {
	private String tipoContratto;
	private LocalDate assunzione;
	private double Stipendio;
	private int numId;
	public Bibliotecaria(String nome, String congnome, LocalDate dataNascita, String luogoNascita, Sesso sesso,
			String nazionalita, String nickName, String password, Category categoria, String indirizzo, int nCivico,
			int telefono, String email, String cF, String tipoContratto, LocalDate assunzione, double stipendio,
			int numId) {
		super(nome, congnome, dataNascita, luogoNascita, sesso, nazionalita, nickName, password, categoria, indirizzo,
				nCivico, telefono, email, cF);
		this.tipoContratto = tipoContratto;
		this.assunzione = assunzione;
		Stipendio = stipendio;
		this.numId = numId;
	}
	public String getTipoContratto() {
		return tipoContratto;
	}
	public LocalDate getAssunzione() {
		return assunzione;
	}
	public double getStipendio() {
		return Stipendio;
	}
	public int getNumId() {
		return numId;
	}
	public void setTipoContratto(String tipoContratto) {
		this.tipoContratto = tipoContratto;
	}
	public void setAssunzione(LocalDate assunzione) {
		this.assunzione = assunzione;
	}
	public void setStipendio(double stipendio) {
		Stipendio = stipendio;
	}
	public void setNumId(int numId) {
		this.numId = numId;
	}
	
	

}
