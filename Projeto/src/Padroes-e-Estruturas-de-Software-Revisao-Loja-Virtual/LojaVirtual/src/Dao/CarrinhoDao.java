package Dao;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import Model.Carrinho;

public class CarrinhoDao {
	Carrinho carrinho = new Carrinho();
	List<Carrinho> carrinhos = new ArrayList<>();
	
	public static void cadastrarCarrinho(Carrinho carrinho) {

		carrinho.getIdCliente();
		carrinho.getDataCompra();
		JOptionPane.showMessageDialog(null, "carrinho realizada com sucesso!");

	}

	public List<Carrinho> getAll() {
		

		Carrinho carrinho = new Carrinho();
		carrinho.setIdCarrinho(Integer.parseInt("idcarrinho"));
		carrinho.setIdCliente(Integer.parseInt("codigo_cliente"));
		carrinho.setValorCarrinho(Float.parseFloat("valor"));
		carrinho.getDataCompra();
		carrinhos.add(carrinho);
		return carrinhos;

	}

}
