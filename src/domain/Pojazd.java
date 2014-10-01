package domain;

import java.util.ArrayList;
import java.util.List;

public class Pojazd {
	
	public Pojazd()
	{
		this.tenPojazd=new ArrayList<Typ_pojazdu>();
	}
	
	private String numerRejestracyjny;
	private String rocznik;
		
	private Cechy_pojazdu cechy;
	private List<Typ_pojazdu> tenPojazd;
	
	public String getNumerRejestracyjny() {
		return numerRejestracyjny;
	}
	public void setNumerRejestracyjny(String numerRejestracyjny) {
		this.numerRejestracyjny = numerRejestracyjny;
	}
	public String getRocznik() {
		return rocznik;
	}
	public void setRocznik(String rocznik) {
		this.rocznik = rocznik;
	}
	public Cechy_pojazdu getCechy() {
		return cechy;
	}
	public void setCechy(Cechy_pojazdu cechy) {
		this.cechy = cechy;
	}
	public List<Typ_pojazdu> getTenPojazd() {
		return tenPojazd;
	}
	public void setTenPojazd(List<Typ_pojazdu> tenPojazd) {
		this.tenPojazd = tenPojazd;
	}
	
}
