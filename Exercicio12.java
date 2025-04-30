import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) throws Exception {
        double num_1, calc_1;
        Scanner grava = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler um número fazer um cálculo e depois realizar uma comparação");

        System.out.print("Digite um número: ");
        num_1 = grava.nextDouble();

        calc_1 = num_1 + 5;

        if (calc_1 > 10) {
            System.out.println("O número " + calc_1 + " é maior que 10");
        }

    }
}
