package controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class AgendaHelper implements IHelper {
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
      
        DefaultTableModel tableModel = (DefaultTableModel) view.getTable().getModel();
        tableModel.setNumRows(0);
        
        // percorrer a lista preenchendo o tableModel
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
                    
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            
            });
            
        }
                
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
       
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
        
        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente);
        
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
       
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }

    public Cliente obterCliente() {
        return (Cliente) view.getjComboBoxCliente().getSelectedItem(); 
    }
    
    public Servico obterServico() {
        return (Servico) view.getjComboBoxServico().getSelectedItem(); 
    }

    public void setarValor(float valor) {
      
        view.getTextValor().setText(valor + "");
            
    }

    @Override
    public Agendamento obterModelo() {
        
        String idString = view.getTextId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getFormattedTextData().getText();
        String hora = view.getFormattedTextHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getjTextArea().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
        
        //new Agendamento();
    }

    @Override
    public void limparTela() {
         view.getTextId().setText("0");
         view.getFormattedTextData().setText("");
         view.getFormattedTextHora().setText("");
         view.getjTextArea().setText("");
    }
    
    
}
