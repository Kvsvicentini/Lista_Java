import java.util.Scanner;

public class Exercicio20 {
    
    public static void L4_01() {

        Scanner grava = new Scanner(System.in);
        float num_1, num_2;

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler dois números, compara_los e mostrar o menor");

        System.out.print("Digite o primeiro número: ");
        num_1 = grava.nextFloat();
        System.out.print("Digite o segundo número: ");
        num_2 = grava.nextFloat();

        if (num_1 < num_2) {
            System.out.print(num_1 + " é menor que " + num_2);
        }

        else {
            System.out.print(num_2 + " é menor que " + num_1);
        }
    }
}