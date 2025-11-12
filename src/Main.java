java.util.Scanner

public class Main {
    public static void main(String[] args) {
        System.out.println("Hell's Gladiators");
        System.out.print("Carregando");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.println("--------------------------------------------");
        System.out.println("Bem-vindo ao Coliseu!");
        System.out.println("--------------------------------------------\n\n\n\n\n");
        System.out.println("Seu objetivo é sobreviver dentro do coliseu e conquistar vitórias.");
        System.out.println("Classes disponíveis para escolha:");
        System.out.println("1 - Tanque");
        System.out.println("2 - Assassino");
        System.out.println("3 - Bárbaro");
        System..out.println("4 - Lanceiro");
        System.out.println("5 - Arqueiro");
        System.out.println("Digite o número correspondente à classe que deseja escolher:");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Você escolheu a classe Tanque!");
                break;
            case 2:
                System.out.println("Você escolheu a classe Assassino!");
                break;
            case 3:
                System.out.println("Você escolheu a classe Bárbaro!");
                break;
            case 4:
                System.out.println("Você escolheu a classe Lanceiro!");
                break;
            case 5:
                System.out.println("Você escolheu a classe Arqueiro!");
                break;
            default:
                System.out.println("Escolha inválida. Por favor, reinicie o jogo e selecione uma classe válida.");
        }
    }
}