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
            }
        }

        
    }
}
