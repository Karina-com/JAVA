import java.util.Scanner;

public class edadEjemplo {
    public static void main(String[] args) {
        // Solicitar la edad
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar la edad
            System.out.print("Ingrese la edad del cliente: ");
            int edad = scanner.nextInt();
            
            // Clasificar según la edad
            if (edad < 18) {
                System.out.println("Cliente: Joven");
            } else if (edad >= 18 && edad <= 64) {
                System.out.println("Cliente: Adulto");
            } else {
                System.out.println("Cliente: Tercera Edad");
            }
        }
    }
}
