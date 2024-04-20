package Exercicios;
import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro ponto (x1 y1): ");
        double x1 = leitor.nextDouble();

        double y1 = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("Digite as coordenadas do segundo ponto (x2 y2): ");
        double x2 = leitor.nextDouble();
        
        double y2 = leitor.nextDouble();
        leitor.nextLine();
        leitor.close();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("A distância entre os dois pontos é: " + distancia);
    }
}
