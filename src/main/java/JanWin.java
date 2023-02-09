// Nome: Pedro Vinicius de Carvalho
// Ra: 2475340

import javax.swing.JOptionPane;

public class JanWin extends javax.swing.JFrame {
    
    private static JanWin janWinUnico;
    
    private Game game;
    
    private JanWin() {
        initComponents();
    }

    public static JanWin getCadGame() {
        if(janWinUnico == null) {
            janWinUnico = new JanWin();
        }
        return janWinUnico;
    }
    
    
    public void setGame(Game game) {
        this.game = game;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ctAno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ctRes = new javax.swing.JTextField();
        chJoy = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        ctReqMin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ctReqMax = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Title.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        Title.setText("Windows:");

        jLabel1.setText("Ano de lançamento:");

        ctAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctAnoActionPerformed(evt);
            }
        });

        jLabel2.setText("Resolução:");

        ctRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctResActionPerformed(evt);
            }
        });

        chJoy.setText("Joystick");
        chJoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chJoyActionPerformed(evt);
            }
        });

        jLabel4.setText("Requisitos Minimos:");

        ctReqMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctReqMinActionPerformed(evt);
            }
        });

        jLabel5.setText("Requisitos Máximos:");

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

        btCade.setText("Cadastrar");
        btCade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title)
                            .addComponent(chJoy)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCade)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ctRes, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ctAno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(ctReqMin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(ctReqMax, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctReqMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctRes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctReqMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chJoy)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCade)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctResActionPerformed

    private void ctReqMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctReqMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctReqMinActionPerformed

    private void ctAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctAnoActionPerformed

    private void chJoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chJoyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chJoyActionPerformed

    private void btCadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadeActionPerformed
        cadWindows();
        limpar();
        if(CadGame.getCadGame().verificaPlay()){
            JanPlay.getJanPlay().setVisible(true);
            JanPlay.getJanPlay().setGame(game);
            
        }else if (CadGame.getCadGame().verificaXbox()){
            JanXbox.getJanXbox().setVisible(true);
            JanXbox.getJanXbox().setGame(game);
        }
        else{
            GerGame.getGerGame().cadGame(game);
            if (game != null) {
                JOptionPane.showMessageDialog(null, "Game cadastrado com sucesso!", "Cadastro OK", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Já existe um game com este codigo!", "ERRO de codigo", 0);
            }
            CadGame.getCadGame().limpar();
        }
        
        this.dispose();
    }//GEN-LAST:event_btCadeActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    public void cadWindows() {
        game.getWindows().setAnoLancamento(Integer.parseInt(ctAno.getText()));
        game.getWindows().setResolucao(ctRes.getText());
        game.getWindows().setControle(chJoy.isSelected());
        game.getWindows().setRequisitosMinimos(ctReqMin.getText());
        game.getWindows().setRequisitosRecomendados(ctReqMax.getText());
        
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
        ctReqMin.setText("");
        ctReqMax.setText("");
        chJoy.setSelected(false);
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
            java.util.logging.Logger.getLogger(JanWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton btCade;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JCheckBox chJoy;
    private javax.swing.JTextField ctAno;
    private javax.swing.JTextField ctReqMax;
    private javax.swing.JTextField ctReqMin;
    private javax.swing.JTextField ctRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
