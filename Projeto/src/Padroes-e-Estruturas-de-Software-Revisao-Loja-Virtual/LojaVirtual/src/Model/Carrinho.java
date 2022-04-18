package Model;

import java.util.Date;

public class Carrinho {

	private String dataCompra;
	private Float valorCarrinho;
	private Cliente cliente;
	private int idCarrinho;
	private int idCliente;


	public int getIdCarrinho() {
		return idCarrinho;
	}

	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String string) {
		this.dataCompra = string;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Float getValorCarrinho() {
		return valorCarrinho;
	}

	public void setValorCarrinho(Float valorCarrinho) {
		this.valorCarrinho = valorCarrinho;
	}
	@Override
	public String toString() {

		return "Carrinho: \nR$"+valorCarrinho;
	}



}