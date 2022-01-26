package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cliente;
import modelo.Empleado;
import modelo.UsuarioDAO;
import vista.FormularioRegistro;
import vista.InicioSesion;

public class ControladorFormularioRegistro implements ActionListener {

    UsuarioDAO dao = new UsuarioDAO();
    InicioSesion vistainicio = new InicioSesion();
    FormularioRegistro vista = new FormularioRegistro(vistainicio, true);

    //metodo constructor
    public ControladorFormularioRegistro(FormularioRegistro vista, UsuarioDAO dao) {
        this.vista = vista;
        this.dao = dao;
        vista.abtnAceptar.addActionListener(this);
        vista.btnTerminarRegistro.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnTerminarRegistro) {
            if (vista.aradioCliente.isSelected()) {
                String nombre = vista.btxtNombre.getText();
                String apellido = vista.btxtApellido.getText();
                int telefono = Integer.parseInt(vista.btxtTelefono.getText());
                String correoElectronico = vista.btxtCorreo.getText();
                String password = new String(vista.btxtPassword.getPassword());
                String password2 = new String(vista.btxtPassword2.getPassword());
                if (password.trim().length() <= 0 && password.trim().length() <= 0) {
                    dao.mostrarMensaje("Ingresa tu usuario y contraseña");
                } else if (password.trim().length() <= 0) {
                    dao.mostrarMensaje("Ingresa una contraseña");
                    vista.btxtPassword.requestFocus();
                } else if (password2.trim().length() <= 0) {
                    dao.mostrarMensaje("Confirma tu contraseña");
                    vista.btxtPassword2.requestFocus();
                }
                if (vista.bradioMasculino.isSelected()) {
                    char sexo = 'M';
                    Cliente cliente = new Cliente(password, nombre, apellido, telefono, "", sexo, correoElectronico);
                    dao.insertarCliente(cliente);
                } else {
                    Cliente cliente = new Cliente(password, nombre, apellido, telefono, "", 'F', correoElectronico);
                    dao.insertarCliente(cliente);
                }
            } else {
                String nombre = vista.btxtNombre.getText();
                String apellido = vista.btxtApellido.getText();
                int telefono = Integer.parseInt(vista.btxtTelefono.getText());
                String correoElectronico = vista.btxtCorreo.getText();
                String password = new String(vista.btxtPassword.getPassword());
                String password2 = new String(vista.btxtPassword2.getPassword());
                if (password.trim().length() <= 0 && password.trim().length() <= 0) {
                    dao.mostrarMensaje("Ingresa tu usuario y contraseña");
                } else if (password.trim().length() <= 0) {
                    dao.mostrarMensaje("Ingresa una contraseña");
                    vista.btxtPassword.requestFocus();
                } else if (password2.trim().length() <= 0) {
                    dao.mostrarMensaje("Confirma tu contraseña");
                    vista.btxtPassword2.requestFocus();
                }
                String habilidad;
                char sexo;
                int cedula = Integer.parseInt(vista.ctxtCedula.getText());
                String nombreUsuario = vista.ctxtNombreUsuario.getText();
                int telefono_2 = Integer.parseInt(vista.txtOtroTelefono.getText());
                String itemSeleccionado = (String) vista.cjboxHabilidades.getSelectedItem();
                String callePrincipal = vista.ctxtCallePrincipal.getText();
                String calleSecundaria = vista.ctxtCalleSecundaria.getText();
                String numeracion = vista.ctxtNumeracion.getText();
                if ("Lavado y planchado".equals(itemSeleccionado))  {
                    habilidad = "Lavado y Planchado";
                }else if("Limpieza".equals(itemSeleccionado)){
                    habilidad = "Limpieza";
                }else{
                    habilidad = "Cocina";
                }
                if (vista.bradioMasculino.isSelected()) {
                    sexo = 'M';
                } else {
                    sexo = 'F';
                }
                Empleado empleado = new Empleado(cedula, nombreUsuario, telefono_2, habilidad, callePrincipal, calleSecundaria, numeracion, password,nombre,apellido,telefono,"",sexo,correoElectronico);
                dao.insertarEmpleado(empleado);
            }

        }
    }
}
