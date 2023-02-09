// Nome: Pedro Vinicius de Carvalho
// Ra: 2475340

import javax.swing.JOptionPane;

public class JanPlay extends javax.swing.JFrame {

    
    private static JanPlay janPlay;
    private Game game;
    
    private JanPlay() {
        initComponents();
    }
    
    public static JanPlay getJanPlay(){
    
        if(janPlay == null){
            janPlay = new JanPlay();
        }
        return janPlay;
    }
    
    public void setGame(Game game){
        this.game = game;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ctAno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ctRes = new javax.swing.JTextField();
        btCade = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        chPsMove = new javax.swing.JCheckBox();
        chPs4 = new javax.swing.JCheckBox();
        chPs5 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setText("Playstation:");

        jLabel2.setText("Ano de lançamento:");

        ctAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctAnoActionPerformed(evt);
            }
        });

        jLabel3.setText("Resolução:");

        ctRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctResActionPerformed(evt);
            }
        });

        btCade.setText("Cadastrar");
        btCade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadeActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.setToolTipText("");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        chPsMove.setText("PsMove");

        chPs4.setText("Ps4");

        chPs5.setText("Ps5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ctRes)
                    .addComponent(jLabel3)
                    .addComponent(ctAno)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chPsMove)
                    .addComponent(chPs5)
                    .addComponent(chPs4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btCade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chPs5)
                            .addComponent(ctAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(chPs4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctRes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCade)
                            .addComponent(btLimpar)
                            .addComponent(btSair))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chPsMove)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctAnoActionPerformed

    private void ctResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctResActionPerformed

    private void btCadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadeActionPerformed
        cadPlay();
        limpar();
        if(CadGame.getCadGame().verificaXbox()){
            JanXbox.getJanXbox().setVisible(true);
            JanXbox.getJanXbox().setGame(game);
        }
        else{
            GerGame.getGerGame().cadGame(game);
            CadGame.getCadGame().limpar();
            if (game != null) {
                JOptionPane.showMessageDialog(null, "Game cadastrado com sucesso!", "Cadastro OK", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Já existe um game com este codigo!", "ERRO de codigo", 0);
            }
        }
        limpar();
        this.dispose();
    }//GEN-LAST:event_btCadeActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    
    void cadPlay(){
        game.getPlaystation().setAnoLancamento(Integer.parseInt(ctAno.getText()));
        game.getPlaystation().setResolucao(ctRes.getText());
        game.getPlaystation().setPsMove(chPsMove.isSelected());
        game.getPlaystation().setPsMove(chPs4.isSelected());
        game.getPlaystation().setPsMove(chPs5.isSelected());
        
        JOptionPane.showMessageDialog(null, "Plataforma Cadastrada", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair","Confirmar Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public void limpar(){
        ctAno.setText("");
        ctRes.setText("");
        chPsMove.setSelected(false);
        chPs4.setSelected(false);
        chPs5.setSelected(false);
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanPlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCade;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JCheckBox chPs4;
    private javax.swing.JCheckBox chPs5;
    private javax.swing.JCheckBox chPsMove;
    private javax.swing.JTextField ctAno;
    private javax.swing.JTextField ctRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
