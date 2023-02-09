// Nome: Pedro Vinicius de Carvalho
// Ra: 2475340
public class Xbox extends Plataforma{
    private boolean kinect;
    private char versao;

    // Polimorfismo por sobrecarga
    public Xbox() {
        kinect = false;
        versao = 'x';
    }

    public Xbox(String nome, int anoLancamento, String resolucao, boolean kinect, char versao) {
        super(anoLancamento, resolucao);
        this.kinect = kinect;
        this.versao = versao;
    }

    public boolean getKinect() {
        return kinect;
    }

    public void setKinect(boolean kinect) {
        this.kinect = kinect;
    }

    public char getVersao() {
        return versao;
    }

    public void setVersao(char versao) {
        this.versao = versao;
    }
}
