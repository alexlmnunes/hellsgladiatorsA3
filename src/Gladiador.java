public class Gladiador {
    private String nome;
    private TipoGladiador tipo;
    private int hp;
    private int hpMaximo;
    private Arma arma;
    private boolean temArmadura;
    private int reducaoDano;
    private boolean poderCritico;
    private StatusBatalha status;

    public Gladiador(String nome, String tipoClasse) {
        this.nome = nome;
        this.tipoClasse = tipoClasse;
        this.status = new StatusBatalha();
        
        ConfiguracaoClasse config = new ConfiguracaoClasse();
        aplicarConfiguracao(config.getConfiguracao(tipoClasse));
    }
    
    private void aplicarConfiguracao(int[] config) {
        this.hpMaximo = config[0];
        this.hp = config[0];
        this.reducaoDano = config[1];
        this.podeCritico = (config[2] == 1);
        this.temArmadura = (config[1] > 0);
    }
    
    public void receberDano(int dano) {
        int danoFinal = dano - reducaoDano;
        if (danoFinal < 0) danoFinal = 0;
        
        hp -= danoFinal;
        if (hp < 0) hp = 0;
    }
    
    public boolean estaVivo() {
        return hp > 0;
    }
    
    // Getters e Setters
    public String getNome() { 
        return nome; 
    }
    public String getTipoClasse() { 
        return tipoClasse;   
    }
    public int getHp() { 
        return hp;
    }
    public int getHpMaximo() {
         return hpMaximo; 
    }
    public Arma getArma() {
         return arma; 
    }
    public void setArma(Arma arma) {
         this.arma = arma; 
    }
    public int getReducaoDano() {
         return reducaoDano; 
    }
    public boolean temArmadura() { 
        return temArmadura; 
    }
    public boolean podeCritico() {
         return podeCritico; 
    }
    public StatusBatalha getStatus() { 
        return status; 
    }
}
