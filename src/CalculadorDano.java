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

if (atacante.getTipoClasse().equals(ConfiguracaoClasse.HOPLOMACHUS) && atacante.getStatus().isPrimeiroAtaque()){
danoBase *= 2;// Primeiro golpe sempre crítico
atacante.getStatus().usouPrimeiroAtaque();
system.out.println(" PRIMEIRO DISPARO FOI PERFEITO! ");

}

// 3.BONUS DO SECUTOR CONTRA RETIARIUS
if(atacante.getTipoClasse().equals(ConfiguracaoClasse.SECUTOR) && defensor.getTipoClasse().equals(ConfiguracaoClasse.RETIARIUS)){
    danoBase +=2;
system.out.println(" COUNTER! +2 DE DANO ")
}

//4. PENALIDADE DO SECUTOR CONTRA OUTRAS CLASSES

if (atacante.getTipoClasse().equals(ConfiguracaoClasse.SECUTOR) && !defensor.getTipoClasse().equals(ConfiguracaoClasse.RETIARIUS)){
danoBase -=1;
}


}
}





























}