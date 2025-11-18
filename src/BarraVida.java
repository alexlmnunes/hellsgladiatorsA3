public class BarraVida {

    private static final String RESET  = "\u001B[0m";
    private static final String GREEN  = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED    = "\u001B[31m";

    public static void printHealthBar(int current) {
        int max = 10;       // vida máxima fixa
        int total = 10;     // largura da barra fixa
        int filled = current; // 1 HP = 1 bloco
        double ratio = (double) current / max;
        String color;

        if (ratio <= 0.25)      color = RED;
        else if (ratio <= 0.60) color = YELLOW;
        else                    color = GREEN;

        System.out.print(color + "[");
        for (int i = 0; i < filled; i++) System.out.print("#");
        for (int i = filled; i < total; i++) System.out.print("-");
        System.out.println("] " + current + "/" + max + RESET);
    }

    //public static void main(String[] args) {
       // printHealthBar(10);
       // printHealthBar(7);
        //printHealthBar(3);
       // printHealthBar(1);
    //}
}