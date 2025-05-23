import java.util.Scanner;

public class Exercicio21 {
    
    public static void L4_02() {

        Scanner grava = new Scanner(System.in);
        float num_1, num_2;

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler dois números compara-los, somar cinco ao menor, compara-los novamente e mostrar o maior");

        System.out.print("Digite o primeiro número: ");
        num_1 = grava.nextFloat();
        System.out.print("Digite o segundo número: ");
        num_2 = grava.nextFloat();

        if (num_1 < num_2) {
            num_1 += 5;
        }

        else {
            num_2 += 5;
        }

        if (num_1 > num_2) {
           System.out.print(num_1 + " é maior que " + num_2); 
        }

        else {
            System.out.print(num_2 + " é maior que " + num_1);
        }
    }
}