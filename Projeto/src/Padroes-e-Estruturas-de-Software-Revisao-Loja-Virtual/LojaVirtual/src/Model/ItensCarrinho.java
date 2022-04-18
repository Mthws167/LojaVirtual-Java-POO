package Model;

public class ItensCarrinho {

	private Carrinho carrinho;
	private Carrinho idCarrinho;
	private Produto produto;
	private Integer quantidade;
	private Double valorUnitario;
	private int idItensCarrinho;

	public int getIdItensCarrinho() {
		return idItensCarrinho;
	}

	public void setIdItensCarrinho(int idItensCarrinho) {
		this.idItensCarrinho = idItensCarrinho;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Carrinho getIdCarrinho() {
		return idCarrinho;
	}

	public void setIdCarrinho(Carrinho idCarrinho) {
		this.idCarrinho = idCarrinho;
	}

}