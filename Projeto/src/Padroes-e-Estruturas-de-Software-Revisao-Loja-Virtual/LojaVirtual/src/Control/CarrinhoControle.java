package Control;

import java.util.ArrayList;
import java.util.List;
import Model.Carrinho;
import Model.ItensCarrinho;
import Model.Produto;

public class CarrinhoControle {

	private List<ItensCarrinho> carrinhoItens = new ArrayList<ItensCarrinho>();

	public void adicionarItem(Carrinho carrinho, Produto produto, Double valorUnitario, String quantidade) {

		ItensCarrinho itens = new ItensCarrinho();
		itens.setCarrinho(carrinho);
		itens.setProduto(produto);
		itens.setQuantidade(Integer.parseInt(quantidade));
		itens.setValorUnitario(valorUnitario);
		carrinhoItens.add(itens);

	}

	public void removerItem() {
		
		ItensCarrinho itens = new ItensCarrinho();
		itens.getCarrinho();
		itens.getProduto();
		itens.getQuantidade();
		itens.getValorUnitario();
		carrinhoItens.remove(itens);
	}
	

	@Override
	public String toString() {
		String resultado="";
		for(int i=0; i<carrinhoItens.size();i++) {
			resultado = "Produto: \n"+carrinhoItens.get(i).getProduto().getNome()+"\n"
					+"Preço: \n"+"R$ "+carrinhoItens.get(i).getValorUnitario()+"\n"
					+"Quantidade: \n"+carrinhoItens.get(i).getQuantidade()+" sobrando"+"\n";
		}
		return resultado;
	}
}