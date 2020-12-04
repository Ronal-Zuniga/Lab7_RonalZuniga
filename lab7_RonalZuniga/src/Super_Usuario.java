
public class Super_Usuario {

    private String nombre;
    private String apellido;
    private String usuario;
    private String contra;

    public Super_Usuario() {
    }

    public Super_Usuario(String nombre, String apellido, String usuario, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contra = contra;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return nombre + ", " + apellido + ", " + usuario + ", " + contra;
    }
    

}
