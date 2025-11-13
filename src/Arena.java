public class Arena{

    private SistemaCombate combate;
    private Plateia plateia;
    private EventoAleatorio eventoAtual;

    public void iniciarBatalha(Gladiador jogador, Gladiador oponente){
        
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║   QUE OS JOGOS COMECEM!        ║");
        System.out.println("╚════════════════════════════════╝");
    

     plateia = new Plateia();
     eventoAtual = new EventoAleatorio();

     // sorteia evento aleatório

    eventoAtual = sortearEvento();
    if(!eventoAtual.getTipo().equals("Nenhum")){
        System.out.println("⚡" + eventoAtual.getDescricao());
    }

    // INICIA COMBATE

        combate = new SistemaCombate(jogador,oponente);
        combate.iniciarCombate();

        // REAÇÃO DA PLATEIA

        Gladiador vencedor = combate.obterVencedor();
        plateia.reagir(vencedor);

    }

}

