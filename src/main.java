public class main {
    import Clase.Curso;
import Clase.Estudiante;
import EstadosClase.CursoLleno;
import EstadosClase.CursoMinimo;

    public class main {
        public static void main(String[] args) {

            //  Crear cursos  Mp)
            Curso matematicas = new Curso("MAT01", "Matemáticas");
            Curso calculo = new Curso("CAL01", "Cálculo Integral");
            System.out.println("Cursos creados:");
            System.out.println(matematicas);
            System.out.println(calculo);
            System.out.println();

            //  Crear estudiantes (Susana)
            String[] materiasJuan = {"Geometría", "Cálculo Diferencial"};
            Estudiante juan = new Estudiante("Juan", materiasJuan, 3.5);

            String[] materiasMaría = {"Geometría"};
            Estudiante maria = new Estudiante("María", materiasMaría, 1.8);

            //  Matricular en curso (David)
            System.out.println("Matriculando estudiantes ");
            try {
                matematicas.matricularEstudiante(juan);
                matematicas.matricularEstudiante(maria);
                System.out.println("Estudiantes matriculados exitosamente");
                System.out.println("Cupos disponibles: " + matematicas.getCuposDisponibles());
            } catch (CursoLlenoException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();

            // Verificar prerequisitos (Susana)
            System.out.println(" Verificando prerequisitos ");
            if (juan.puedeInscribirse(calculo)) {
                System.out.println(juan.getNombre() + " puede inscribirse en Cálculo");
            } else {
                System.out.println(juan.getNombre() + " no cumple prerequisitos");
            }
            System.out.println();

            //  Verificar notas (David)
            System.out.println(" Verificando notas ");
            juan.verificarNota();
            maria.verificarNota();
            System.out.println();

            // Verificar apertura del curso (Mp)
            System.out.println("Verificando apertura del curso ");
            try {
                matematicas.verificarApertura(); // tiene 2, necesita mínimo 5
            } catch (CursoSinMinimoException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();

            // Profesores (David )
            System.out.println(" Profesores ");
            Profesor profe1 = new Profesor(100, "Andrea Mesa", 38, "Matemáticas");
            Profesor profe2 = new Profesor(101, "Juan Sebastián", 40, "Cálculo");
            System.out.println(profe1);
            System.out.println(profe2);
        }
    }
}
