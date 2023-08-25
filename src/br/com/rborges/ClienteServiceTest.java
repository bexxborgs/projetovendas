package br.com.rborges;

import br.com.rborges.dao.ClienteDaoMock;
import br.com.rborges.dao.IClienteDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import br.com.rborges.domain.Cliente;
import br.com.rborges.services.ClienteService;
import br.com.rborges.services.IClienteService;

/**
 * @author Rebeca
 */

public class ClienteTest  {
    private IClienteService clienteService;

    private Cliente cliente;
    public ClienteTest () {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }
    @Before
    public void init (){
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Rebeca");
        cliente.setCidade("Belem");
        cliente.setEnd("End");
        cliente.setEstado("PA");
        cliente.setNumero(01);
        cliente.setTel(40028922L);
        clienteService.salvar(cliente);
    }
    @Test
    public void pesquisarCliente () {

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);

    }
}
