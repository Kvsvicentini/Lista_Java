import java.util.Scanner;

public class Exercicio15 {
    public static void L3_05() {
        double num_1, num_2, calc_1, calc_2, calc_3;
        Scanner grava = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler dois números, realizar operações matemáticas e depois realizar uma comparação");

        System.out.print("Digite o primeiro número: ");
        num_1 = grava.nextDouble();
        System.out.print("Digite o segundo número: ");
        num_2 = grava.nextDouble();

        calc_1 = num_1 + num_2;

        if (calc_1 < 20) {
            calc_2 = num_1 * 10;
            calc_3   = num_2 * 10;
            System.out.println("O resultado da primeira operação é " + calc_2 + " , já o segundo resultado é " + calc_3);
        }
    }
}
