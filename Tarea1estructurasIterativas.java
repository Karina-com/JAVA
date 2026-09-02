/**
 * Laboratorio: Archivos Fuente Ejecutables
 * Tarea 1: Estructuras Iterativas
 * Verifica los resultados de un bucle anidado usando variables de seguimiento.
 */
public class Tarea1estructurasIterativas {

    public static void main(String[] args) {

        // Datos fijos del bucle a verificar (no se piden por teclado)
        int filas = 5;
        int columnas = 5;

        // Variables de seguimiento (tracking variables)
        int contadorTotal = 0;
        int sumaTotal = 0;
        int contadorPares = 0;

        System.out.println("Tabla generada por el bucle anidado:\n");

        // Bucle anidado a verificar
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                int valor = i * j;

                // Actualizacion de variables de seguimiento
                contadorTotal++;
                sumaTotal += valor;
                if (valor % 2 == 0) {
                    contadorPares++;
                }

                System.out.print(valor + "\t");
            }
            System.out.println();
        }

        // Verificacion de resultados
        int iteracionesEsperadas = filas * columnas;

        System.out.println("\n--- Verificacion ---");
        System.out.println("Iteraciones ejecutadas: " + contadorTotal);
        System.out.println("Iteraciones esperadas : " + iteracionesEsperadas);

        if (contadorTotal == iteracionesEsperadas) {
            System.out.println("Resultado: Verificacion CORRECTA, el bucle ejecuto el total esperado de iteraciones.");
        } else {
            System.out.println("Resultado: ERROR, el bucle no ejecuto el total esperado de iteraciones.");
        }

        System.out.println("Suma total de valores: " + sumaTotal);
        System.out.println("Cantidad de valores pares: " + contadorPares);
    }
}
