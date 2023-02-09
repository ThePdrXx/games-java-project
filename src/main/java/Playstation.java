// Nome: Pedro Vinicius de Carvalho
// Ra: 2475340
public class Playstation extends Plataforma{
    private boolean psMove;
    private boolean ps4;
    private boolean ps5;

    // Polimorfismo por sobrecarga
    public Playstation() {
        psMove = false;
        ps4 = false;
        ps5 = false;
    }

    public Playstation(String nome, int anoLancamento, String resolucao, boolean psMove, boolean ps4, boolean ps5) {
        super(anoLancamento, resolucao);
        this.psMove = psMove;
        this.ps4 = ps4;
        this.ps5 = ps5;
    }

    public boolean getPsMove() {
        return psMove;
    }

    public void setPsMove(boolean psMove) {
        this.psMove = psMove;
    }

    public boolean getPs4() {
        return ps4;
    }

    public void setPs4(boolean ps4) {
        this.ps4 = ps4;
    }

    public boolean getPs5() {
        return ps5;
    }

    public void setPs5(boolean ps5) {
        this.ps5 = ps5;
    }
}
