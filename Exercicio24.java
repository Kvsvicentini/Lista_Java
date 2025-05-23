import java.util.Scanner;

public class Exercicio24 {
    
    public static void L4_05() {

        Scanner grava = new Scanner(System.in);
        float num_1, num_2, num_3, calc;

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler três números e compara-los entre eles e somar cinco ao menor valor e mostrar o resultado");

        System.out.print("Digite o primeiro número: ");
        num_1 = grava.nextFloat();
        System.out.print("Digite o segundo número: ");
        num_2 = grava.nextFloat();
        System.out.print("Digite o terceiro número: ");
        num_3 = grava.nextFloat();

        if (num_1 < num_2) {
            if (num_3 < num_1) {
                calc = num_3 + 5;
                System.out.println(num_3 + " + 5 = " + calc);
            }

            else {
                calc = num_1 + 5;
                System.out.println(num_1 + " + 5 = " + calc);
            }
        }

        else {
            if (num_2 < num_3) {
                calc = num_2 + 5;
                System.out.println(num_2 + " + 5 = " + calc);
            }

            else {
                calc = num_3 + 5;
                System.out.println(num_3 + " + 5 = " + calc);
            }
        }
    }
}