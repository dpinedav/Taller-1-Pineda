package modelo;

import java.util.ArrayList;

public class Restaurante {
	private ArrayList<Combo> combos;
	private ArrayList<Pedido> pedidos;
	private Pedido pedidoEnCurso; 
	private ArrayList<Producto> menuBase;
	private ArrayList<Ingrediente> ingredientes;
	
	public Restaurante () {
		combos= new ArrayList<Combo>();
		pedidos= new ArrayList<Pedido>();
		menuBase= new ArrayList<Producto>();
		ingredientes= new ArrayList<Ingrediente>();
		pedidoEnCurso= null;
		
		
	}
	public ArrayList<Producto> getMenuBase(){
		return menuBase;
	
	}
	public ArrayList<Ingrediente> getIngredientes(){
		return ingredientes;
	}
	public Pedido getPedidoEnCurso(){
		return pedidoEnCurso;
	}
	public void IniciarPedido(String nombreCliente, String direccionCliente) {
		if( pedidoEnCurso==null) {
			pedidoEnCurso= new Pedido(pedidos.size(), nombreCliente, direccionCliente);
		}
				
	}
	public void cerrarYGuardarPedido() {
		if (pedidoEnCurso != null) {
			pedidos.add(getPedidoEnCurso());
			pedidoEnCurso=null;
		}
		
		
		
		
	}
}
