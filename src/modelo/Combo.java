package modelo;

import java.util.ArrayList;

public class Combo implements Producto {
	private double descuento;
	private String nombreCombo;
	private ArrayList<Producto> itemsCombo;
	
	public Combo (String pnombre, double pdescuento) {
		nombreCombo=pnombre;
		descuento= pdescuento;
		itemsCombo= new ArrayList <Producto> ();
	}
	public String getNombre() {
		return nombreCombo;
	}
	public int getPrecio() {
		int precio = 0;
		for (int i=0; i < itemsCombo.size();i++) {
			precio += itemsCombo.get(i).getPrecio();	
		}
		precio = (int) ((precio*descuento)/100);
		return precio;
		
	}
	public String generarTextoFactura() {
		String textoFactura= nombreCombo + " ......... "+ getPrecio();
		for(int i=0; i < itemsCombo.size();i++) {
			textoFactura += "\n - "+ itemsCombo.get(i).generarTextoFactura();
			
		}
		return textoFactura;
	}
	public void agregarItemACombo(Producto itemCombo) {
		itemsCombo.add(itemCombo);
	}
}
