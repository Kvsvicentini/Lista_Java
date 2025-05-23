import java.util.Scanner;

public class Exercicio13 {
    public static void L3_04()  {
        double num_1, calc_1;
        Scanner grava = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler um número fazer um cálculo e depois realizar uma comparação");

        System.out.print("Digite um número: ");
        num_1 = grava.nextDouble();

        calc_1 = num_1 - 10;

        if (calc_1 > 3) {
            System.out.println("O número " + calc_1 + " é maior que 3");
        }
    }
}
