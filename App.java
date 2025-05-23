import java.io.IOException;

public class App {

    public static void limparTela() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();    
    }


    public static void main(String[] args) throws Exception {
        limparTela();
        Exercicio25 p = new Exercicio25();
        p.L4_06();
    }
}
