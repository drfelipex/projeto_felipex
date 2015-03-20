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
@Table(name="produto")
public class Produto implements Serializable {
 
private static final long serialVersionUID = -7801223425534803070L;
private long idProduto;
private String nomeProduto;
private String precoProduto;

public Produto() {
}

@Id
@GeneratedValue
@Column(name="id_produto")
public long getIdProduto() {
	return idProduto;
}

public void setIdProduto(long idProduto) {
	this.idProduto = idProduto;
}

@Column(name="nome_produto")
public String getNomeProduto() {
	return nomeProduto;
}

public void setNomeProduto(String nomeProduto) {
	this.nomeProduto = nomeProduto;
}

@Column(name="preco_produto")
public String getPrecoProduto() {
	return precoProduto;
}

public void setPrecoProduto(String precoProduto) {
	this.precoProduto = precoProduto;
}


}

