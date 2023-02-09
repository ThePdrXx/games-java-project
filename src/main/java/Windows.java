// Nome: Pedro Vinicius de Carvalho
// Ra: 2475340
public class Windows extends Plataforma{
    private boolean controle;
    private String requisitosMinimos;
    private String requisitosRecomendados;

    //Polimorfismo por sobrecarga
    public Windows() {
        controle = false;
        requisitosMinimos = "";
        requisitosRecomendados = "";
    }

    public Windows(String nome, int anoLancamento, String resolucao, boolean controle, String requisitosMinimos, String requisitosRecomendados) {
        super(anoLancamento, resolucao);
        this.controle = controle;
        this.requisitosMinimos = requisitosMinimos;
        this.requisitosRecomendados = requisitosRecomendados;
    }

    public boolean getControle() {
        return controle;
    }

    public void setControle(boolean controle) {
        this.controle = controle;
    }

    public String getRequisitosMinimos() {
        return requisitosMinimos;
    }

    public void setRequisitosMinimos(String requisitosMinimos) {
        this.requisitosMinimos = requisitosMinimos;
    }

    public String getRequisitosRecomendados() {
        return requisitosRecomendados;
    }

    public void setRequisitosRecomendados(String requisitosRecomendados) {
        this.requisitosRecomendados = requisitosRecomendados;
    }
}
