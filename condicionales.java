import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        // Pedir el número al usuario
        try ( // Crear objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir el número al usuario
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            if (numero > 0) {
                if (numero < 100) {
                    System.out.println("Positivo y menor a 100");
                }
            }
            // Cerrar el scanner
        }
    }
}
