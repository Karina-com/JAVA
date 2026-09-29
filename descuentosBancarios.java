import java.util.Scanner;

public class descuentosBancarios {
    
 public static void main(String[] args) {

     try (Scanner scanner = new Scanner(System.in)) {
         int edad;
         
         System.out.println("SISTEMA DE DESCUENTOS BANCARIOS");
         System.out.print("Ingrese la edad del cliente: ");
         edad = scanner.nextInt();
         
         if (edad < 18) {
             System.out.println("Clasificación: Joven");
         } else if (edad <= 64) {
             System.out.println("Clasificación: Adulto");
         } else {
             System.out.println("Clasificación: Tercera Edad");
         }
     }
    }
}