import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        System.out.println("Hell's Gladiators");
        System.out.print("Carregando");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".\n\n\n\n\n\n");
        Thread.sleep(500);
        System.out.println("--------------------------------------------");
        System.out.println("Bem-vindo ao Coliseu!");
        System.out.println("--------------------------------------------\n\n\n\n\n");
        System.out.println("Seu objetivo é sobreviver dentro do coliseu e conquistar vitórias.");
        System.out.println("Classes disponíveis para escolha:");
        System.out.println("1 - Tanque");
        System.out.println("2 - Assassino");
        System.out.println("3 - Bárbaro");
        System.out.println("4 - Lanceiro");
        System.out.println("5 - Arqueiro");
        while (continueLoop) {
            System.out.println("Digite o número correspondente à classe que deseja escolher:");
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu a classe Tanque!");
                    continueLoop = false;
                    break;
                case 2:
                    System.out.println("Você escolheu a classe Assassino!");
                    continueLoop = false;
                    break;
                case 3:
                    System.out.println("Você escolheu a classe Bárbaro!");
                    continueLoop = false;
                    break;
                case 4:
                    System.out.println("Você escolheu a classe Lanceiro!");
                    continueLoop = false;
                    break;
                case 5:
                    System.out.println("Você escolheu a classe Arqueiro!");
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, selecione uma classe válida.");
            }
        }
        scanner.close();
    }
}
