package EstadosClase;

public class CursoMinimo {
        public CursoSinMinimoException(String nombreCurso, int actuales) {
            super("El curso '" + nombreCurso + "' no puede abrirse: tiene "
                    + actuales + " estudiantes, mínimo requerido es 5.");
        }
    }
}
