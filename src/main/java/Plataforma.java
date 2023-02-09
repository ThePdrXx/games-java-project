// Nome: Pedro Vinicius de Carvalho
// Ra: 2475340
public abstract class Plataforma {
    private int anoLancamento;
    private String resolucao;

    // Polimorfismo por sobrecarga
    public Plataforma() {
        anoLancamento = 0;
        resolucao = "";
    }

    public Plataforma(int anoLancamento, String resolucao) {
        this.anoLancamento = anoLancamento;
        this.resolucao = resolucao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
}
