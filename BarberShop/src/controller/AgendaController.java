package controller;

import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import controller.Helper.AgendaHelper;
import java.util.ArrayList;

public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        
        //buscar lista com agendamentos do banco de dados
        var agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //exibir essa lista na view
        helper.preencherTabela(agendamentos);
 
    }
    
    public void atualizaCliente(){
        
        // buscar clientes do banco de dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        // exibir cliente no combobox
        helper.preencherClientes(clientes);
        
    }
       
    public void atualizaServico(){
        
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
    
        helper.preencherServicos(servicos);
    }
    
    public void atualizaValor(){
        
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
        
    }
    
    public void agendar(){
        
        // Buscar objeto agendamento da tela
        Agendamento agendamento = helper.obterModelo();
        
        // salvar objeto no banco de dados
        new AgendamentoDAO().insert(agendamento);
        atualizaTabela();
        helper.limparTela();
    }
    
    
    
}
