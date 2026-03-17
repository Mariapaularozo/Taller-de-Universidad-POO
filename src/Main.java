import Clase.Curso;
import EstadosClase.CursoLleno;
import EstadosClase.CursoMinimo;
import Personas_David_Botero.Profesor;
import Personas_David_Botero.Estudiante;

public class Main {
    public static void main(String[] args) {

        //Clase utilitaria (mp)
        System.out.println(" VALIDACION DE DATOS ");
        System.out.println("ID 1 valido: " + Utilidades.idValido(1));
        System.out.println("ID -5 valido: " + Utilidades.idValido(-5));
        System.out.println("Nombre 'Juan' valido: " + Utilidades.nombreValido("Juan"));
        System.out.println("Nombre vacio valido: " + Utilidades.nombreValido(""));

        // Curso (mp)
        System.out.println("\n CURSO");
        Curso matematicas = new Curso("MAT01", "Matematicas");
        System.out.println(matematicas);

        // matricula (susana, david, mp)
        System.out.println("\n MATRICULA");
        Estudiante juan = new Estudiante(1, "Juan", 20);
        Estudiante maria = new Estudiante(2, "Maria", 19);

        try {
            matematicas.matricularEstudiante(juan);
            matematicas.matricularEstudiante(maria);
            System.out.println("Matricula exitosa!");
            System.out.println("Cupos disponibles: " + matematicas.getCuposDisponibles());
        } catch (CursoLleno e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Pre-requisitos (susana)
        System.out.println("\n PRE-REQUISITOS");
        pre_requisitos.Estudiante susana = new pre_requisitos.Estudiante(
                "Susana", new String[]{"Geometria", "Calculo Diferencial"}, 4.5
        );
        if (susana.puedeInscribirse(matematicas)) {
            System.out.println(susana.getNombre() + " SI puede inscribirse");
        } else {
            System.out.println(susana.getNombre() + " NO cumple prerequisitos");
        }

        //Notas (susana)
        System.out.println("\n VERIFICAR NOTAS");
        susana.verificarNota();
        pre_requisitos.Estudiante pedro = new pre_requisitos.Estudiante(
                "Pedro", new String[]{"Geometria"}, 1.5
        );
        pedro.verificarNota();

        // MIN 5 estudiantes (mp)
        System.out.println("\n ABRIR CURSO");
        try {
            matematicas.verificarApertura();
            System.out.println("El curso puede abrirse!");
        } catch (CursoMinimo e) {
            System.out.println("Error: " + e.getMessage());
        }

        // MAX 10 estudiantes)
        System.out.println("\n SOBRECUPO");
        try {
            for (int i = 3; i <= 12; i++) {
                Estudiante extra = new Estudiante(i, "Estudiante" + i, 18);
                matematicas.matricularEstudiante(extra);
                System.out.println("Matriculado estudiante " + i);
            }
        } catch (CursoLleno e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Profesores (David)
        System.out.println("\n Profesores");
        Profesor profe1 = new Profesor(100, "Andrea Mesa", 38, "Matematicas");
        System.out.println(profe1);
    }
}