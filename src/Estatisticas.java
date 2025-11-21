
public class Estatisticas {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int kills;
    private int vitoriasConsecutivas;
    private int melhorSequencia;
    
    public Estatisticas(String nome) {
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
        this.kills = 0;
        this.vitoriasConsecutivas = 0;
        this.melhorSequencia = 0;
    }
    
    public void adicionarVitoria() {
        vitorias++;
        vitoriasConsecutivas++;
        
        if (vitoriasConsecutivas > melhorSequencia) {
            melhorSequencia = vitoriasConsecutivas;
        }
    }
    
    public void adicionarDerrota() {
        derrotas++;
        vitoriasConsecutivas = 0; // Reseta sequência
    }
    
    public void adicionarKill() {
        kills++;
    }
    
    public double calcularWinRate() {
        int totalBatalhas = vitorias + derrotas;
        if (totalBatalhas == 0) return 0;
        return (vitorias * 100.0) / totalBatalhas;
    }
    
    // Getters
    public String getNome() { return nome; }
    public int getVitorias() { return vitorias; }
    public int getDerrotas() { return derrotas; }
    public int getKills() { return kills; }
    public int getVitoriasConsecutivas() { return vitoriasConsecutivas; }
    public int getMelhorSequencia() { return melhorSequencia; }
    
    @Override
    public String toString() {
        return nome + "," + vitorias + "," + derrotas + "," + 
               kills + "," + melhorSequencia;
    }
    
    // Cria Estatisticas a partir de uma linha do arquivo
    public static Estatisticas fromString(String linha) {
        String[] dados = linha.split(",");
        Estatisticas stat = new Estatisticas(dados[0]);
        stat.vitorias = Integer.parseInt(dados[1]);
        stat.derrotas = Integer.parseInt(dados[2]);
        stat.kills = Integer.parseInt(dados[3]);
        stat.melhorSequencia = Integer.parseInt(dados[4]);
        return stat;
    }
}