public class CalculoIva {

    static double calcularIva(double precio, double tarifa) {
        return precio * tarifa;
    }

    public static void main(String[] args) {
        double precio = 100;
        double tarifa = 0.15;  // IVA 15%

        double iva = calcularIva(precio, tarifa);
        double total = precio + iva;

        System.out.printf("IVA: $%.2f%n", iva);      // IVA: $15.00
        System.out.printf("Total: $%.2f%n", total);  // Total: $115.00
    }
}

