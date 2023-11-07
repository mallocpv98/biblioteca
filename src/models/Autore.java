package models;

import java.time.LocalDate;
import java.util.List;

public class Autore extends Persona {
	private List<Libro> libriPublicati;
	private LocalDate primaPublicazione;
	private List<String> riconoscimenti;
	public Autore(String nome, String congnome, LocalDate dataNascita, String cittaNascita, String sesso,
			List<Libro> libriPublicati, LocalDate primaPublicazione, List<String> riconoscimenti) {
		super(nome, congnome, dataNascita, cittaNascita, sesso);
		this.libriPublicati = libriPublicati;
		this.primaPublicazione = primaPublicazione;
		this.riconoscimenti = riconoscimenti;
	}
	public List<Libro> getLibriPublicati() {
		return libriPublicati;
	}
	public void setLibriPublicati(List<Libro> libriPublicati) {
		this.libriPublicati = libriPublicati;
	}
	public LocalDate getPrimaPublicazione() {
		return primaPublicazione;
	}
	public void setPrimaPublicazione(LocalDate primaPublicazione) {
		this.primaPublicazione = primaPublicazione;
	}
	public List<String> getRiconoscimenti() {
		return riconoscimenti;
	}
	public void setRiconoscimenti(List<String> riconoscimenti) {
		this.riconoscimenti = riconoscimenti;
	}

	
	

}
