package br.com.felipex.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.felipex.dao.ClienteDao;
import br.com.felipex.dao.ClienteDaoImp;
import br.com.felipex.model.Cliente;

@ManagedBean
@SessionScoped
public class ClienteController {

	private Cliente cliente = new Cliente();
	private List<Cliente> clienteList;

	@PostConstruct
	public void init(){
		buscaCliente();
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String adicionarCliente() {
		ClienteDao dao = new ClienteDaoImp();
		dao.save(cliente);
		buscaCliente();
		return "paginaCliente";
	}
	
	public String buscaCliente(){
		clienteList = new ClienteDaoImp().list();
		return "paginaCliente";
	}

	
	public List<Cliente> getClienteList() {
		return clienteList;
	}

	public void setClienteList(List<Cliente> clienteList) {
		this.clienteList = clienteList;
	}
}

