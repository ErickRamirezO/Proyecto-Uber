
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.UsuarioDAO;
import vista.FormularioInicioSesion;
import vista.InicioSesion;

public class ControladorFormularioInicioSesion implements ActionListener {
    UsuarioDAO objetoDAO = new UsuarioDAO();
    InicioSesion vistainicio = new InicioSesion();
    FormularioInicioSesion vista = new FormularioInicioSesion(vistainicio,true);
    
    //metodo constructor
    
    public ControladorFormularioInicioSesion(FormularioInicioSesion vista, UsuarioDAO dao){
        this.vista = vista;
        objetoDAO = dao;
    }
    
    public ControladorFormularioInicioSesion(FormularioInicioSesion vista){
//        this.vista = vista;
//        vista.getIniciar().addActionListener(this);
    }
   
      
    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==vista.btnIniciar){
//            String user = vista.getUsuario().getText();
//            String password = new String(vista.getContrasena().getPassword());
//            if(user.trim().length()<=0 && password.trim().length()<=0){
//                mostrarMensaje("Ingresa tu usuario y contraseña");
//            }else if(user.trim().length()<=0){
//                mostrarMensaje("Ingresa tu usuario");
//            }else if(password.trim().length()<=0){
//                mostrarMensaje("Ingresa tu usuario");
//            }
//        }
    }
}
