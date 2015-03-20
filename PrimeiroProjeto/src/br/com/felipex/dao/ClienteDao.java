package br.com.felipex.dao;

import java.util.List;

import br.com.felipex.model.Cliente;

/**
*
* @author Felipe A. Correa
*/

public interface ClienteDao {
	
	public void save(Cliente cliente);
	public Cliente getCliente(long id);
	public List<Cliente> list();
	public void remove(Cliente cliente);
	public void update(Cliente cliente);

}
