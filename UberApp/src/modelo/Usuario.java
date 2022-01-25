
package modelo;

//Plantilla base para hacer herencia a las clases Cliente y Empleado

public class Usuario {
    private String nombre, apellido;
    private int telefono;
    private String fecha_nacimiento;
    private char sexo;
    private String correo_electronico;

    public Usuario(String nombre, String apellido, int telefono, String fecha_nacimiento, char sexo, String correo_electronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.correo_electronico = correo_electronico;
    }
    
    public Usuario(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", fecha_nacimiento=" + fecha_nacimiento + ", sexo=" + sexo + ", correo_electronico=" + correo_electronico + '}';
    }
    
    
}
