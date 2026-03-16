package Clase;

import EstadosClase.CursoLleno;
import EstadosClase.CursoMinimo;
import Personas_David_Botero.Estudiante;

public class Curso {
        private String nombre;
        private String codigo;
        private String prerequisito;
        private static final int CAPACIDAD_MAXIMA = 10;
        private static final int MINIMO_ESTUDIANTES = 5;

        private Estudiante[] estudiantes;
        private int totalEstudiantes;

        public Curso(String codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.estudiantes = new Estudiante[CAPACIDAD_MAXIMA];
            this.totalEstudiantes = 0;
        }

    public String getNombre() { return nombre; }

        public void matricularEstudiante(Estudiante estudiante) throws CursoLleno {
            if (totalEstudiantes >= CAPACIDAD_MAXIMA) {
                throw new CursoLleno(nombre);
            }
            estudiantes[totalEstudiantes] = estudiante;
            totalEstudiantes++;
        }

        public void verificarApertura() throws CursoMinimo {
            if (totalEstudiantes < MINIMO_ESTUDIANTES) {
                throw new CursoMinimo(nombre, totalEstudiantes);
            }
        }

        public int getCuposDisponibles() {
            return CAPACIDAD_MAXIMA - totalEstudiantes;
        }

        public int getTotalEstudiantes() {
            return totalEstudiantes;
        }

        @Override
        public String toString() {
            return "Curso{codigo='" + codigo + "', nombre='" + nombre
                    + "', cupos=" + getCuposDisponibles() + "/" + CAPACIDAD_MAXIMA + "}";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Curso)) return false;
            Curso otro = (Curso) obj;
            return this.codigo.equals(otro.codigo);
        }

        @Override
        public int hashCode() {
            return codigo.hashCode();
        }

    public String getPrerequisito() { return prerequisito;}
}

