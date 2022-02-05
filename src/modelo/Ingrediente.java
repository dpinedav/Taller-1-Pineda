package modelo;

public class Ingrediente {
	private String nombre;
	private int costoAdicional;
	
	public Ingrediente (String pnombre, int pcostoAdicional ){
		nombre= pnombre;
		costoAdicional=pcostoAdicional;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCostoAdicional() {
		return costoAdicional;
	}
	
}
