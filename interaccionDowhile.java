import java.util.Scanner;

public class interaccionDowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
        } while (opcion != 0);

        System.out.println("Gracias por usar el cajero");
    }
}
