
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Emilia
 */
public class Form2 extends javax.swing.JFrame {

    int[][] array = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
    int change = -1;
    int scoreX = 0;
    int scoreO = 0;
    

    /**
     * Creates new form Form2
     */
    public Form2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonNewGame = new javax.swing.JButton();
        jButtonClearResults = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Tao");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Player X:");
        jPanel1.add(jLabel2);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");
        jPanel1.add(jLabel4);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Player O:");
        jPanel1.add(jLabel5);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");
        jPanel1.add(jLabel3);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButtonNewGame.setText("New game");
        jButtonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewGameActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNewGame);

        jButtonClearResults.setText("Clear result");
        jButtonClearResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearResultsActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClearResults);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String click() {
        change *= -1;
        if (change == 1) {
            return "X";
        } else {
            return "O";
        }
    }

    public void win() throws ArrayIndexOutOfBoundsException {
        boolean Owin = false;
        boolean Xwin = false;
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();

        if (b1 == "X" && b1 == b2 && b2 == b3) {
            JOptionPane.showMessageDialog(null, "Player X wins");
            scoreX++;
            jLabel4.setText(Integer.toString(scoreX));
        } else if (b4 == "X" && b4 == b5 && b5 == b6) {
            JOptionPane.showMessageDialog(null, "Player X wins");
            scoreX++;
            jLabel4.setText(Integer.toString(scoreX));
        } else if (b7 == "X" && b7 == b8 && b8 == b9) {
            JOptionPane.showMessageDialog(null, "Player X wins");
            scoreX++;
            jLabel4.setText(Integer.toString(scoreX));
        } else if (b1 == "X" && b1 == b4 && b4 == b7) {
            JOptionPane.showMessageDialog(null, "Player X wins");
            scoreX++;
            jLabel4.setText(Integer.toString(scoreX));
        } else if (b2 == "X" && b2 == b5 && b5 == b8) {
            JOptionPane.showMessageDialog(null, "Player X wins");
            scoreX++;
            jLabel4.setText(Integer.toString(scoreX));
        } else if (b3 == "X" && b3 == b6 && b6 == b9) {
            JOptionPane.showMessageDialog(null, "Player X wins");
            scoreX++;
            jLabel4.setText(Integer.toString(scoreX));
        } else if (b1 == "X" && b1 == b5 && b5 == b9) {
            JOptionPane.showMessageDialog(null, "Player X wins");
            scoreX++;
            jLabel4.setText(Integer.toString(scoreX));
        } else if (b3 == "X" && b3 == b5 && b5 == b7) {
            JOptionPane.showMessageDialog(null, "Player X wins");
            scoreX++;
            jLabel4.setText(Integer.toString(scoreX));
        } else if (b1 == "O" && b1 == b2 && b2 == b3) {
            JOptionPane.showMessageDialog(null, "Player O wins");
            scoreO++;
            jLabel3.setText(Integer.toString(scoreO));
        } else if (b4 == "O" && b4 == b5 && b5 == b6) {
            JOptionPane.showMessageDialog(null, "Player O wins");
            scoreO++;
            jLabel3.setText(Integer.toString(scoreO));
        } else if (b7 == "O" && b7 == b8 && b8 == b9) {
            JOptionPane.showMessageDialog(null, "Player O wins");
            scoreO++;
            jLabel3.setText(Integer.toString(scoreO));
        } else if (b1 == "O" && b1 == b4 && b4 == b7) {
            JOptionPane.showMessageDialog(null, "Player O wins");
            scoreO++;
            jLabel3.setText(Integer.toString(scoreO));
        } else if (b2 == "O" && b2 == b5 && b5 == b8) {
            JOptionPane.showMessageDialog(null, "Player O wins");
            scoreO++;
            jLabel3.setText(Integer.toString(scoreO));
        } else if (b3 == "O" && b3 == b6 && b6 == b9) {
            JOptionPane.showMessageDialog(null, "Player O wins");
            scoreO++;
            jLabel3.setText(Integer.toString(scoreO));
        } else if (b1 == "O" && b1 == b5 && b2 == b9) {
            JOptionPane.showMessageDialog(null, "Player O wins");
            scoreO++;
            jLabel3.setText(Integer.toString(scoreO));
        } else if (b3 == "O" && b3 == b5 && b5 == b7) {
            JOptionPane.showMessageDialog(null, "Player O wins");
            scoreO++;
            jLabel3.setText(Integer.toString(scoreO));
        }

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(click());
        jButton3.setEnabled(false);
        win();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(click());
        jButton1.setEnabled(false);
        win();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(click());
        jButton2.setEnabled(false);
        win();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(click());
        jButton4.setEnabled(false);
        win();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(click());
        jButton5.setEnabled(false);
        win();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(click());
        jButton6.setEnabled(false);
        win();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(click());
        jButton7.setEnabled(false);
        win();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(click());
        jButton8.setEnabled(false);
        win();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(click());
        jButton9.setEnabled(false);
        win();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewGameActionPerformed
        // TODO add your handling code here:
        jButton1.setText(null);
        jButton1.setEnabled(true);
        jButton2.setText(null);
        jButton2.setEnabled(true);
        jButton3.setText(null);
        jButton3.setEnabled(true);
        jButton4.setText(null);
        jButton4.setEnabled(true);
        jButton5.setText(null);
        jButton5.setEnabled(true);
        jButton6.setText(null);
        jButton6.setEnabled(true);
        jButton7.setText(null);
        jButton7.setEnabled(true);
        jButton8.setText(null);
        jButton8.setEnabled(true);
        jButton9.setText(null);
        jButton9.setEnabled(true);
        change = -1;


    }//GEN-LAST:event_jButtonNewGameActionPerformed

    private void jButtonClearResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearResultsActionPerformed
        // TODO add your handling code here:
        scoreX = 0;
        scoreO = 0;
        jLabel3.setText("0");
        jLabel4.setText("0");
    }//GEN-LAST:event_jButtonClearResultsActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.isResizable();
        this.setSize(550, 266);
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Form2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonClearResults;
    private javax.swing.JButton jButtonNewGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
