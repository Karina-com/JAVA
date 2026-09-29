import java.util.*;

public class  cafeteria_universidad {
public static void main(String[] args) {

    // Declaración de variables
    try (Scanner scanner = new Scanner(System.in)) {
        // Declaración de variables
        String nombre;
        String producto;
        int cantidad;
        double precio;
        double dineroEntregado;
        double subtotal;
        double descuento;
        double total;
        double cambio;
        double falta;

        // Entrada de datos
        System.out.println("=== COMPRA EN LA CAFETERIA UNIVERSITARIA ===");

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el nombre del producto: ");
        producto = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de productos: ");
        cantidad = scanner.nextInt();

        // Proceso
        subtotal = precio * cantidad;
        descuento = subtotal * 0.10;
        total = subtotal - descuento;

        // Salida de resultados
        System.out.println("\n=== RESUMEN DE LA COMPRA ===");
        System.out.println("Estudiante: " + nombre);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento del 10%: $" + descuento);
        System.out.println("Total a pagar: $" + total);

        // Dinero entregado
        System.out.print("\nIngrese el dinero entregado: $");
        dineroEntregado = scanner.nextDouble();

        // Decisión
        if (dineroEntregado >= total) {

            cambio = dineroEntregado - total;

            System.out.println("\nEl dinero SI cubre el pago.");
            System.out.println("Su cambio es: $" + cambio);

        } else {

            falta = total - dineroEntregado;

            System.out.println("\nEl dinero NO cubre el pago.");
            System.out.println("Le falta: $" + falta);
        }
    }
    }
}