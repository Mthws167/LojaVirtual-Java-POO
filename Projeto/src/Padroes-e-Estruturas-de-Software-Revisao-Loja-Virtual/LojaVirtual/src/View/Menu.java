
package View;

import javax.swing.JOptionPane;

import Dao.*;
import Model.*;

public class Menu {

	public static void main(String args[]) {
		int opcao, operacao;
		String option = JOptionPane.showInputDialog(null,
				"Bem vindo a loja virtual! \nSelecione a opção desejada: \n1-Cliente \n2-Produto \n3-Carrinho \n4-Sair");
		if (option == null) {
			JOptionPane.showMessageDialog(null, "Sistema Encerrado!");
			option = "0";
		}
		opcao = Integer.parseInt(option);

		Cliente cliente = new Cliente();
		Produto produto = new Produto();
		Carrinho carrinho = new Carrinho();

		while (opcao <= 4) {
			if (opcao == 1) {
				operacao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Escolha a operação que deja realizar: \n1-Cadastrar \n2-Listar \n3-Encerrar "));
				if (operacao == 1) {
					String nome = JOptionPane.showInputDialog(null, "Informe o nome do cliente: ");
					String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do cliente: ");
					cliente.setNome(nome);
					cliente.setCpf(cpf);
					if (nome == null || cpf == null) {
						JOptionPane.showMessageDialog(null, "valores informados incorretamente");
						break;
					}
					ClienteDao clienteDao = new ClienteDao();
					clienteDao.cadastarCliente(cliente);

				} else if (operacao == 2) {
					ClienteDao ClienteDaoList = new ClienteDao();
					for (Cliente cliente1 : ClienteDaoList.getAll()) {
						JOptionPane.showMessageDialog(null, cliente1);
					}
					break;

				} else if (operacao == 3) {
					JOptionPane.showMessageDialog(null, "Loja Encerrada!");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido!");
					break;
				}

			} else if (opcao == 2) {
				operacao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Escolha a operação que deja realizar: \n1-Cadastrar \n2-Listar \n3-Encerrar "));
				if (operacao == 1) {
					String nome = JOptionPane.showInputDialog(null, "Informe o nome do Produto: ");
					String codigo = JOptionPane.showInputDialog(null, "Informe o código do produto: ");
					String quantidade = JOptionPane.showInputDialog(null,
							"Informe a quantidade de produtos disponíveis: ");
					if (nome == null || codigo == null || quantidade == null) {
						JOptionPane.showMessageDialog(null, "valores informados incorretamente");
						break;
					}
					produto.setNome(nome);
					produto.setCodigo(Double.parseDouble(codigo));
					produto.setQuantidade(Integer.parseInt(quantidade));

					ProdutoDao produtoDao = new ProdutoDao();
					produtoDao.cadastrarProduto(produto);

				} else if (operacao == 2) {
					ProdutoDao produtoDaoList = new ProdutoDao();
					for (Produto produto1 : produtoDaoList.getAll()) {
						JOptionPane.showMessageDialog(null, "Produto: " + produto1.getNome());
					}

					break;

				} else if (operacao == 3) {
					JOptionPane.showMessageDialog(null, "Loja Encerrada!");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido!");
					break;
				}

			} else if (opcao == 3) {
				operacao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Escolha a operação que deja realizar: \n1-Cadastrar \n2-Listar \n3-Encerrar "));
				if (operacao == 1) {
					String codigoCliente = JOptionPane.showInputDialog(null, "Informe o código do cliente: ");
					String dataCompra = JOptionPane.showInputDialog(null, "Informe a data do carrinho: ");
					if (codigoCliente == null || dataCompra == null) {
						JOptionPane.showMessageDialog(null, "valores informados incorretamente");
						break;
					}
					carrinho.setIdCliente(Integer.parseInt(codigoCliente));
					carrinho.setDataCompra(dataCompra);
					CarrinhoDao carrinhoDao = new CarrinhoDao();
					CarrinhoDao.cadastrarCarrinho(carrinho);
					break;

				} else if (operacao == 2) {
					CarrinhoDao CarrinhoDaoList = new CarrinhoDao();
					for (Carrinho carrinho1 : CarrinhoDaoList.getAll()) {
						JOptionPane.showMessageDialog(null, "Carrinho: " + carrinho1.getIdCarrinho());
					}
					break;

				} else if (operacao == 3) {
					JOptionPane.showMessageDialog(null, "Loja Encerrada!");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido!");
					break;
				}

			} else if (opcao == 4) {
				JOptionPane.showMessageDialog(null, "Loja Encerrada!");
				break;
			}

		}

	}
	

}
