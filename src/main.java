import Clase.Curso;
import EstadosClase.CursoLleno;
import EstadosClase.CursoMinimo;
import Personas_David_Botero.Profesor;
import Personas_David_Botero.Estudiante;

public class Main {
    public static void main(String[] args) {

         //CURSO (mp)
        System.out.println(" CURSO CREADO ");
        Curso matematicas = new Curso("MAT01", "Matemáticas");
        System.out.println(matematicas);

        // Clase Utilitaria
        System.out.println(" \n VALIDACION DE DATOS");
        System.out.println("ID 1 valido: " + Utilidades.idValido(1));
        System.out.println("ID -5 valido: " + Utilidades.idValido(-5));
        System.out.println("Nombre 'Juan' valido: " + Utilidades.nombreValido("Juan"));
        System.out.println("Nombre vacio valido: " + Utilidades.nombreValido(""));

        // Matricula (mp)
        System.out.println(" \n MATRICULA ESTUDIANTES");
        Estudiante juan = new Estudiante(1, "Juan", 20);
        Estudiante maria = new Estudiante(2, "María", 19);

        try {
            matematicas.matricularEstudiante(juan);
            matematicas.matricularEstudiante(maria);
            System.out.println("Matricula exitosa!");
            System.out.println("Cupos disponibles: " + matematicas.getCuposDisponibles());
        } catch (CursoLleno e) {
            System.out.println("Error: " + e.getMessage());
        }

        //  Pre-requisitos (susi)
        System.out.println(" \n PREREQUISITOS ");

        // Usamos otro Estudiante para prerequisitos
        pre_requisitos.Estudiante Sofia = new pre_requisitos.Estudiante(
                "Sofia", new String[]{"Geometría", "Cálculo Diferencial"}, 4.5
        );
        if (Sofia.puedeInscribirse(matematicas)) {
            System.out.println(Sofia.getNombre() + " SI puede inscribirse");
        } else {
            System.out.println(Sofia.getNombre() + " NO cumple prerequisitos");
        }

// Notas (susi)
        System.out.println(" \n VERIFICANDO NOTAS ");
        Sofia.verificarNota();
        pre_requisitos.Estudiante pedro = new pre_requisitos.Estudiante(
                "Pedro", new String[]{"Geometría"}, 1.5
        );
        pedro.verificarNota();

        // Apertura del curso (min 5 estudiantes) (mp)
        System.out.println(" \n APERTURA DEL CURSO (minimo 5 estudiantes)");
        try {
            matematicas.verificarApertura();
            System.out.println("El curso puede abrirse!");
        } catch (CursoMinimo e) {
            System.out.println("Error: " + e.getMessage());
        }

        //  Sobrecupo (max 10 estudiantes) (mp)
        System.out.println(" \n INTENTANDO SOBRECUPO");
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
        System.out.println("\n PROFESORES ");
        Profesor profe1 = new Profesor(100, "Andrea Mesa", 38, "Matemáticas");
        System.out.println(profe1);
    }
}