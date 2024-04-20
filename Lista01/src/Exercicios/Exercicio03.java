package Exercicios;
import java.util.Scanner;

public class Exercicio03 {
  public static void executar() {

    Scanner leitor = new Scanner(System.in);

    
    System.out.println("Digite um numero: ");
    int numero1 = leitor.nextInt();
    leitor.nextLine();
   
    System.out.println("Digite outro numero: ");
    int numero2 = leitor.nextInt();
    leitor.nextLine();
    leitor.close();
    if(numero1 == numero2){
      System.out.println("Inválido");
    }else if(numero1 > numero2){
      System.out.println("O numero 1: "+ numero1 +  " é maior");
    }else{
      System.out.println("O numero 2 : "+ numero2 + " é maior");
    }

   

}
}
