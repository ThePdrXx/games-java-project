// Nome: Pedro Vinicius de Carvalho
// Ra: 2475340 

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

// Nome: Pedro Vinicius de Carvalho
// Ra: 2475340
public class CustoException extends Exception{

    public void corrigeCusto(Game g) {
        try{
            g.setCusto(Double.parseDouble(showInputDialog(null, "Informe o custo novamente", "Atualização", JOptionPane.QUESTION_MESSAGE)));
        } catch (CustoException ce) {
            System.out.println("O custo tem que ser maior do que 0");
            ce.corrigeCusto(g);
        }
    }
}
