package Exercicios;
import java.util.Scanner;

public class Exercicio04 {
  public static void executar() {

    Scanner leitor = new Scanner(System.in);

    
    System.out.println("Digite um numero: ");
    float numero1 = leitor.nextFloat();
    leitor.nextLine();
   
    System.out.println("Digite outro numero: ");
    float numero2 = leitor.nextFloat();
    leitor.nextLine();
    leitor.close();
    float soma = numero1 + numero2;
    float sub = numero1 - numero2;
    float div = numero1/numero2;
    float mult = numero1*numero2;

    System.out.println("soma: " + soma + "\n Subtracao: " + sub + "\n Divisao: " + div + "\n Multiplicacao: " + mult );

   

}
}
