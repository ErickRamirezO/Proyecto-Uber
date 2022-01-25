
package modelo;

//Herencia de la Clase Usuario
enum Habilidades{lavado_y_planchado, limpieza, cocina}

public class Empleado extends Usuario {
    private int cedula;
    private String nombre_usuario;
    private int otro_numero;
    private Habilidades habilidades;
    private String calle_principal, calle_secundaria,numeracion_domicilio;
    private String contraseña;

    public Empleado(int cedula, String nombre_usuario, int otro_numero, Habilidades habilidades, String calle_principal, String calle_secundaria, String numeracion_domicilio, String contraseña, String nombre, String apellido, int telefono, String fecha_nacimiento, char sexo, String correo_electronico) {
        super(nombre, apellido, telefono, fecha_nacimiento, sexo, correo_electronico);
        this.cedula = cedula;
        this.nombre_usuario = nombre_usuario;
        this.otro_numero = otro_numero;
        this.habilidades = habilidades;
        this.calle_principal = calle_principal;
        this.calle_secundaria = calle_secundaria;
        this.numeracion_domicilio = numeracion_domicilio;
        this.contraseña = contraseña;
    }

   
    public Empleado(){
    
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getOtro_numero() {
        return otro_numero;
    }

    public void setOtro_numero(int otro_numero) {
        this.otro_numero = otro_numero;
    }

    public Habilidades getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidades habilidades) {
        this.habilidades = habilidades;
    }

    public String getCalle_principal() {
        return calle_principal;
    }

    public void setCalle_principal(String calle_principal) {
        this.calle_principal = calle_principal;
    }

    public String getCalle_secundaria() {
        return calle_secundaria;
    }

    public void setCalle_secundaria(String calle_secundaria) {
        this.calle_secundaria = calle_secundaria;
    }

    public String getNumeracion_domicilio() {
        return numeracion_domicilio;
    }

    public void setNumeracion_domicilio(String numeracion_domicilio) {
        this.numeracion_domicilio = numeracion_domicilio;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Empleado" + "Número de cédula=" + cedula + ", nombre_usuario=" + nombre_usuario + ", otro número=" + otro_numero + ", habilidades=" + habilidades + ", calle_principal=" + calle_principal + ", calle_secundaria=" + calle_secundaria + ", numeracion_domicilio=" + numeracion_domicilio + ", contrase\u00f1a=" + contraseña + '}';
    }

    
    
    
    
    
    
    
}
