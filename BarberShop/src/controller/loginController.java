package controller;

import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;
import controller.Helper.loginHelper;

public class loginController {

    private final Login view;
    private loginHelper helper;

    public loginController(Login view) {
        this.view = view;
        this.helper = new loginHelper(view);
    }
    
    public void entrarNoSistema(){
       
        // pesquisar o usuário da view
        Usuario usuario = helper.obterModelo();
        
        // pesquisar usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
            //navegar para menu principal 
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            //fechar tela de login
            this.view.dispose();
        } else {
            view.exibeMensagem("Usuário ou senha inválida.");
        }
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        this.view.exibeMensagem("Executei o FizTarefa");
    }
    
}
