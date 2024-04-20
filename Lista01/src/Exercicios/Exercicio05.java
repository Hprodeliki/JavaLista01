package Exercicios;
import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Digite o valor de B: ");
        int b = leitor.nextInt();
        leitor.nextLine();
        leitor.close();

        System.out.println("Valores originais:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores trocados:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}

