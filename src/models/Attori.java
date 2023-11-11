package models;

import java.time.LocalDate;
import java.util.List;

public class Attori extends Persona{
	private String premiRicevuti;
	private boolean attivo;
	private String biografia;
	private List<String> film;
	public Attori(String nome, String congnome, LocalDate dataNascita, String luogoNascita, Sesso sesso,
			String nazionalita, String premiRicevuti, boolean attivo, String biografia, List<String> film) {
		super(nome, congnome, dataNascita, luogoNascita, sesso, nazionalita);
		this.premiRicevuti = premiRicevuti;
		this.attivo = attivo;
		this.biografia = biografia;
		this.film = film;
	}
	public String getPremiRicevuti() {
		return premiRicevuti;
	}
	public boolean isAttivo() {
		return attivo;
	}
	public String getBiografia() {
		return biografia;
	}
	public List<String> getFilm() {
		return film;
	}
	public void setPremiRicevuti(String premiRicevuti) {
		this.premiRicevuti = premiRicevuti;
	}
	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	public void setFilm(List<String> film) {
		this.film = film;
	}
	
	
	
	
	

}
