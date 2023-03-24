package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class Main {
    public static void main(String[] args){
        
        Servico servico = new Servico(1, "barba", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        System.out.println(servico.getClass());
        
        Cliente cliente = new Cliente(1, "Artur", "Rua do rio", "123459655");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(2, "Barbeiro", "senha");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "02/06/2023 08:00");
        System.out.println(agendamento.getCliente().getNome());
        
    }
}
