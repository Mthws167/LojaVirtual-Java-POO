package Model;

public class Produto {

	private String nome;
	private String codigo;
	private String quantidade;
	private Integer idProduto;

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String quantidade) {
		this.codigo = quantidade;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String codigo) {
		this.quantidade = codigo;
	}@Override
	public String toString() {

		return "Produto: "+ nome +"\n Quantidade: "+quantidade;
	}


}