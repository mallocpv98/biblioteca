package models;

import java.time.LocalDate;
import java.util.List;

public abstract class Prestabile implements Iprestable{
	private String titolo;
	private String Id ;
	private int AnnoPublicazione; 
	private LocalDate inizioPrestito;
	private String EAN13;
	private double prezzo;
	private String lingua;
	private List<Generi> genere;
	private int finePrestito;
	
	public Prestabile(String titolo, String id, int annoPublicazione, LocalDate inizioPrestito, String eAN13,
			double prezzo, String lingua, List<Generi> genere, int finePrestito) {
		super();
		this.titolo = titolo;
		Id = id;
		AnnoPublicazione = annoPublicazione;
		this.inizioPrestito = inizioPrestito;
		EAN13 = eAN13;
		this.prezzo = prezzo;
		this.lingua = lingua;
		this.setGenere(genere);
		this.finePrestito = finePrestito;
	}
	public String getTitolo() {
		return titolo;
	}
	public String getId() {
		return Id;
	}
	public int getAnnoPublicazione() {
		return AnnoPublicazione;
	}
	public LocalDate getInizioPrestito() {
		return inizioPrestito;
	}
	public String getEAN13() {
		return EAN13;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public String getLingua() {
		return lingua;
	}
	public int getFinePrestito() {
		return finePrestito;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public void setId(String id) {
		Id = id;
	}
	public void setAnnoPublicazione(int annoPublicazione) {
		AnnoPublicazione = annoPublicazione;
	}
	public void setInizioPrestito(LocalDate inizioPrestito) {
		this.inizioPrestito = inizioPrestito;
	}
	public void setEAN13(String eAN13) {
		EAN13 = eAN13;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public void setLingua(String lingua) {
		this.lingua = lingua;
	}
	public void setFinePrestito(int finePrestito) {
		this.finePrestito = finePrestito;
	}
	public List<Generi> getGenere() {
		return genere;
	}
	public void setGenere(List<Generi> genere) {
		this.genere = genere;
	}
	
}
