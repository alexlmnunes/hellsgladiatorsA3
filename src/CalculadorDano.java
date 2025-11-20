public class CalculadorDano{

private static final int CHANCE_CRITICO = 15;

public int CalcularDano(Gladiador atacante, Gladiador defensor){
    Arma arma = atacante.getArma();
    int danoBase = arma. getForcaBase();

    //1. Verificar crítico

    boolean critico = false;

    if(atacante.poderCritico() && Aleatorio.chance(CHANCE_CRITICO)){
    danoBase *= 2;
    critico = true;
    System.out.println(" CRÍTICO! ")
    
}

// 2 BONÛS DO HOPLOMACHUS DO PRIMEIRO ATAQUE

if (atacante.getTipoClasse().equals(ConfiguracaoClasse.HOPLOMACHUS) && atacante.getStatus().isPrimeiroAtaque()){
danoBase *= 2;// Primeiro golpe sempre crítico
atacante.getStatus().usouPrimeiroAtaque();
System.out.println(" PRIMEIRO DISPARO FOI PERFEITO! ");

}

// 3.BONUS DO SECUTOR CONTRA RETIARIUS
if(atacante.getTipoClasse().equals(ConfiguracaoClasse.SECUTOR) && defensor.getTipoClasse().equals(ConfiguracaoClasse.RETIARIUS)){
    danoBase +=2;
System.out.println(" COUNTER! +2 DE DANO ")
}

//4. PENALIDADE DO SECUTOR CONTRA OUTRAS CLASSES

if (atacante.getTipoClasse().equals(ConfiguracaoClasse.SECUTOR) && !defensor.getTipoClasse().equals(ConfiguracaoClasse.RETIARIUS)){
danoBase -=1;
}

//5. APLICA HABILIDADES ESPECIAIS DA ARMA
aplicarHabilidadeArma(atacante,defensor,arma);

//6. APLICA ARMADURA(SE A ARMA NAO IGNORAR)
int danoFinal = danoBase;
if (!arma.ignoraArmadura() && defensor.temArmadura()){
    danoFinal = danoBase - defensor.getReducaoDano();
    if (danoFinal < 0) dano final = 0;
}

return danoFinal;

}

private void  aplicarHabilidadeArma(Gladiador atacante, Gladiador defensor, Arma arma);
String habilidade = arma.getHabilidadeEspecial();

switch(habilidade){
    case "Duplo Ataque":
        if(Aleatorio.chance(arma.getChanceHabilidade())){
            system.out.println(" DUPLO ATAQUE");
            // Segundo ataque será executado no próximo turno
        }
        break;

    case "Desarmar":
        if(Aleatorio.chance(arma.getChanceHabilidade())){
            defensor.getStatus().Desarmar();
            system.out.println(" DESARME! Oponente perde arma! ")
        }
        break;

    case "Quebrar Armadura":
        defensor.getStatus().adicionarGolpeEscudo();
        if(defensor.getStatus().getGolpesNoEscudo() >= 2){
            defensor.quebrarArmadura();
            system.out.println(" ARMADURA DESTRUÍDA ");
        }
        break;

    case "Paralisar":
        defensor.getStatus().Paralisar();
        system.out.println(" PARALISADO! Perde o próximo turno")
        break;    
}
    //SANGRAMENTO DO THRAEX
    if(atacante.getTipoCLasse().equals(ConfiguracaoClasse.THRAEX)){
       if(Aleatorio.chance(20)){
        defensor.getStatus().causarSangramento();
        system.out.println(" SANGRAMENTO! 1 DANO POR 2 TURNOS !")
       } 

    }
}






























}