package models;

import java.util.ArrayList;
import java.util.List;

public class AutoreFilter implements Ifilter{
	private String PersonaFilter;

	public AutoreFilter(String personaFilter) {
		super();
		PersonaFilter = personaFilter;
	}

	public String getPersonaFilter() {
		return PersonaFilter;
	}

	public void setPersonaFilter(String personaFilter) {
		PersonaFilter = personaFilter;
	}

	
	public List<Prestabile> filtra(List<Prestabile> input) {
		List <Prestabile> p=new ArrayList<Prestabile>();
		for(Prestabile prestabile: input) {
			if( prestabile.equals(this.PersonaFilter));
			p.add(prestabile);
		}
		return p;
	}
	
}
