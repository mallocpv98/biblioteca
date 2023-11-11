package models;

import java.time.LocalDate;
import java.util.List;

public class DVD extends Prestabile {
	private int durata;
	private String lingua;
	public boolean sottotitoliDisponibili;
	private String formatoVideo;
	private List<Attori> attori;
	private String collezione;
	private String casaProduzione;
	public DVD(String titolo, String id, int annoPublicazione, LocalDate inizioPrestito, String eAN13, double prezzo,
			String lingua, List<Generi> genere, int finePrestito, int durata, String lingua2,
			boolean sottotitoliDisponibili, String formatoVideo, List<Attori> attori, String collezione,
			String casaProduzione) {
		super(titolo, id, annoPublicazione, inizioPrestito, eAN13, prezzo, lingua, genere, finePrestito);
		this.durata = durata;
		lingua = lingua2;
		this.sottotitoliDisponibili = sottotitoliDisponibili;
		this.formatoVideo = formatoVideo;
		this.attori = attori;
		this.collezione = collezione;
		this.casaProduzione = casaProduzione;
	}
	public int getDurata() {
		return durata;
	}
	public String getLingua() {
		return lingua;
	}
	public boolean isSottotitoliDisponibili() {
		return sottotitoliDisponibili;
	}
	public String getFormatoVideo() {
		return formatoVideo;
	}
	public List<Attori> getAttori() {
		return attori;
	}
	public String getCollezione() {
		return collezione;
	}
	public String getCasaProduzione() {
		return casaProduzione;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public void setLingua(String lingua) {
		this.lingua = lingua;
	}
	public void setSottotitoliDisponibili(boolean sottotitoliDisponibili) {
		this.sottotitoliDisponibili = sottotitoliDisponibili;
	}
	public void setFormatoVideo(String formatoVideo) {
		this.formatoVideo = formatoVideo;
	}
	public void setAttori(List<Attori> attori) {
		this.attori = attori;
	}
	public void setCollezione(String collezione) {
		this.collezione = collezione;
	}
	public void setCasaProduzione(String casaProduzione) {
		this.casaProduzione = casaProduzione;
	}
	@Override
	public void setPresta() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void restituzione() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void proroga() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isDisponibile() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	

}
