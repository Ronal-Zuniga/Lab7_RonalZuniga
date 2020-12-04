
public class Etapa {
    //codigo, descripcion fase
    private int lineas;
    private String descripcion;
    private String fase;

    public Etapa() {
    }

    public Etapa(int lineas, String descripcion, String fase) {
        this.lineas = lineas;
        this.descripcion = descripcion;
        this.fase = fase;
    }

    public int getLineas() {
        return lineas;
    }

    public void setLineas(int lineas) {
        this.lineas = lineas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion.equals("Análisis Léxico") || descripcion.equals("Análisis Sintáctico") || descripcion.equals("Análisis Semántico") 
            || descripcion.equals("Generación de código intermedio") || descripcion.equals("optimizador de código")|| descripcion.equals("generador de código")) {
            this.descripcion = descripcion;
        }
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        if (descripcion.equals("Análisis Léxico") || descripcion.equals("Análisis Sintáctico") || descripcion.equals("Análisis Semántico")){
            fase = "Fase de Análisis";
        }
        if (descripcion.equals("Generación de código intermedio") || descripcion.equals("optimizador de código")|| descripcion.equals("generador de código")) {
            fase = "Fase de Síntesis";
        }
        this.fase = fase;
    }

    @Override
    public String toString() {
        return lineas + ", " + descripcion + ", " + fase;
    }
    
    
}
