/**
 * Ejercicio: Identificar pasos de un algoritmo
 * Intercambio de dos variables (A y B) usando una variable auxiliar temp.
 */
public class intercambioVariables {

    public static void main(String[] args) {

        // Datos iniciales
        int A = 5;
        int B = 10;

        System.out.println("Valores antes del intercambio:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Intercambio usando variable auxiliar
        int temp = A;
        A = B;
        B = temp;

        System.out.println("\nValores despues del intercambio:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
