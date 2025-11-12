import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        InterfaceConsole ui = new InterfaceConsole();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            ui.mostrarMenuPrincipal();
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                ui.iniciarJogo();
            } else if (opcao == 2) {
                ui.mostrarRegras();
            } else if (opcao == 3) {
                ui.mostrarEstatisticas();
            } else {
                break;
            }

        }

        
    }
}
