package Control;

import Model.Cliente;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ClienteControl extends Model.Cliente {
	private List<Cliente> clientes = new ArrayList<>();
	Cliente cliente = new Cliente();

	public void cadastarCliente(Cliente cliente, String nome, String cpf) {
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		clientes.add(cliente);
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");

	}

	public List<Cliente> getAll() {
		
		cliente.setIdCliente(cliente.getIdCliente());
		cliente.setNome(cliente.getNome());
		cliente.setCpf(cliente.getCpf());
		clientes.add(cliente);
		return clientes;

	}

}
