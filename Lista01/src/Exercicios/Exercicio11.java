package Exercicios;
import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Digite o segundo número: ");
        int num2 = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Digite o terceiro número: ");
        int num3 = leitor.nextInt();
        leitor.nextLine();
        leitor.close();
        

        int menor = Math.min(Math.min(num1, num2), num3);
        int meio = (num1 + num2 + num3) - menor - Math.max(Math.max(num1, num2), num3);
        int maior = Math.max(Math.max(num1, num2), num3);

        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);
    }
}
