public class EventoAleatorio {
    private String tipoAtual;
    private String descricao;
    
    // Tipos de eventos
    public static final String CHUVA = "Chuva";
    public static final String VAIA = "Vaia";
    public static final String LEAO = "Leão";
    public static final String NENHUM = "Nenhum";
    
    public void sortearEvento() {
        int chance = Aleatorio.entre(1, 100);
        Plateia plateia = new Plateia();    
        if (chance <= 10) {
            tipoAtual = CHUVA;
            descricao = "☔ Está chovendo! Arcos têm 30% menos precisão!";
            plateia.diminuirAnimacao(10);
        } else if (chance <= 20) {
            tipoAtual = VAIA;
            descricao = "👎 A plateia está vaiando! Precisão reduzida em 10%!";
            plateia.diminuirAnimacao(20);
        } else if (chance <= 25) {
            tipoAtual = LEAO;
            descricao = "🦁 O César está entediado! UM LEÃO ENTRA NA ARENA!";
            plateia.aumentarAnimacao(20);
        } else {
            tipoAtual = NENHUM;
            descricao = "";
        }
    }
    
    public String getTipo() {
        return tipoAtual;
    }
    
    public String getDescricao() {
        return descricao;
    }
}