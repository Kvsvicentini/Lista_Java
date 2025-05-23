import java.util.Scanner;

public class Exercicio10 {
    public static void L3_01() {
        double num_1, num_2, num_3, calc_1, calc_2, calc_3;
        Scanner grava = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler um número realizar e operações matemáticas");

        System.out.print("Digite um número: ");
        num_1 = grava.nextDouble();

        calc_1 = num_1 / 2;
        num_2 = calc_1;
        num_3 = calc_1;
        calc_2 = num_2 + 3;
        calc_3 = num_3 + 5;

        System.out.println("O resultado da primeira operação é " + calc_2 + " e a segunda operação deu " + calc_3);

    }
}
