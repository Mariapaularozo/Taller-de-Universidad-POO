import java.util.Scanner;//Librería para el scanner

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Persona[] personas = new Persona[29];
        // Polimorfismo. El arreglo es de tipo Persona, pero puede almacenar objetos de sus clases hijas como Estudiante o Profesor.

        for (int i = 0; i < 25; i++) { //Se ingresan los nombres de los estudiantes al arreglo

            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = sc.nextLine();

            int id = i + 1;
            int edad = 18;

            personas[i] = new Estudiante(id, nombre, edad);
        }

        personas[25] = new Profesor(100, "Andrea Mesa", 38, "Matemáticas Discretas");
        personas[26] = new Profesor(101, "Juan Sebastian", 40, "Arquitectura de Hardware");
        personas[27] = new Profesor(102, "Francisco Jaramillo", 45, "Calculo Diferencial");
        personas[28] = new Profesor(103, "Andres Sarrazola", 44, "Calculo Integral");

    }
}