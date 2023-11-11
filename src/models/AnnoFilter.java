package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AnnoFilter implements Ifilter{
	private LocalDate annoFilter;

	public AnnoFilter(LocalDate annoFilter) {
		super();
		this.annoFilter = annoFilter;
	}

	public LocalDate getAnnoFilter() {
		return annoFilter;
	}

	public void setAnnoFilter(LocalDate annoFilter) {
		this.annoFilter = annoFilter;
	}

	
	public List<Prestabile> filtra(List<Prestabile> input) {
		// TODO Auto-generated method stub
		List<Prestabile> p = new ArrayList<Prestabile>();
		for (Prestabile prestabile : input) {
			if( prestabile.equals(this.annoFilter));
				p.add(prestabile);
		}
		return p;
	}
	
}
