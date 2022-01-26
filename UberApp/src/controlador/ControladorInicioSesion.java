
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.UsuarioDAO;
import vista.InicioSesion;

public class ControladorInicioSesion implements ActionListener{
    UsuarioDAO objetoDAO = new UsuarioDAO();
    InicioSesion vista = new InicioSesion();
    
    //metodo constructor
    
    public ControladorInicioSesion(InicioSesion vista, UsuarioDAO dao){
        this.vista = vista;
        objetoDAO = dao;
    }
    
      
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
