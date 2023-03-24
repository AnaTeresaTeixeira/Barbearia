package controller;

import View.Agenda;
import View.MenuPrincipal;

public class MenuPrincipalController {
    
    private final MenuPrincipal View;

    public MenuPrincipalController(MenuPrincipal View) {
        this.View = View;
    }

    public void navegarParaAgenda(){
        
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
    
}
