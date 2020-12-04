public class Usuarios extends Super_Usuario{
    
    private double nota;

    public Usuarios() {
        super();
    }

    public Usuarios(String nombre, String apellido, String usuario, String contra) {
        super(nombre, apellido, usuario, contra);
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString()+ ", " + nota;
    }
    
    

    
    
}
