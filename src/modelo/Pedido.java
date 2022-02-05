package modelo;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<Producto> itemspedido;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	
	 public Pedido  (int pidPedido, String pnombreCliente, String pdireccionCliente) {
		 idPedido= pidPedido;
		 nombreCliente= pnombreCliente;
		 direccionCliente= pdireccionCliente;
		 itemspedido= new ArrayList<Producto>();
		 
	 }
	 public int getIdPedido() {
		 return idPedido;
	 }
	 public int getPrecioNetoPedido() {
		 int suma = 0;
		 for (int i=0; i < itemspedido.size();i++) {
			 suma += itemspedido.get(i).getPrecio();
		 }
		 return suma;
	 
	 }
	 public int getPrecioIVAPedido() {
			return (int) (getPrecioNetoPedido()*(0.19));
		
	 }
	 public int getPrecioTotal() {
		 return getPrecioNetoPedido() + getPrecioIVAPedido();
	 }
	 
	 public void agregarProducto(Producto nuevoItem) {
		 itemspedido.add(nuevoItem);
	 }
	 public String generarTextoFactura() {
		 String textoFactura= "idPedido: "+ idPedido + "\n nombreCliente: "+ nombreCliente + "\n direccionCliente: "+ direccionCliente;
		 for (int i=0; i < itemspedido.size();i++) {
			 textoFactura += itemspedido.get(i).generarTextoFactura();
		 }
		 textoFactura += "\n El precio neto es: "+ getPrecioNetoPedido() + "\n El IVA es: " + getPrecioIVAPedido()+ "\n EL precio total es: "+ getPrecioTotal(); 
		 return textoFactura;
		
	 }
}
