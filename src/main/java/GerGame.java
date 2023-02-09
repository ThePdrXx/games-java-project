// Nome: Pedro Vinicius de Carvalho
// Ra: 2475340

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

public class GerGame {

    private Game game;
    private List<Game> bdGame;

    private static GerGame gerGame;

    private GerGame() {
        bdGame = new ArrayList();
    }

    public static GerGame getGerGame() {

        if (gerGame == null) {
            gerGame = new GerGame();
        }
        return gerGame;
    }

    public List<Game> getBdGame() {
        return bdGame;
    }

    public Game cadGame(Game game) {

        if (consGameCode(game) == null) {
            bdGame.add(game);
            return game;
        } else {
            return null;
        }

    }//fim cadGame

    public Game consGameCode(Game game) {
        for (int i = 0; i < bdGame.size(); i++) {
            if (game.getCodeGame() == bdGame.get(i).getCodeGame()) {
                return bdGame.get(i);
            }
        }
        return null;
    }//fim consGame

    public Game removeGame(Game game) {
        Game aux = consGameCode(game);

        if (aux != null) {
            bdGame.remove(aux);
            return null;
        } else {
            return game;
        }

    }//fim removeGame

    public Game atualizaGame(Game game) {
        for (int i = 0; i < bdGame.size(); i++) {
            if (game.getCodeGame() == bdGame.get(i).getCodeGame()) {
                try {
                    int code = Integer.parseInt(showInputDialog(null, "Informe o NOVO código", "Atualização", JOptionPane.QUESTION_MESSAGE));
                    game.setCodeGame(code);
                    String nome = showInputDialog(null, "Informe a NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                    game.setNome(nome);
                    int custo = Integer.parseInt(showInputDialog(null, "Informe o NOVO custo", "Atualização", JOptionPane.QUESTION_MESSAGE));
                    game.setCusto(custo);
                } catch (CustoException ce) {
                    JOptionPane.showMessageDialog(null, "O valor deve ser positivo", "Erro no Preco", 2);
                    ce.corrigeCusto(game);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "O codigo deve ser um inteiro!", "ERRO de codigo", 0);
                } //fim catch

                String categoria = showInputDialog(null, "Informe a NOVA categoria", "Atualização", JOptionPane.QUESTION_MESSAGE);
                game.setCategoria(categoria);

                bdGame.set(i, game);
                return bdGame.get(i);
            }
        }
        return null;
    }//fim atualizaGame

}//fim da classe
