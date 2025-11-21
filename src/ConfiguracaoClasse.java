
public class ConfiguracaoClasse {
    // Constantes para os nomes das classes
    public static final String Tanque = "Tanque";
    public static final String Assassino = "Assassino";
    public static final String Barbaro = "Bárbaro";
    public static final String Lanceiro = "Lanceiro";
    public static final String Arqueiro = "Arqueiro";
    
    // Retorna configuração da classe
    // [HP, Redução Dano, Armadura, Chance de dar Crítico, Ataca Primeiro (0/1/2)]
    public int[] getConfiguracao(String tipoClasse) {
        switch (tipoClasse.toLowerCase()) {
            case Tanque:
                return new int[]{10, 5, 3, 0, 0}; // HP=10, Arma=5, Armadura=3, Sem crit, Lento
                
            case Assassino:
                return new int[]{7, 2, 0, 5, 2}; // HP=7, Arma=2, Armadura=0, Chance crit=5/10, Rápido
                
            case Barbaro:
                return new int[]{9, 3, 2, 2, 1}; // HP=9, Arma=3, Armadura=2, Chance crit=2/10, Normal
                
            case Lanceiro:
                return new int[]{9, 4, 1, 2, 1}; // HP=9, Arma=4, Armadura=1, Chance crit=2/10, Normal
                
            case Arqueiro:
                return new int[]{8, 2, 0, 3, 2}; // HP=8, Arma=2, Armadura=0, Chance crit=3/10, Rápido
                
            default:
                return new int[]{9, 3, 2, 2, 1}; // Padrão
        }
    }
    
    // Retorna a arma inicial da classe
    public String getArmaInicial(String tipoClasse) {
        switch (tipoClasse) {
            case Tanque: return Arma.machado;
            case Assassino: return Arma.rede_adaga;
            case Barbaro: return Arma.espada;
            case Lanceiro: return Arma.lanca;
            case Arqueiro: return Arma.arco;
            default: return Arma.espada;
        }
    }
    
    // Lista todas as classes disponíveis
    public String[] listarClasses() {
        return new String[]{Tanque, Assassino, Barbaro, Lanceiro, Arqueiro};
    }
}