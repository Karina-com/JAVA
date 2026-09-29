public class validacionBancaria {

    public static boolean validarTarjeta(String numero) {
        int total = 0;
        int posicion = 0;

        for (int i = numero.length() - 1; i >= 0; i--) {
            char caracter = numero.charAt(i);
            if (Character.isDigit(caracter)) {
                int digito = Character.digit(caracter, 10);
                if (posicion % 2 == 1) {
                    digito *= 2;
                    if (digito > 9) {
                        digito -= 9;
                    }
                }
                total += digito;
                posicion++;
            }
        }

        return total % 10 == 0;
    }

    public static void main(String[] args) {
        System.out.println(validarTarjeta("4539 1488 0343 6467"));
    }
}
