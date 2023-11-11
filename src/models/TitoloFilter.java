package models;

import java.util.ArrayList;
import java.util.List;

public class TitoloFilter implements Ifilter{
private String titolo;

public TitoloFilter(String titolo) {
	super();
	this.titolo = titolo;
}

public String getTitolo() {
	return titolo;
}

public void setTitolo(String titolo) {
	this.titolo = titolo;
}


public List<Prestabile> filtra(List<Prestabile> input) {
	// TODO Auto-generated method stub
	List<Prestabile> p =new ArrayList<Prestabile>();
	for ( Prestabile prestabile :input) {
		if ( prestabile.equals(this.titolo));
		p.add(prestabile);
	}
	return p;
}

}
