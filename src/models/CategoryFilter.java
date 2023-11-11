package models;

import java.util.ArrayList;
import java.util.List;

public class CategoryFilter implements Ifilter{
	private String categoriaFilter;

	public CategoryFilter(String categoriaFilter) {
		super();
		this.categoriaFilter = categoriaFilter;
	}

	public String getCategoriaFilter() {
		return categoriaFilter;
	}

	public void setCategoriaFilter(String categoriaFilter) {
		this.categoriaFilter = categoriaFilter;
	}

	
	public List<Prestabile> filtra(List<Prestabile> input) {
		List <Prestabile> p=new ArrayList<Prestabile>();
		for (Prestabile prestabile :input ) {
				if(prestabile.equals(this.categoriaFilter))
					p.add(prestabile);
					
		}
		return p;
		
	}
	/* @Override
    public List<Viaggio> esegui(List<Viaggio> input) {
        return input.stream().filter(x -> x.getPrezzoTot() <= maxPrezzo && x.getPrezzoTot() >= minPrezzo).toList();
    }
    public List<Viaggio> esegui(@NotNull List<Viaggio> input) {
        return input.stream().filter(x -> x.getOrarioPartenza() >= minOrario && x.getOrarioArrivo() <= maxOrario).toList();
    }  
     public List<Viaggio> esegui(List<Viaggio> input) {
        return input.stream().filter(x -> x.getPrezzoTot() <= maxPrezzo && x.getPrezzoTot() >= minPrezzo).toList();
    }
	*/
}
