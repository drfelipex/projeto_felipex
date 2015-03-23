package br.com.felipex.controller;
import br.com.felipex.model.Produto;
import br.com.felipex.model.Pedido;

public class PedidoController {
	
	private Produto produto;
	private Pedido pedido;
	
	public PedidoController()
	{
		this.pedido = new Pedido();
		
	}
	
	public void novoProduto()
	{
		this.produto = new Produto ();
		
	}
	
	public Produto getProduto() {
	
		return produto;
		
		
	}
	
	public  void setProduto(Produto produto){
		this.produto = produto;
		
	}
	
	public Pedido getPedido(){
		return pedido;
	}
	
	public void setPedido (Pedido pedido) {
		this.pedido = pedido;
	
	
		
	}
}
