
public class ConfiguracaoClasse {
    // Constantes para os nomes das classes
    public static final String MURMILLO = "Murmillo";
    public static final String RETIARIUS = "Retiarius";
    public static final String THRAEX = "Thraex";
    public static final String SECUTOR = "Secutor";
    public static final String HOPLOMACHUS = "Hoplomachus";
    
    // Retorna configuração da classe
    // [HP, Redução Dano, Pode Crítico (0/1), Ataca Primeiro (0/1)]
    public int[] getConfiguracao(String tipoClasse) {
        switch (tipoClasse) {
            case MURMILLO:
                return new int[]{10, 3, 0, 0}; // HP=10, Arm=3, Sem crit, Lento
                
            case RETIARIUS:
                return new int[]{7, 0, 1, 1}; // HP=7, Sem arm, Com crit, Rápido
                
            case THRAEX:
                return new int[]{9, 2, 1, 1}; // HP=9, Arm=2, Com crit, Normal
                
            case SECUTOR:
                return new int[]{9, 2, 1, 1}; // HP=9, Arm=2, Com crit, Normal
                
            case HOPLOMACHUS:
                return new int[]{8, 1, 1, 1}; // HP=8, Arm=1, Com crit, Rápido
                
            default:
                return new int[]{9, 2, 1, 1}; // Padrão
        }
    }
    
    // Retorna a arma inicial da classe
    public String getArmaInicial(String tipoClasse) {
        switch (tipoClasse) {
            case MURMILLO: return Arma.machado;
            case RETIARIUS: return Arma.rede_adaga;
            case THRAEX: return Arma.espada;
            case SECUTOR: return Arma.lanca;
            case HOPLOMACHUS: return Arma.arco;
            default: return Arma.espada;
        }
    }
    
    // Lista todas as classes disponíveis
    public String[] listarClasses() {
        return new String[]{MURMILLO, RETIARIUS, THRAEX, SECUTOR, HOPLOMACHUS};
    }
}