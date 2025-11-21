public class GerenciadorTurnos {

    private int turnoAtual = 1;

    public void proximoTurno() {
        turnoAtual++;
    }

    public int getTurnoAtual() {
        return turnoAtual;
    }
}
