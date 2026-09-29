import java.util.Scanner;

public class controlCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, aprobados = 0, reprobados = 0, i;
        double suma = 0, nota, notaMax = 0, notaMin = 10, promedio;

        // ---------- VALIDACIÓN DEL NÚMERO DE ESTUDIANTES (WHILE) ----------
        System.out.print("Ingrese el número de estudiantes: ");
        n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Error: el número de estudiantes debe ser mayor que cero");
            System.out.print("Ingrese el número de estudiantes: ");
            n = sc.nextInt();
        }

        // ---------- PROCESAMIENTO DE CALIFICACIONES (FOR) ----------
        for (i = 1; i <= n; i++) {

            System.out.print("Ingrese la calificación del estudiante " + i + ": ");
            nota = sc.nextDouble();

            // Validación del rango de la nota (WHILE)
            while (nota < 0 || nota > 10) {
                System.out.println("Error: la calificación debe estar entre 0 y 10");
                System.out.print("Ingrese la calificación del estudiante " + i + ": ");
                nota = sc.nextDouble();
            }

            // Acumular suma
            suma += nota;

            // Contar aprobados y reprobados
            if (nota >= 7) {
                aprobados++;
            } else {
                reprobados++;
            }

            // Determinar nota más alta
            if (nota > notaMax) {
                notaMax = nota;
            }

            // Determinar nota más baja
            if (nota < notaMin) {
                notaMin = nota;
            }
        }

        // ---------- CÁLCULO DEL PROMEDIO ----------
        promedio = suma / n;

        // ---------- SALIDA DE RESULTADOS ----------
        System.out.println("\n----- REPORTE FINAL -----");
        System.out.println("Número de estudiantes: " + n);
        System.out.println("Suma de calificaciones: " + suma);
        System.out.printf("Promedio general: %.2f%n", promedio);
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);
        System.out.println("Nota más alta: " + notaMax);
        System.out.println("Nota más baja: " + notaMin);

        sc.close();
    }
} 
