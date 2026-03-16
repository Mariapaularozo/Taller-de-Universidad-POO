package Interfaces;

import Personas_David_Botero.Estudiante;
import EstadosClase.CursoLleno;

public interface matriculable {
    void matricularEstudiante(Estudiante estudiante) throws CursoLleno;
}
