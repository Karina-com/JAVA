import java.util.Scanner;

public class cajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int edad;
        double precio = 0;
        double total = 0;
        double descuento;
        double precioFinal;

        do {
            System.out.println("\n--- CINE ---");
            System.out.println("1. 2D - $5.00");
            System.out.println("2. 3D - $7.50");
            System.out.println("3. IMAX - $10.00");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    precio = 5.00;

                    System.out.print("Ingrese la edad: ");
                    edad = sc.nextInt();

                    if (edad >= 0 && edad <= 120) {

                        if (edad < 12) {
                            descuento = precio * 0.30;
                        } else if (edad >= 65) {
                            descuento = precio * 0.25;
                        } else {
                            descuento = 0;
                        }

                        precioFinal = precio - descuento;
                        total = total + precioFinal;

                        System.out.println("Entrada 2D: $" + precioFinal);

                    } else {
                        System.out.println("Edad inválida.");
                    }
                    break;

                case 2:
                    precio = 7.50;

                    System.out.print("Ingrese la edad: ");
                    edad = sc.nextInt();

                    if (edad >= 0 && edad <= 120) {

                        if (edad < 12) {
                            descuento = precio * 0.30;
                        } else if (edad >= 65) {
                            descuento = precio * 0.25;
                        } else {
                            descuento = 0;
                        }

                        precioFinal = precio - descuento;
                        total = total + precioFinal;

                        System.out.println("Entrada 3D: $" + precioFinal);

                    } else {
                        System.out.println("Edad inválida.");
                    }
                    break;

                case 3:
                    precio = 10.00;

                    System.out.print("Ingrese la edad: ");
                    edad = sc.nextInt();

                    if (edad >= 0 && edad <= 120) {

                        if (edad < 12) {
                            descuento = precio * 0.30;
                        } else if (edad >= 65) {
                            descuento = precio * 0.25;
                        } else {
                            descuento = 0;
                        }

                        precioFinal = precio - descuento;
                        total = total + precioFinal;

                        System.out.println("Entrada IMAX: $" + precioFinal);

                    } else {
                        System.out.println("Edad inválida.");
                    }
                    break;

                case 4:
                    System.out.println("Compra finalizada.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        System.out.println("Total final: $" + total);

        sc.close();
    }
}