import java.util.Scanner;

public class menuCafeteria {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int opcion, cantidad;
            double precio, subtotal, descuento, total;
            String producto;
            // Mostrar menú
            System.out.println("----- MENU DE PRODUCTOS -----");
            System.out.println("1. Hamburguesa - $5.00");
            System.out.println("2. Pizza - $8.00");
            System.out.println("3. Gaseosa - $2.00");
            // Leer opción
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            // Seleccionar producto con SWITCH
            switch (opcion) {
                
                case 1 -> {
                    producto = "Hamburguesa";
                    precio = 5.00;
                }
                    
                case 2 -> {
                    producto = "Pizza";
                    precio = 8.00;
                }
                    
                case 3 -> {
                    producto = "Gaseosa";
                    precio = 2.00;
                }
                    
                default -> {
                    System.out.println("Opción no válida.");
                    return;
                }
            }   // Ingresar cantidad
            System.out.print("Ingrese la cantidad: ");
            cantidad = entrada.nextInt();
            // Calcular subtotal
            subtotal = precio * cantidad;
            // Aplicar descuento
            if (subtotal >= 10) {
                descuento = subtotal * 0.10;
            } else {
                descuento = 0;
            }   // Calcular total
            total = subtotal - descuento;
            // Mostrar resultados
            System.out.println("\n----- RESULTADO DE LA COMPRA -----");
            System.out.println("Producto: " + producto);
            System.out.println("Precio unitario: $" + precio);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + total);
        }
    }
}