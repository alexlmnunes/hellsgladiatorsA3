import java.util.Random;

public class Oponente extends Gladiador {
    
    public Oponente getOponente() {Random random = new Random();
    int randomClasse = random.nextInt(5);
    String tC, nA;
    switch (randomClasse) {
        case 0 -> {
            tC = "Tanque";
            nA = "machado";
        }
        case 1 -> {
            tC = "Assassino";
            nA = "rede_adaga";
        }
        case 2 -> {
            tC = "Bárbaro";
            nA = "espada";
        }
        case 3 -> {
            tC = "Lanceiro";
            nA = "lanca";
        }
        case 4 -> {
            tC = "Arqueiro";
            nA = "arco";
        }
    }
    return oponente.setOponente(tC, nA);
}
    public void setOponente(String tipoClasse, String nomeArma) {
        this.tipoClasse = tipoClasse;
        arma.configurarArma(nomeArma);
        this.status = new StatusBatalha();
        
        ConfiguracaoClasse config = new ConfiguracaoClasse();
        aplicarConfiguracao(config.getConfiguracao(tipoClasse));
    }
}
