package br.com.felipex.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.felipex.dao.ProdutoDao;
import br.com.felipex.dao.ProdutoDaoImp;
import br.com.felipex.model.Produto;

@ManagedBean
@SessionScoped
public class ProdutoController {

	private Produto produto = new Produto();
	private List<Produto> produtoList;

	@PostConstruct
	public void init(){
		buscaProduto();
	}
	

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String adicionarProduto() {
		ProdutoDao dao = new ProdutoDaoImp();
		dao.save(produto);
		buscaProduto();
		return "manterCliente";
	}
	
	public String buscaProduto(){
		produtoList = new ProdutoDaoImp().list();
		return "manterCliente";
	}

	
	public List<Produto> getProdutoList() {
		return produtoList;
	}

	public void setProdutoList(List<Produto> produtoList) {
		this.produtoList = produtoList;
	}
}

