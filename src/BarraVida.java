
import static javax.swing.text.html.FormView.RESET;

public class BarraVida{
    private static final String VERDE = "\u001B[32m";
       private static final String AMARELO = "\u001B[33m";
       private static final String VERMELHO = "\u001B[31m";
       public static void mostrarBarra(int vidaAtual) {
           int vidaMaxima = 10;
           
           
           if (vidaAtual < 0) vidaAtual = 0;
           if (vidaAtual > vidaMaxima) vidaAtual = vidaMaxima;
           
           int blocosCheios = vidaAtual;
           int blocosVazios = vidaMaxima - vidaAtual;
           String cor;
           double porcentagem = (double) vidaAtual / vidaMaxima;
           if (porcentagem <= 0.25) cor = VERMELHO;
           else if (porcentagem <= 0.60) cor = AMARELO;
           else cor = VERDE;
           System.out.print(cor + "[");
           
           for (int i = 0; i < blocosCheios; i++) System.out.print("#");
           for (int i = 0; i < blocosVazios; i++) System.out.print(".");
           System.out.println("] " + vidaAtual + "/" + vidaMaxima + RESET);


}
    }

