package Dao;

import Model.Cliente;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao extends Model.Cliente {

	public void cadastarCliente(Cliente cliente) {
		cliente.setNome(cliente.getNome());
		cliente.setCpf(cliente.getCpf());
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");

	}

	public List<Cliente> getAll() {
		List<Cliente> clientes = new ArrayList<>();
		Cliente cliente = new Cliente();

		cliente.setIdCliente(cliente.getIdCliente());
		cliente.setNome(cliente.getNome());
		cliente.setCpf(cliente.getCpf());
		clientes.add(cliente);
		return clientes;

	}
}
