package Personas_David_Botero;
public class Persona {

    private int id;
    private String nombre;
    private int edad;
    }

    public Persona(int id, String nombre, int edad) { // Constructor público para crear personas desde otras clases

        if (edad < 16) {
            throw new IllegalArgumentException("Error: la edad mínima permitida es 16 años."); //Excepción
        }

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters (permiten leer los atributos privados)

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Setters (permiten modificar los atributos privados)

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {

        if (edad < 16) {
            throw new IllegalArgumentException("Error: la edad mínima permitida es 16 años."); //Excepción
        }

        this.edad = edad;
    }

}
