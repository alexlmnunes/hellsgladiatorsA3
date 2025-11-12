import java.util.Random;
public class Aleatorio {
    // private = só pode ser acessado dentro desta classe
    // static = pertence à classe e não aos objetos dela
    // final = o valor não pode ser alterado após a inicialização
    private static final Random randomizador = new Random();

    // Gera um número aleatório entre min (inclusivo) e max (exclusivo)
    // public = pode ser acessado de qualquer lugar
    // static = pertence à classe e não aos objetos dela
    // boolean = tipo de retorno (verdadeiro ou falso)
    // chance = nome do método
    // int porcentagem = parâmetro de entrada (um número inteiro)
    public static boolean chance(int porcentagem) {
        // Gera um número aleatório entre 0 e 99 e verifica se é menor que a porcentagem
        return randomizador.nextInt(100) < porcentagem;
    }
    public static int entre(int min, int max) {
        // Gera um número aleatório entre min (inclusivo) e max (exclusivo)
        return randomizador.nextInt(max - min) + min;
    }

}