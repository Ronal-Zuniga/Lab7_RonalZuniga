
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JTable;

public class Compilador implements Serializable {

    private String nombre;
    private String creador;
    private int codigo;
    private ArrayList<Etapa> etapas = new ArrayList();
    private JTable simbolos;
    private JTable errores;
    private static final long SerialVersionUID = 555L;

    public Compilador() {
    }

    public Compilador(String nombre, String creador) {
        this.nombre = nombre;
        this.creador = creador;
    }

    public Compilador(String nombre, String creador, JTable simbolos, JTable errores) {
        this.nombre = nombre;
        this.creador = creador;
        this.simbolos = simbolos;
        this.errores = errores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        for (int i = 0; i < this.etapas.size(); i++) {
            this.codigo += this.etapas.get(i).getLineas();
        }
    }

    public ArrayList<Etapa> getEtapas() {
        return etapas;
    }

    public void setEtapas(ArrayList<Etapa> etapas) {
        this.etapas = etapas;
    }

    public JTable getSimbolos() {
        return simbolos;
    }

    public void setSimbolos(JTable simbolos) {
        this.simbolos = simbolos;
    }

    public JTable getErrores() {
        return errores;
    }

    public void setErrores(JTable errores) {
        this.errores = errores;
    }

    @Override
    public String toString() {
        return "Compilador{" + "nombre=" + nombre + ", creador=" + creador + ", codigo=" + codigo + ", etapas=" + etapas + ", simbolos=" + simbolos + ", errores=" + errores + '}';
    }

}
