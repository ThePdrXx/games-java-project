// Nome: Pedro Vinicius de Carvalho
// Ra: 2475340
public class Game implements CalculoAcrescimo {
    private int codeGame;
    private String nome;
    private String categoria;
    private double custo;
    private Xbox xbox;
    private Playstation playstation;
    private Windows windows;

    public Game() {
        codeGame = 0;
        nome = "";
        custo = 0;
        categoria = "";
        xbox = new Xbox();
        playstation = new Playstation();
        windows = new Windows();
    }

    public Game(int codeGame, String nome, String categoria, double custo, Xbox xbox, Playstation playstation, Windows windows) {
        this.codeGame = codeGame;
        this.nome = nome;
        this.categoria = categoria;
        this.custo = custo;
        this.xbox = xbox;
        this.playstation = playstation;
        this.windows = windows;
    }

    public int getCodeGame() {
        return codeGame;
    }

    public void setCodeGame(int codeGame) {
        this.codeGame = codeGame;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) throws CustoException {
        if (custo >= 0) {
            this.custo = custo;
        } else {
            throw new CustoException();
        }
    }

    public Xbox getXbox() {
        return xbox;
    }

    public void setXbox(Xbox xbox) {
        this.xbox = xbox;
    }

    public Playstation getPlaystation() {
        return playstation;
    }

    public void setPlaystation(Playstation playstation) {
        this.playstation = playstation;
    }

    public Windows getWindows() {
        return windows;
    }

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    // Implementação da interface CalculoAcrescimo
    public double calculo() {
        return custo * 1.1;
    }
}
