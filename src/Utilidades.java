public class Utilidades {

    // Valida que el id sea mayor a 0
    public static boolean idValido(int id) {
        return id > 0;
    }

    // Valida que el nombre no esté vacío
    public static boolean nombreValido(String nombre) {
        return nombre != null && !nombre.isEmpty();
    }

    // Valida id Y nombre juntos
    public static boolean datosValidos(int id, String nombre) {
        return idValido(id) && nombreValido(nombre);
    }
}