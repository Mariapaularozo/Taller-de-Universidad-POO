package pre_requisitos;
import Clase.Curso;

public class Estudiante {
    private String nombre;
    private String[] materiasAprobadas;
    private double notaFinal;

    public Estudiante(String nombre, String[] materiasAprobadas, double notaFinal) {
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
        this.notaFinal = notaFinal;
    }

    public String getNombre() { return nombre; }
    public double getNotaFinal() { return notaFinal; }

    public boolean puedeInscribirse(Curso curso) {
        for (int i = 0; i < materiasAprobadas.length; i++) {
            if (materiasAprobadas[i].equals(curso.getPrerequisito())) {
                return true;
            }
        }
        return false;
    }

    public void verificarNota() {
        if (notaFinal < 2) {
            System.out.println(nombre + " reprobó por ley del dos. Nota: " + notaFinal);
        } else {
            System.out.println(nombre + " aprobó el curso. Nota: " + notaFinal);
        }
    }
}
