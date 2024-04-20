package Exercicios;
import java.util.Scanner;

public class Exercicio02 {

    public static void executar() {

        Scanner leitor = new Scanner(System.in);

        
        System.out.println("Digite um numero: ");
        int numero1 = leitor.nextInt();
        leitor.nextLine();
       
        System.out.println("Digite outro numero: ");
        int numero2 = leitor.nextInt();
        leitor.nextLine();
        leitor.close();
        int soma = numero1 + numero2;
        System.out.println("A soma dos 2 dá: " + soma);

       

    }

}