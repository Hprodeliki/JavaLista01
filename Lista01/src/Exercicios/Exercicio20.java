package Exercicios;
import java.util.Scanner;

public class Exercicio20 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tempo da viagem em horas: ");
        double tempo = leitor.nextDouble();

        System.out.println("Digite a velocidade média da viagem em km/h: ");
        double velocidadeMedia = leitor.nextDouble();
        leitor.close();

        double distancia = tempo * velocidadeMedia;
        double litrosGastos = distancia / 12; 

        System.out.println("A quantidade de litros de combustível gasta na viagem é: " + litrosGastos);




        
    }
}
