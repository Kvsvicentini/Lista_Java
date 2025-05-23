import java.util.Scanner;

public class Exercicio9 {
    public static void L1_10() {
        int num_1, calc_1, calc_2;
        Scanner grava = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler um número realizar e operações matemáticas");

        System.out.print("Digite um número: ");
        num_1 = grava.nextInt();

        calc_1 = num_1 - 3;
        calc_2 = num_1 + calc_1;


        System.out.println("O resultado das operações é " + calc_2);
    }
}
