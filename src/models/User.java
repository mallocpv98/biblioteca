package models;

import java.time.LocalDate;

public class User extends Persona{

	private String nickName;
	private String password;
	private Category categoria;
	private String indirizzo;
	private int nCivico;
	private int telefono;
	private String email;
	private String cF;
	public User(String nome, String congnome, LocalDate dataNascita, String cittaNascita, String sesso, String nickName,
			String password, Category categoria, String indirizzo, int nCivico, int telefono, String email, String cF) {
		super(nome, congnome, dataNascita, cittaNascita, sesso);
		this.nickName = nickName;
		this.password = password;
		this.categoria = categoria;
		this.indirizzo = indirizzo;
		this.nCivico = nCivico;
		this.telefono = telefono;
		this.email = email;
		this.cF = cF;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Category getCategoria() {
		return categoria;
	}
	public void setCategoria(Category categoria) {
		this.categoria = categoria;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public int getnCivico() {
		return nCivico;
	}
	public void setnCivico(int nCivico) {
		this.nCivico = nCivico;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getcF() {
		return cF;
	}
	public void setcF(String cF) {
		this.cF = cF;
	}



	

}
