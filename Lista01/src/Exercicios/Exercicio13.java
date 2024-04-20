package Exercicios;
import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("Digite o valor de B: ");
        double b = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("Digite o operador (+, -, *, /): ");
        char operador = leitor.nextLine().charAt(0);
        leitor.close();

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                break;
            default:
                System.out.println("Operador não definido!");
                return;
        }

        System.out.println("Resultado da operação: " + resultado);
    }
}
