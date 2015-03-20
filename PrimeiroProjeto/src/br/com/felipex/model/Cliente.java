package br.com.felipex.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
/**
*
* @author Felipe A.correa
*/
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
 
private static final long serialVersionUID = -7801223425534803070L;
private long idCliente;
private String nomeCliente;
private String emailCliente;
private String telefoneCliente;
private String enderecoCliente;

public Cliente() {
}

@Id
@GeneratedValue
@Column(name="id_cliente")
public long getIdCliente() {
	return idCliente;
}

public void setIdCliente(long idCliente) {
	this.idCliente = idCliente;
}

@Column(name="nome_cliente")
public String getNomeCliente() {
	return nomeCliente;
}

public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}

@Column(name="email_cliente")
public String getEmailCliente() {
	return emailCliente;
}

public void setEmailCliente(String emailCliente) {
	this.emailCliente = emailCliente;
}

@Column(name="telefone_cliente")
public String getTelefoneCliente() {
	return telefoneCliente;
}

public void setTelefoneCliente(String telefoneCliente) {
	this.telefoneCliente = telefoneCliente;
}

@Column(name="endereco_cliente")
public String getEnderecoCliente() {
	return enderecoCliente;
}

public void setEnderecoCliente(String enderecoCliente) {
	this.enderecoCliente = enderecoCliente;
}



}

