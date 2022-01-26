
package modelo;
import controlador.ControladorInicioSesion;
import vista.InicioSesion;

public class GestorApp {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        InicioSesion is = new InicioSesion();
        UsuarioDAO dao = new UsuarioDAO();
        ControladorInicioSesion c = new ControladorInicioSesion(is,dao);
        //Titulo a las interfaz gráfica principal
        is.setTitle("Bienvenido");
        is.setVisible(true);
        is.setLocationRelativeTo(null);
    }

   
}
