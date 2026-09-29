import java.util.Scanner;
public class AreaTriángulo {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        try (Scanner scanner = new Scanner(System.in)) {
            // Pedir la base al usuario
            System.out.print("Ingresa la base del triángulo: ");
            double base = scanner.nextDouble();

            // Pedir la altura al usuario
            System.out.print("Ingresa la altura del triángulo: ");
            double altura = scanner.nextDouble();

            // Calcular el área del triángulo
            double area = (base * altura) / 2;

            // Mostrar el resultado
            System.out.println("El área del triángulo es: " + area);
        }
    }
    
}
