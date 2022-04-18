package Model;

import java.util.Date;

public class Carrinho {

	private String dataCompra;
	private Float valorCarrinho;
	private Integer cliente;
	private Integer idCarrinho;
	private Integer idCliente;


	public int getIdCarrinho() {
		return idCarrinho;
	}

	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
	}

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer idCliente) {
		this.cliente = idCliente;
	}

	public String getDataCompra(Date dataCompra2) {
		return dataCompra;
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