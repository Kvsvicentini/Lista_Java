import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) throws Exception {
        int num_1, a, b, c, d, e, f, g, h, i, j, k;
        Scanner grava = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Vamos ler um número e criar uma tabuada sem usar loop");
        System.out.println("Digite um número: ");
        num_1 = grava.nextInt();
        a = num_1 * 0;
        b = num_1 * 1;
        c = num_1 * 2;
        d = num_1 * 3;
        e = num_1 * 4;
        f = num_1 * 5;
        g = num_1 * 6;
        h = num_1 * 7;
        i = num_1 * 8;
        j = num_1 * 9;
        k = num_1 * 10;
        System.out.println(num_1 + " x " + "0 " + "= " + a);
        System.out.println(num_1 + " x " + "1 " + "= " + b);
        System.out.println(num_1 + " x " + "2 " + "= " + c);
        System.out.println(num_1 + " x " + "3 " + "= " + d);
        System.out.println(num_1 + " x " + "4 " + "= " + e);
        System.out.println(num_1 + " x " + "5 " + "= " + f);
        System.out.println(num_1 + " x " + "6 " + "= " + g);
        System.out.println(num_1 + " x " + "7 " + "= " + h);
        System.out.println(num_1 + " x " + "8 " + "= " + i);
        System.out.println(num_1 + " x " + "9 " + "= " + j);
        System.out.println(num_1 + " x " + "10 " + "= " + k);
    }

}