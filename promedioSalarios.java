import java.util.Scanner;

public class promedioSalarios {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 0;          // cuántos salarios válidos se ingresaron
        double acumulador = 0;     // suma de esos salarios
        double salario;
        int numero = 1;            // solo para numerar el mensaje en pantalla

        System.out.println("Ingrese los salarios. Un valor negativo termina el ingreso.");
        System.out.print("Salario " + numero + ": ");
        salario = teclado.nextDouble();

        while (salario >= 0) {
            acumulador = acumulador + salario;
            contador = contador + 1;
            numero = numero + 1;

            System.out.print("Salario " + numero + ": ");
            salario = teclado.nextDouble();
        }

        if (contador == 0) {
            System.out.println("No se registro ningun salario.");
        } else {
            double promedio = acumulador / contador;
            System.out.println();
            System.out.println("Empleados registrados : " + contador);
            System.out.printf("Suma total            : %.2f%n", acumulador);
            System.out.printf("Promedio              : %.2f%n", promedio);
        }

        teclado.close();
    }
}