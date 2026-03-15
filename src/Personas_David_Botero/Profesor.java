class Profesor extends Persona { //Hereda de Persona

    private String materia;

    public Profesor(int id, String nombre, int edad, String materia) { //Constructor público para poder crear profesores desde otras clases

        setId(id);
        setNombre(nombre);
        setEdad(edad);

        this.materia = materia;
    }

}
