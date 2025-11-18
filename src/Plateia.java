
public class Plateia {
    private int nivelAnimacao; // 0-100
    
    public Plateia() {
        this.nivelAnimacao = 50;
    }
    
    public void reagir () {
        System.out.println("\\n=== REAÇÃO DA PLATEIA ===");
        
        if (nivelAnimacao >= 80) {
            System.out.println("🎉 A MULTIDÃO ESTÁ EUFÓRICA! 🎉");
        } else if (nivelAnimacao >= 50) {
            System.out.println("👏 A plateia aplaude!");
        } else {
            System.out.println("😐 A plateia está decepcionada...");
        }
    }
    
    public void aumentarAnimacao(int valor) {
        nivelAnimacao += valor;
        if (nivelAnimacao > 100) nivelAnimacao = 100;
    }
    
    public void diminuirAnimacao(int valor) {
        nivelAnimacao -= valor;
        if (nivelAnimacao < 0) nivelAnimacao = 0;
    }
}