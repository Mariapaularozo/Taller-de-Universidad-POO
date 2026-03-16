package EstadosClase;

public class CursoMinimo extends Exception {
    public CursoMinimo(String nombreCurso, int actuales) {
        super("El curso '" + nombreCurso + "' no puede abrirse: tiene "
                + actuales + " estudiantes, mínimo requerido es 5.");
    }
}
