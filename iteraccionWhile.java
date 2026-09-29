
import java.util.Scanner;

public class iteraccionWhile {
     public static void main(String[]args){
        int idade = 0;
        while (idade<18) {
            System.out.println("Ingresar su edad");
            Scanner sc = new Scanner(System.in);
           idade = sc.nextInt();
           System.out.println("edad invalidad");
        }
        System.out.println("edad valida");
     }
    
}
