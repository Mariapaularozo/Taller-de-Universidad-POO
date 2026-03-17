package Personas_David_Botero;

public class Profesor extends Persona { //Hereda de Persona

    private String materia;

    public Profesor(int id, String nombre, int edad, String materia) { //Constructor público para poder crear profesores desde otras clases

        setId(id);
        setNombre(nombre);
        setEdad(edad);

        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profesor{nombre='" + getNombre() + "', materia='" + materia + "'}";
    }

}
