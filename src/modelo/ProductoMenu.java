package modelo;

public class ProductoMenu implements Producto {
	private String nombre;
	private int precioBase;
	
	public ProductoMenu (String pnombre, int pprecioBase) {
		nombre=pnombre;
		precioBase=pprecioBase;
	}
	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio( ) {
		return precioBase;
	}
	
	public String generarTextoFactura() {
		return "Descripcion: " + nombre + "Precio: "+ precioBase;
	}
}		


	
