import java.util.Scanner;

public class Exercicio19 {
    
    public static void L3_10() {

        Scanner grava = new Scanner(System.in);
        int num_1, calc;

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler um número e mostrar sua tabuada caso ele seja menor que 10");

        System.out.print("Digite o número: ");
        num_1 = grava.nextInt();

        if (num_1 < 10) {
            calc = num_1 * 0;
            System.out.println(num_1 + " x 0 = " + calc);
            calc = num_1 * 1;
            System.out.println(num_1 + " x 1 = " + calc);
            calc = num_1 * 2;
            System.out.println(num_1 + " x 2 = " + calc);
            calc = num_1 * 3;
            System.out.println(num_1 + " x 3 = " + calc);
            calc = num_1 * 4;
            System.out.println(num_1 + " x 4 = " + calc);
            calc = num_1 * 5;
            System.out.println(num_1 + " x 5 = " + calc);
            calc = num_1 * 6;
            System.out.println(num_1 + " x 6 = " + calc);
            calc = num_1 * 7;
            System.out.println(num_1 + " x 7 = " + calc);
            calc = num_1 * 8;
            System.out.println(num_1 + " x 8 = " + calc);
            calc = num_1 * 9;
            System.out.println(num_1 + " x 9 = " + calc);
            calc = num_1 * 10;
            System.out.println(num_1 + " x 10 = " + calc);
        }
        
        else {
            System.out.println("O número é maior que 10");
        }
    }
}