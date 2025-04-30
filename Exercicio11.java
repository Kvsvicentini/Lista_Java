import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) throws Exception {
        double num_1;
        Scanner grava = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler um número realizar uma comparação e mostrar o número");

        System.out.print("Digite um número: ");
        num_1 = grava.nextDouble();

        if (num_1 < 5) {
            System.out.println("O número " + num_1 + " é menor que 5");
        }

    }
}
