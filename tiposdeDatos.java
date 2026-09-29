public class tiposdeDatos {
   String titular = "Ana Pérez"; // str (texto)
   int edad = 30;                // int (entero)
   double saldo = 1250.75;       // float (decimal)
   boolean cuenta_activa = true; // bool (verdadero/falso)
   int[] movimientos = {100, -20, 50}; // list (lista)
   java.util.Map<String, String> datos = java.util.Map.of(
      "banco", "Pichincha", "tipo", "ahorros"); // dict (diccionario)

   public static void main(String[] args) {
      tiposdeDatos ejemplo = new tiposdeDatos();
      System.out.println(ejemplo.titular.getClass());
      System.out.println(((Object) ejemplo.edad).getClass());
      System.out.println(((Object) ejemplo.saldo).getClass());
      System.out.println(((Object) ejemplo.cuenta_activa).getClass());
      System.out.println(ejemplo.movimientos.getClass());
      System.out.println(ejemplo.datos.getClass());
   }
}
