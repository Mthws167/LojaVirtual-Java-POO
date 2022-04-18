package Control;


import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import Model.Carrinho;

public class CarrinhoControl extends Model.Carrinho{
	private List<Carrinho> carrinhos = new ArrayList<>();
	Carrinho carrinho = new Carrinho();


	public void cadastrarCarrinho(Carrinho carrinho, Integer idCliente) {

		carrinho.setIdCarrinho(idCliente);
		carrinhos.add(carrinho);
		JOptionPane.showMessageDialog(null, "carrinho realizada com sucesso!");

	}

	public List<Carrinho> getAll() {

		carrinho.setIdCarrinho(carrinho.getIdCarrinho());
		carrinho.setIdCliente(carrinho.getIdCliente());
		carrinho.setValorCarrinho(carrinho.getValorCarrinho());
		carrinhos.add(carrinho);
		return carrinhos;

	}


}
