package Exercicios;
import java.util.Scanner;

public class Exercicio07 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();
        leitor.nextLine();
        leitor.close();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número está fora do intervalo entre 100 e 200.");
        }
    }
}
