
package modelo;

public class Cliente extends Usuario{
    private String contraseña;

    public Cliente(String contraseña, String nombre, String apellido, int telefono, String fecha_nacimiento, char sexo, String correo_electronico) {
        super(nombre, apellido, telefono, fecha_nacimiento, sexo, correo_electronico);
        this.contraseña = contraseña;
    }

    public Cliente(){
    
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Cliente{"+ super.toString() + "contraseña=" + contraseña + '}';
    }
    
    
    
    
}
