 public class matrizCiclos {
    public static void main(String[] args) {
        
        int filas = 3;
        int columnas = 4;
        
        // Declaramos la matriz (arreglo bidimensional)
        int[][] matriz = new int[filas][columnas];
        
        // 1er ciclo anidado: LLENAR la matriz
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                matriz[fila][col] = fila + col; // puedes poner cualquier fórmula
            }
        }
        
        // 2do ciclo anidado: IMPRIMIR la matriz
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println(); // salto de línea al terminar cada fila
        }
    }
} 
