
package View;

import javax.swing.JOptionPane;

import Control.*;
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
					ClienteControl clienteDao = new ClienteControl();
					clienteDao.cadastarCliente(cliente, nome, cpf);

				} else if (operacao == 2) {

					JOptionPane.showMessageDialog(null,
							"Cliente: " + cliente.getNome() + "\n CPF: " + cliente.getCpf());

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
					produto.setNome(nome);
					produto.setCodigo(codigo);
					produto.setQuantidade(quantidade);
					if (nome == null || codigo == null || quantidade == null) {
						JOptionPane.showMessageDialog(null, "valores informados incorretamente");
						break;
					}
					ProdutoControl produtoDao = new ProdutoControl();
					produtoDao.cadastrarProduto(produto, nome, codigo, quantidade);

				} else if (operacao == 2) {

					JOptionPane.showMessageDialog(null, "Produto: " + produto.getNome() + "\n Cód: "
							+ produto.getCodigo() + "\n Quantidade: " + produto.getQuantidade());

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
					Integer idCliente = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Informe o código do cliente: "));
					carrinho.setCliente(idCliente);

					if (idCliente == null || carrinho == null) {
						JOptionPane.showMessageDialog(null, "valores informados incorretamente");
						break;
					}
					CarrinhoControl carrinhoDao = new CarrinhoControl();
					carrinhoDao.cadastrarCarrinho(carrinho, idCliente);

				} else if (operacao == 2) {

					JOptionPane.showMessageDialog(null,
							"Carrinho: " + carrinho.getIdCarrinho() + "\n Valor tota:" + carrinho.getValorCarrinho());
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
