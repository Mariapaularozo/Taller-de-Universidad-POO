package EstadosClase;

public class CursoLleno extends Exception {
    public CursoLleno(String nombreCurso) {
        super("El curso '" + nombreCurso + "' ha alcanzado el máximo de 10 estudiantes.");
    }
}
