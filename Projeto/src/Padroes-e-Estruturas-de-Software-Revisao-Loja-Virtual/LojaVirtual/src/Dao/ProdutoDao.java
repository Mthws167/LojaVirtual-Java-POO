package Dao;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import Model.Produto;

public class ProdutoDao {

	public void cadastrarProduto(Produto produto) {

		produto.getNome();
		produto.getCodigo();
		produto.getQuantidade();
		JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

	}

	public List<Produto> getAll() {
		List<Produto> produtos = new ArrayList<>();

		Produto produto = new Produto();
		produto.setIdProduto(produto.getIdProduto());
		produto.setNome(produto.getNome());
		produto.setCodigo(produto.getCodigo());
		produto.setQuantidade(produto.getQuantidade());
		produtos.add(produto);

		return null;
	}

}
