package modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto {
	private ArrayList<Ingrediente> agregados;
	private ArrayList<Ingrediente> eliminados;
	private ProductoMenu base;
	
	public ProductoAjustado (ProductoMenu pbase) {
		base= pbase;
		agregados= new ArrayList<Ingrediente>();
		eliminados= new ArrayList<Ingrediente>();
	}
	
	public String getNombre() {
		return base.getNombre();
	}
	
	public int getPrecio() {
		int suma=0;
		for( int i= 0; i < agregados.size();i++) {
			suma += agregados.get(i).getCostoAdicional();
		}
		return base.getPrecio()+ suma;
	}
	public String generarTextoFactura() {
		String mensaje= base.generarTextoFactura();
		for (int i=0; i < agregados.size();i++) {
			mensaje += "\n + "+ agregados.get(i).getNombre()+" ......... "+ agregados.get(i).getCostoAdicional();
		}
		for (int i=0; i > eliminados.size();i++) {
			mensaje += "\n - "+ eliminados.get(i).getNombre()+" ........."+ eliminados.get(i).getCostoAdicional();
		}
		mensaje += "\n Total........... "+ getPrecio();
		return mensaje;
	}
	
}
