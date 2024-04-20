package Exercicios;
import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro termo da progressão aritmética: ");
        double a1 = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("Digite a razão da progressão aritmética: ");
        double r = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("Digite o valor de n para calcular o termo: ");
        int n = leitor.nextInt();
        leitor.nextLine();
        leitor.close();

        double an = a1 + (n - 1) * r;
        System.out.println("O " + n + "º termo da progressão aritmética é: " + an);
    }
}
