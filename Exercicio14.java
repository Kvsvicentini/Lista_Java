import java.util.Scanner;

public class Exercicio14 {
    public static void L3_05() {
        double num_1, num_2, num_3, calc_1, calc_2, calc_3;
        Scanner grava = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler três números, fazer operações e depois realizar uma comparação");

        System.out.print("Digite o primeiro número: ");
        num_1 = grava.nextDouble();
        System.out.print("Digite o segundo número: ");
        num_2 = grava.nextDouble();
        System.out.print("Digite o terceiro número: ");
        num_3 = grava.nextDouble();

        calc_1 = num_1 + 5;
        calc_2 = num_2 + 5;
        calc_3 = num_3 + 5;

        if (calc_1 > 10) {
            System.out.println("O número " + calc_1 + " é maior que 10");
        }
        if (calc_2 > 10) {
            System.out.println("O número " + calc_2 + " é maior que 10");
        }
        if (calc_3 > 10) {
            System.out.println("O número " + calc_3 + " é maior que 10");
        }
    }
}
