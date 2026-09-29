public class CategoriaInventario {
    public static void main(String[] args) {
        int stock= 8;
        String categoria;

        if (stock < 5) {
            categoria = "Bajo";
        } else if (stock <= 10) {
            categoria = "Medio";
        } else {
            categoria = "Alto";
        }

        System.out.println("La categoría del inventario es: " + categoria);
    }
}
