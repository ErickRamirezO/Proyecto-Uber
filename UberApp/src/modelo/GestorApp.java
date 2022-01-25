
package modelo;
import vista.InicioSesion;

public class GestorApp {

    public static void main(String[] args) {
        InicioSesion is = new InicioSesion();
        //Titulos a las interfaces gráficas
        is.setTitle("Bienvenido");
        is.setVisible(true);
        is.setLocationRelativeTo(null);
    }

   
}
