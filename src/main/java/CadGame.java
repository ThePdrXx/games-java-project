// Nome: Pedro Vinicius de Carvalho
// Ra: 2475340 

import javax.swing.JOptionPane;

public class CadGame extends javax.swing.JFrame {

    private Game game;

    private static CadGame cadGameUnico;

    private CadGame() {
        initComponents();
    }

    public boolean verificaPlay() {
        return chPlay.isSelected();
    }

    public boolean verificaXbox() {
        return chXbox.isSelected();
    }

    public static CadGame getCadGame() {
        if (cadGameUnico == null) {
            cadGameUnico = new CadGame();
        }
        return cadGameUnico;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        LbName = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        LbCode = new javax.swing.JLabel();
        LbPreco = new javax.swing.JLabel();
        LbCategoria = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chWin = new javax.swing.JCheckBox();
        chPlay = new javax.swing.JCheckBox();
        chXbox = new javax.swing.JCheckBox();
        btnCade = new javax.swing.JButton();
        btnLimpa = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        ctCode = new javax.swing.JTextField();
        ctPreco = new javax.swing.JTextField();
        ctCategoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");

        Title.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        Title.setText("Cadastro de Game:");

        LbName.setText("Nome:");

        ctNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNomeActionPerformed(evt);
            }
        });

        LbCode.setText("Código:");

        LbPreco.setText("Preço:");

        LbCategoria.setText("Categoria:");

        jLabel2.setText("Plataformas:");

        chWin.setText("Windows");
        chWin.setToolTipText("");
        chWin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chWinActionPerformed(evt);
            }
        });

        chPlay.setText("Playstation");
        chPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chPlayActionPerformed(evt);
            }
        });

        chXbox.setText("Xbox");

        btnCade.setText("Cadastrar");
        btnCade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadeActionPerformed(evt);
            }
        });

        btnLimpa.setText("Limpar");
        btnLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chXbox)
                    .addComponent(jLabel2)
                    .addComponent(Title)
                    .addComponent(chWin)
                    .addComponent(chPlay)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(LbCategoria)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LbName)
                                .addComponent(LbCode)
                                .addComponent(LbPreco))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ctNome, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(ctPreco)
                                .addComponent(ctCode)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbName)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbPreco)
                    .addComponent(ctPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbCategoria)
                    .addComponent(ctCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chWin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chPlay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chXbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpa)
                    .addComponent(btnSair)
                    .addComponent(btnCade))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctNomeActionPerformed

    private void chWinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chWinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chWinActionPerformed

    private void btnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimpaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadeActionPerformed
        cadGame();
        this.dispose();
    }//GEN-LAST:event_btnCadeActionPerformed

    private void chPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chPlayActionPerformed

    public void cadGame() {
        game = new Game();

        try {
            game.setCodeGame(Integer.parseInt(ctCode.getText()));
            game.setNome(ctNome.getText());
            game.setCategoria(ctCategoria.getText());
            game.setCusto(Integer.parseInt(ctPreco.getText()));

            if (chWin.isSelected()) {
                JanWin.getCadGame().setGame(game);
                JanWin.getCadGame().setVisible(true);
            } else if (chPlay.isSelected()) {
                JanPlay.getJanPlay().setGame(game);
                JanPlay.getJanPlay().setVisible(true);
            } else if (chXbox.isSelected()) {
                JanXbox.getJanXbox().setGame(game);
                JanXbox.getJanXbox().setVisible(true);
            } else {
                game = GerGame.getGerGame().cadGame(game);
                if (game != null) {
                    JOptionPane.showMessageDialog(null, "Game cadastrado com sucesso!", "Cadastro OK", 1);
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "Já existe um game com este codigo!", "ERRO de codigo", 0);
                    ctCode.setText("");
                    ctCode.requestFocus();
                }
            }

        } //fim try
        catch (CustoException ce) {
            JOptionPane.showMessageDialog(null, "O valor deve ser positivo", "Erro no Preco", 2);
            ce.corrigeCusto(game);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O codigo deve ser um inteiro!", "ERRO de codigo", 0);
            ctCode.setText("");
            ctCode.requestFocus();
        } //fim catch
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair", "Confirmar Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }

    public void limpar() {
        ctNome.setText("");
        ctCode.setText("");
        ctPreco.setText("");
        ctCategoria.setText("");
        chPlay.setSelected(false);
        chWin.setSelected(false);
        chXbox.setSelected(false);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbCategoria;
    private javax.swing.JLabel LbCode;
    private javax.swing.JLabel LbName;
    private javax.swing.JLabel LbPreco;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnCade;
    private javax.swing.JButton btnLimpa;
    private javax.swing.JButton btnSair;
    private javax.swing.JCheckBox chPlay;
    private javax.swing.JCheckBox chWin;
    private javax.swing.JCheckBox chXbox;
    private javax.swing.JTextField ctCategoria;
    private javax.swing.JTextField ctCode;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctPreco;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
