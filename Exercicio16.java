import java.util.Scanner;

public class Exercicio16 {


    public static void L3_07(){

        Scanner grava = new Scanner(System.in);
        float num_1, num_2, num_3, calc;

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler três números, realizar uma operação matemática e depois realizar uma comparação");

        System.out.print("Digite o primeiro número: ");
        num_1 = grava.nextFloat();
        System.out.print("Digite o segundo número: ");
        num_2 = grava.nextFloat();
        System.out.print("Digite o terceiro número: ");
        num_3 = grava.nextFloat();

        calc = num_1 + num_2 + num_3;

        if (calc > 20) {
            System.out.print("O resultado do calculo deu " + calc + " que é maior que 20");
        }
    }
}
