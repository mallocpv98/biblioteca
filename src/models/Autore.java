package models;

import java.time.LocalDate;
import java.util.List;

public class Autore extends Persona {
	private List<Libro> libriPublicati;
	private LocalDate primaPublicazione;
	private String riconoscimenti;
	public Autore(String nome, String congnome, LocalDate dataNascita, String luogoNascita, Sesso sesso,
			String nazionalita, List<Libro> libriPublicati, LocalDate primaPublicazione, String riconoscimenti) {
		super(nome, congnome, dataNascita, luogoNascita, sesso, nazionalita);
		this.libriPublicati = libriPublicati;
		this.primaPublicazione = primaPublicazione;
		this.riconoscimenti = riconoscimenti;
	}
	public List<Libro> getLibriPublicati() {
		return libriPublicati;
	}
	public LocalDate getPrimaPublicazione() {
		return primaPublicazione;
	}
	public String getRiconoscimenti() {
		return riconoscimenti;
	}
	public void setLibriPublicati(List<Libro> libriPublicati) {
		this.libriPublicati = libriPublicati;
	}
	public void setPrimaPublicazione(LocalDate primaPublicazione) {
		this.primaPublicazione = primaPublicazione;
	}
	public void setRiconoscimenti(String riconoscimenti) {
		this.riconoscimenti = riconoscimenti;
	}
	
	

}
