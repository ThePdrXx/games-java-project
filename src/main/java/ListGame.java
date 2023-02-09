// Nome: Pedro Vinicius de Carvalho
// Ra: 2475340 

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListGame extends javax.swing.JFrame {

    private Game game;

    private static ListGame listGameUnico;

    private ListGame() {
        initComponents();
    }

    public static ListGame getListGame() {
        if (listGameUnico == null) {
            listGameUnico = new ListGame();
        }
        return listGameUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGame = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAlter = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnExc = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        ctCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tblGame.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGame);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Lista de Games:");

        jLabel2.setText("Digite o código do Game:");

        btnAlter.setText("Alterar");
        btnAlter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterActionPerformed(evt);
            }
        });

        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnExc.setText("Excluir");
        btnExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ctCode, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnConsulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExc)))
                        .addGap(0, 143, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSair))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ctCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlter)
                    .addComponent(btnConsulta)
                    .addComponent(btnExc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnSair))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consGameCode();
        listarTab();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcActionPerformed
        excluir();
        listarTab();
    }//GEN-LAST:event_btnExcActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
        listarTab();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarTab();
    }//GEN-LAST:event_formWindowActivated

    public void excluir() {
        game = new Game();

        try {
            game.setCodeGame(Integer.parseInt(ctCode.getText()));

            int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o Game!", "Exclusão de Game", JOptionPane.YES_NO_CANCEL_OPTION);
            if (x == 0) {
                game = GerGame.getGerGame().removeGame(game);

                if (game == null) {
                    JOptionPane.showMessageDialog(null, "Game removida com sucesso!", "Remoção de Game", 1);
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "Não existe game com este código!", "Game inexistente", 0);
                    ctCode.setText("");
                    ctCode.requestFocus();
                }

            }
        } //fim try
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O código deve ser um inteiro!", "ERRO de Código", 0);
            ctCode.setText("");
            ctCode.requestFocus();
        } //fim catch
    }

    public void consGameCode() {
        game = new Game();

        try {
            game.setCodeGame(Integer.parseInt(ctCode.getText()));

            game = GerGame.getGerGame().consGameCode(game);

            if (game != null) {
                String imp = "DADOS DO GAME!\n\nCÓDIGO: " + game.getCodeGame()
                        + "\n\nNOME: " + game.getNome()
                        + "\n\nCUSTO: "+ "R$ " + game.getCusto()
                        + "\n\nCATEGORIA: " + game.getCategoria();
                JOptionPane.showMessageDialog(null, imp, "Consulta por Código", 3);
                JOptionPane.showMessageDialog(null, "Confirme os dados do Game", "Consulta de dados", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Não existe pessoa com este código!", "Game inexistente", 0);
                ctCode.setText("");
                ctCode.requestFocus();
            }
        } //fim try
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O código deve ser um inteiro!", "ERRO de código", 0);
            ctCode.setText("");
            ctCode.requestFocus();
        } //fim catch
    }

    public void alterar() {
        game = new Game();

        try {
            game.setCodeGame(Integer.parseInt(ctCode.getText()));

            game = GerGame.getGerGame().atualizaGame(game);

            if (game != null) {
                ctCode.setText(Integer.toString(game.getCodeGame()));
                ctCode.setText(game.getNome());
                JOptionPane.showMessageDialog(null, "Confira os dados Alterados do Game!", "Game Atualizado", 1);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Não existe pessoa com este código!", "Game inexistente", 0);
                ctCode.setText("");
                ctCode.requestFocus();
            }
        } //fim try
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "O código deve ser um inteiro!", "ERRO de código", 0);
            ctCode.setText("");
            ctCode.requestFocus();
        } //fim catch
    }

    public void listarTab() {
        DefaultTableModel modelo = (DefaultTableModel) tblGame.getModel();

        int posLin = 0;
        modelo.setRowCount(posLin);

        for (Game game : GerGame.getGerGame().getBdGame()) {
            modelo.insertRow(posLin, new Object[]{game.getCodeGame(), game.getNome()});
            posLin++;
        }
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair", "Confirmar Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }

    public void limpar() {
        ctCode.setText("");
        ctCode.requestFocus();
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
            java.util.logging.Logger.getLogger(ListGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlter;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnExc;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField ctCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGame;
    // End of variables declaration//GEN-END:variables
}
