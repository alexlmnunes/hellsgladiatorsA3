public class CalcularDano{

private static final int CHANCE_CRITICO = 15;

public int CalcularDano(Gladiador atacante, Gladiador defensor){
    Arma arma = atacante.getArma();
    int danoBase = arma. getForcaBase();



    //1. Verificar crítico

    boolean critico = false;

    if(atacante.podeCritico() && Aleatorio.chance.(CHANCE_CRITICO)){
    danoBase *= 2;
    critico = true;
    system.out.println(" CRÍTICO! ")
    
}

// 2 BONÛS DO HOPLOMACHUS DO PRIMEIRO ATAQUE

if (atacante.getTipoCLassa().equals(ConfiguracaoClasse.HOPLOMACHUS)){
if (atacante.getStatus().isPrimeiroAtaque()){
danoBase += 2;
system.out.println(" COUNTER! +2 DANO ");
}
}

// 3.BONUS DO SECUTOR CONTRA RETIARIUS
if(atacante)
}
}





























}