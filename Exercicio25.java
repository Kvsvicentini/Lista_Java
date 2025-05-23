import java.util.Scanner;

public class Exercicio25 {
    
    public static void L4_06() {

        Scanner grava = new Scanner(System.in);
        float num_1, num_2;

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler dois números e mostra-los em ordem crescente");

        System.out.print("Digite o primeiro número: ");
        num_1 = grava.nextFloat();
        System.out.print("Digite o segundo número: ");
        num_2 = grava.nextFloat();

        if (num_1 < num_2) {
            System.out.println("A ordem dos números é " + num_1 + ", " + num_2);
        }

        else {
            System.out.println("A ordem dos números é " + num_2 + ", " + num_1);
        }
    }

}