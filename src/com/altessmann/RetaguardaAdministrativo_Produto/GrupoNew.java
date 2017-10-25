/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altessmann.RetaguardaAdministrativo_Produto;

/**
 *
 * @author EngComp
 */
public class GrupoNew extends javax.swing.JFrame {

    /**
     * Creates new form GrupoNew
     */
    public GrupoNew() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextDescricao = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonGravar1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        AreaObs2 = new javax.swing.JTextArea();
        LabelObservacao2 = new javax.swing.JLabel();
        jButtonPesquisar = new javax.swing.JButton();
        jTextPesquisar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableGrupo = new javax.swing.JTable();
        jButtonNovo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("3D - Soluções Tecnológicas - Grupo");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel21.setText("Nome:");

        jTextDescricao.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextDescricao.setForeground(new java.awt.Color(153, 153, 153));
        jTextDescricao.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescricaoActionPerformed(evt);
            }
        });

        jButtonNovo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo.setText("Novo Grupo");
        jButtonNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar24x24.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close24x24.png"))); // NOI18N
        jButtonExcluir.setText("Excluir ");
        jButtonExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonGravar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save24x24.png"))); // NOI18N
        jButtonGravar.setText("Salvar ");
        jButtonGravar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonGravar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel24x24.png"))); // NOI18N
        jButtonGravar1.setText("Cancelar");
        jButtonGravar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonGravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravar1ActionPerformed(evt);
            }
        });

        AreaObs2.setColumns(1);
        AreaObs2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        AreaObs2.setLineWrap(true);
        AreaObs2.setRows(1);
        AreaObs2.setPreferredSize(null);
        jScrollPane5.setViewportView(AreaObs2);

        LabelObservacao2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelObservacao2.setText("Descrição:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LabelObservacao2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonEditar)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonExcluir)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonGravar)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonGravar1))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelObservacao2)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGravar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jButtonPesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PesquisarCli.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar ");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextPesquisar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextPesquisar.setForeground(new java.awt.Color(153, 153, 153));
        jTextPesquisar.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextPesquisar.setPreferredSize(new java.awt.Dimension(500, 25));
        jTextPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPesquisarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableGrupo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nome", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableGrupo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableGrupo.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        jTableGrupo.setMinimumSize(new java.awt.Dimension(770, 800));
        jTableGrupo.setRowHeight(20);
        jTableGrupo.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTableGrupo);
        if (jTableGrupo.getColumnModel().getColumnCount() > 0) {
            jTableGrupo.getColumnModel().getColumn(0).setMinWidth(200);
            jTableGrupo.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTableGrupo.getColumnModel().getColumn(0).setMaxWidth(200);
            jTableGrupo.getColumnModel().getColumn(1).setMinWidth(350);
            jTableGrupo.getColumnModel().getColumn(1).setPreferredWidth(350);
            jTableGrupo.getColumnModel().getColumn(1).setMaxWidth(350);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jScrollPane3)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jButtonNovo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo1.setText("Adicionar");
        jButtonNovo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jButtonPesquisar)
                .addGap(5, 5, 5)
                .addComponent(jButtonNovo1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescricaoActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        //        this.jButtonNovo.setEnabled(false);
        //        this.ativaCampo();
        //        this.limpaCampo();
        //        this.jButtonGravar.setEnabled(true);
        //        this.setNovoCodigo();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        //        this.ativaCampo();
        //        this.jButtonGravar.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        //        try {
            //                if (grupoDAO.ContaCod(Integer.parseInt(jTextCodigo.getText())) == 0) {
                //                    this.setGrupo();
                //                } else {
                //                    this.atualizaGrupo();
                //                }
            //                this.desativaCampo();
            //                this.jButtonGravar.setEnabled(false);
            //                this.jButtonNovo.setEnabled(true);
            //            } catch (SQLException ex) {
            //                Logger.getLogger(ClienteNew.class.getName()).log(Level.SEVERE, null, ex);
            //                JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos!", "Erro", JOptionPane.WARNING_MESSAGE);
            //            }
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonGravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravar1ActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        //        DefaultTableModel model = (DefaultTableModel) jTableGrupo.getModel();
        //        if (model.getRowCount() > 0) {
            //            while (model.getRowCount() > 0) {
                ////                model.removeRow(0); // limpa a tabela
                //            }
            //        }
        //        String nome=jTextPesquisar.getText();
        //        try {
            //            if (!grupoDAO.getGrupo(nome).isEmpty()) {
                //                for(int i=0;i<grupoDAO.numeroLinhas;i++){
                    //                     model.addRow(new String[]{grupoDAO.getGrupo(nome).get(i).getCodigo()+"",grupoDAO.getGrupo(nome).get(i).getDescricao()+""});
                    //                }
                //                this.jButtonEditar.setEnabled(true);
                //            } else {
                //                JOptionPane.showMessageDialog(null, "O grupo '" + nome+ "' não está cadastrado!", "Código não cadastrado", JOptionPane.INFORMATION_MESSAGE);
                //                this.desativaCampo();
                //                this.jTextCodigo.setText(null);
                //                this.jButtonEditar.setEnabled(false);
                //            }
            //
            //        } catch (SQLException ex) {
            //            System.out.println(ex);
            //            JOptionPane.showMessageDialog(null, "Erro ao buscar o dado no banco de dados! #0x0002", "Erro", JOptionPane.ERROR_MESSAGE);
            //        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPesquisarActionPerformed

    private void jButtonNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo1ActionPerformed

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
            java.util.logging.Logger.getLogger(GrupoNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrupoNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrupoNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrupoNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrupoNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaObs2;
    private javax.swing.JLabel LabelObservacao2;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonGravar1;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonNovo1;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableGrupo;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextPesquisar;
    // End of variables declaration//GEN-END:variables
}
