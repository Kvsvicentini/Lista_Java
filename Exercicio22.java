import java.util.Scanner;

public class Exercicio22 {
    
    public static void L4_03() {

        Scanner grava = new Scanner(System.in);
        float num_1;

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler um número e compara-lo com 10 e dizer se ele é maior ou menor que 10");

        System.out.print("Digite o número: ");
        num_1 = grava.nextFloat();

        if (num_1 < 10) {
          System.out.print(num_1 + " é menor que 10");  
        }

        else if (num_1 == 10) {
            System.out.print(num_1 + " é igual a 10");
        }

        else {
            System.out.print(num_1 + " é maior que 10");
        }
    }
}