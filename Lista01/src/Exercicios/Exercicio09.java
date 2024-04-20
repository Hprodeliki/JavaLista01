package Exercicios;
import java.util.Scanner;

public class Exercicio09 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Digite o segundo número: ");
        int numero2 = leitor.nextInt();
        leitor.nextLine();
        leitor.close();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            System.out.println("O maior número é: " + Math.max(numero1, numero2));
        }
    }
}
