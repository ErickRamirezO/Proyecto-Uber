package modelo;

import com.mongodb.BasicDBObject;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class UsuarioDAO {
    
    public void insertarCliente(Cliente cliente){
        Conexion conexion = new Conexion();
        BasicDBObject documento = new BasicDBObject();
        documento.put("nombre", cliente.getNombre());
        documento.put("apellido", cliente.getApellido());
        documento.put("telefono", cliente.getTelefono());
        documento.put("fecha-nacimiento", cliente.getFecha_nacimiento());
        documento.put("sexo", cliente.getSexo());
        documento.put("correo-electronico", cliente.getCorreo_electronico());
        documento.put("contraseña", cliente.getContraseña());
        conexion.coleccion.insert(documento);
    }
    public void insertarEmpleado(Empleado empleado){
        Conexion conexion = new Conexion();
        BasicDBObject documento = new BasicDBObject();
        documento.put("nombre", empleado.getNombre());
        documento.put("apellido", empleado.getApellido());
        documento.put("telefono", empleado.getTelefono());
        documento.put("Otro telefono", empleado.getOtro_numero());
        documento.put("fecha-nacimiento", empleado.getFecha_nacimiento());
        documento.put("sexo", empleado.getSexo());
        documento.put("correo-electronico", empleado.getCorreo_electronico());
        documento.put("contraseña", empleado.getContraseña());
        documento.put("nombre de usuario", empleado.getNombre_usuario());
        documento.put("habilidad", empleado.getHabilidades());
        documento.put("cedula", empleado.getCedula());
        documento.put("Calle Principal", empleado.getCalle_principal());
        documento.put("Calle Secundaria", empleado.getCalle_secundaria()+" - "+empleado.getNumeracion_domicilio());
        conexion.coleccion2.insert(documento);
    }
 
    public void obtenerUsuario(){

    }
    
    public void eliminarUsuario(String nombre){

    }
    
    public void buscarUsuario(String nombre, int fila){

    }
    
    public void modificarEmpleado(){

    }
    
    public void modificarCliente(){
    
    }
    
    //Metodo para mostrar mensajes de aviso
    public void mostrarMensaje(String mensaje){
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
