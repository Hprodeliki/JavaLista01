package Exercicios;
import java.util.Scanner;





public class Exercicio01 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

         System.out.println("Digite um numero: ");
        int numero = leitor.nextInt();
        leitor.nextLine();
        if(numero > 10){System.out.println("Número maior que 10");
        }
        
        else System.out.println("Número menor ou igual a 10");



    }

}
