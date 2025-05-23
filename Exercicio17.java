import java.util.Scanner;

public class Exercicio17 {
    
    public static void L3_08() {

        Scanner grava = new Scanner(System.in);
        float num_1, num_2;

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler dois números e realizar uma comparação");

        System.out.print("Digite o primeiro número: ");
        num_1 = grava.nextFloat();
        System.out.print("Digite o segundo número: ");
        num_2 = grava.nextFloat();

        if (num_1 == num_2) {
            System.out.println("O números são iguais");
        }
        else {
            System.out.println("Os números não são iguais");
        }
    }
}