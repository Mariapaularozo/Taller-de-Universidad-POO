package EstadosClase;

public class CursoLleno {
        public CursoLlenoException(String nombreCurso) {
            super("El curso '" + nombreCurso + "' ha alcanzado el máximo de 10 estudiantes.");
        }
    }
}
