package Control;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import Model.Produto;

public class ProdutoControl extends Model.Produto{
	private List<Produto> produtos = new ArrayList<>();
	Produto produto = new Produto();

	public void cadastrarProduto(Produto produto, String nome, String codigo, String quantidade) {

		produto.setNome(nome);
		produto.setCodigo(quantidade);
		produto.setQuantidade(codigo);
		produtos.add(produto);
		JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

	}

	public List<Produto> getAll() {
		
		produto.setIdProduto(produto.getIdProduto());
		produto.setNome(produto.getNome());
		produto.setCodigo(produto.getCodigo());
		produto.setQuantidade(produto.getQuantidade());
		produtos.add(produto);
		return produtos;
	}

}
