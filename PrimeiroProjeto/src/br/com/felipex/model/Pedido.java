package br.com.felipex.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private List <Produto> produto;
	
	
	public Pedido()
	{
		this.produto = new ArrayList <Produto>();
	}
	public List <Produto> getProdutos() {
		return produto;
	}

	public void setProdutos(List<Produto>produto){
		this.produto = produto;
	}
}
