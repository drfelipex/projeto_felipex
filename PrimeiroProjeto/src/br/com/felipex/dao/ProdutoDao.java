package br.com.felipex.dao;

import java.util.List;

import br.com.felipex.model.Produto;

/**
*
* @author Felipe A. Correa
*/

public interface ProdutoDao {
	
	public void save(Produto produto);
	public Produto getProduto(long id);
	public List<Produto> list();
	public void remove(Produto produto);
	public void update(Produto produto);

}
