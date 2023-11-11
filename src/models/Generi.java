package models;

import java.util.List;

public class Generi {
	private String nomeGenere;
	private int priodoStorico;
	private String descrizioneGenere;
	private List<Prestabile> libriGenere;
	public Generi(String nomeGenere, int priodoStorico, String descrizioneGenere, List<Prestabile> libriGenere) {
		super();
		this.nomeGenere = nomeGenere;
		this.priodoStorico = priodoStorico;
		this.descrizioneGenere = descrizioneGenere;
		this.libriGenere = libriGenere;
	}
	public String getNomeGenere() {
		return nomeGenere;
	}
	public int getPriodoStorico() {
		return priodoStorico;
	}
	public String getDescrizioneGenere() {
		return descrizioneGenere;
	}
	public List<Prestabile> getLibriGenere() {
		return libriGenere;
	}
	public void setNomeGenere(String nomeGenere) {
		this.nomeGenere = nomeGenere;
	}
	public void setPriodoStorico(int priodoStorico) {
		this.priodoStorico = priodoStorico;
	}
	public void setDescrizioneGenere(String descrizioneGenere) {
		this.descrizioneGenere = descrizioneGenere;
	}
	public void setLibriGenere(List<Prestabile> libriGenere) {
		this.libriGenere = libriGenere;
	}
	
	
}
