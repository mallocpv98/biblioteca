package models;

import java.time.LocalDate;
import java.util.List;

public class Libro extends Prestabile{
	private String isbn;
	private String casaEditrice;
	private List<Autore> Autori;
	public Libro(String titolo, String id, int annoPublicazione, LocalDate inizioPrestito, String eAN13, double prezzo,
			String lingua, List<Generi> genere, int finePrestito, String isbn, String casaEditrice,
			List<Autore> autori) {
		super(titolo, id, annoPublicazione, inizioPrestito, eAN13, prezzo, lingua, genere, finePrestito);
		this.isbn = isbn;
		this.casaEditrice = casaEditrice;
		Autori = autori;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getCasaEditrice() {
		return casaEditrice;
	}
	public List<Autore> getAutori() {
		return Autori;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}
	public void setAutori(List<Autore> autori) {
		Autori = autori;
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
