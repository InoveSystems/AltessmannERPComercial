/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altessmann.RetaguardaAdministrativoFinanceiro;

/**
 *
 * @author EngComp
 */
public class TalonarioChequeNew extends javax.swing.JFrame {

    /**
     * Creates new form TalonarioChequeNew
     */
    public TalonarioChequeNew() {
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
        jTextCodigo1 = new javax.swing.JTextField();
        LabelCodigo1 = new javax.swing.JLabel();
        jTextCodigo3 = new javax.swing.JTextField();
        LabelCodigo3 = new javax.swing.JLabel();
        jButtonNovo2 = new javax.swing.JButton();
        jTextCodigo2 = new javax.swing.JTextField();
        LabelCodigo2 = new javax.swing.JLabel();
        jTextCodigo4 = new javax.swing.JTextField();
        jComboGrupo = new javax.swing.JComboBox();
        LabelCodigo4 = new javax.swing.JLabel();
        jButtonGravar1 = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jTextPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        PanelSubgrupo = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSubGrupo = new javax.swing.JTable();
        jButtonNovo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextCodigo1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextCodigo1.setForeground(new java.awt.Color(153, 153, 153));
        jTextCodigo1.setText("000543");
        jTextCodigo1.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextCodigo1.setPreferredSize(null);
        jTextCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigo1ActionPerformed(evt);
            }
        });

        LabelCodigo1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelCodigo1.setText("Conta Caixa:");

        jTextCodigo3.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextCodigo3.setForeground(new java.awt.Color(153, 153, 153));
        jTextCodigo3.setText("000543");
        jTextCodigo3.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextCodigo3.setPreferredSize(null);
        jTextCodigo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigo3ActionPerformed(evt);
            }
        });

        LabelCodigo3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelCodigo3.setText("Talão:");

        jButtonNovo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo2ActionPerformed(evt);
            }
        });

        jTextCodigo2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextCodigo2.setForeground(new java.awt.Color(153, 153, 153));
        jTextCodigo2.setText("000543");
        jTextCodigo2.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextCodigo2.setPreferredSize(null);
        jTextCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigo2ActionPerformed(evt);
            }
        });

        LabelCodigo2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelCodigo2.setText("Numero:");

        jTextCodigo4.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextCodigo4.setForeground(new java.awt.Color(153, 153, 153));
        jTextCodigo4.setText("000543");
        jTextCodigo4.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextCodigo4.setPreferredSize(null);
        jTextCodigo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigo4ActionPerformed(evt);
            }
        });

        jComboGrupo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        LabelCodigo4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelCodigo4.setText("Status Talão:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LabelCodigo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LabelCodigo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCodigo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonNovo2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCodigo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LabelCodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelCodigo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNovo2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(LabelCodigo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextCodigo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextCodigo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelCodigo3)
                        .addComponent(jTextCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelCodigo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelCodigo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        jButtonGravar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel24x24.png"))); // NOI18N
        jButtonGravar1.setText("Cancelar");
        jButtonGravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravar1ActionPerformed(evt);
            }
        });

        jButtonGravar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save24x24.png"))); // NOI18N
        jButtonGravar.setText("Salvar ");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close24x24.png"))); // NOI18N
        jButtonExcluir.setText("Excluir ");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar24x24.png"))); // NOI18N
        jButtonEditar.setText("Editar ");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonNovo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo.setText("Novo ");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
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

        jButtonPesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PesquisarCli.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar ");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        PanelSubgrupo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableSubGrupo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableSubGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Conta Caixa", "Talão", "Numero", "Status Talão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSubGrupo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableSubGrupo.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        jTableSubGrupo.setMinimumSize(new java.awt.Dimension(770, 800));
        jTableSubGrupo.setRowHeight(20);
        jTableSubGrupo.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTableSubGrupo);
        if (jTableSubGrupo.getColumnModel().getColumnCount() > 0) {
            jTableSubGrupo.getColumnModel().getColumn(0).setMinWidth(150);
            jTableSubGrupo.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTableSubGrupo.getColumnModel().getColumn(0).setMaxWidth(150);
            jTableSubGrupo.getColumnModel().getColumn(1).setMinWidth(150);
            jTableSubGrupo.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTableSubGrupo.getColumnModel().getColumn(1).setMaxWidth(150);
            jTableSubGrupo.getColumnModel().getColumn(2).setMinWidth(150);
            jTableSubGrupo.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTableSubGrupo.getColumnModel().getColumn(2).setMaxWidth(150);
            jTableSubGrupo.getColumnModel().getColumn(3).setMinWidth(150);
            jTableSubGrupo.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTableSubGrupo.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        javax.swing.GroupLayout PanelSubgrupoLayout = new javax.swing.GroupLayout(PanelSubgrupo);
        PanelSubgrupo.setLayout(PanelSubgrupoLayout);
        PanelSubgrupoLayout.setHorizontalGroup(
            PanelSubgrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSubgrupoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3)
                .addGap(5, 5, 5))
        );
        PanelSubgrupoLayout.setVerticalGroup(
            PanelSubgrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSubgrupoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jButtonNovo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo1.setText("Adicionar");
        jButtonNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSubgrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jTextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonPesquisar)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonGravar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGravar1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGravar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButtonNovo1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addComponent(jTextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(PanelSubgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigo1ActionPerformed

    private void jTextCodigo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigo3ActionPerformed

    private void jButtonGravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravar1ActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        //        String terminal = this.jComboGrupo.getSelectedItem() + "";
        //        char[] a = terminal.toCharArray();
        //        int posicao = 0;
        //        for (int i = 0; i < terminal.length(); i++) {
            //            if (a[i] == '-') {
                //                posicao = i;
                //            }
            //        }
        //        int codigoGrupo = Integer.parseInt(terminal.substring(0, posicao));
        //        try {
            //            if (subGrupoDAO.ContaCod(Integer.parseInt(jTextCodigo.getText())) == 0) {
                //                subGrupoDAO.setSubGrupo(jTextDescricao.getText() + "", codigoGrupo, subGrupoBean.getTentativas());
                //            } else {
                //                subGrupoDAO.atualizaSubGrupo(Integer.parseInt(jTextCodigo.getText()), jTextDescricao.getText() + "", codigoGrupo, subGrupoBean.getTentativas());
                //            }
            //            this.desativaCampo();
            //            this.jButtonGravar.setEnabled(false);
            //            this.jButtonNovo.setEnabled(true);
            //        } catch (SQLException ex) {
            //            Logger.getLogger(ClienteNew.class.getName()).log(Level.SEVERE, null, ex);
            //            JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos!", "Erro", JOptionPane.WARNING_MESSAGE);
            //        }
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        //        this.ativaCampo();
        //        this.jButtonGravar.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        //        this.jButtonNovo.setEnabled(false);
        //        this.ativaCampo();
        //        this.limpaCampo();
        //        this.jButtonGravar.setEnabled(true);
        //        this.setNovoCodigo();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPesquisarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        //       DefaultTableModel model = (DefaultTableModel) jTableSubGrupo.getModel();
        //        if (model.getRowCount() > 0) {
            //            while (model.getRowCount() > 0) {
                //                model.removeRow(0); // limpa a tabela
                //            }
            //        }
        //        String nome=jTextPesquisar.getText();
        //        try {
            //            if (!subGrupoDAO.getSubGrupo(nome).isEmpty()) {
                //                for(int i=0;i<subGrupoDAO.numeroLinhas;i++){
                    //                     model.addRow(new String[]{subGrupoDAO.getSubGrupo(nome).get(i).getCodigo()+"",subGrupoDAO.getSubGrupo(nome).get(i).getGrupo()+"",subGrupoDAO.getSubGrupo(nome).get(i).getDescricao()+""});
                    //                }
                //                this.jButtonEditar.setEnabled(true);
                //            } else {
                //                JOptionPane.showMessageDialog(null, "O SubgrupoNew '" + nome+ "' não está cadastrado!", "Código não cadastrado", JOptionPane.INFORMATION_MESSAGE);
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

    private void jButtonNovo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo2ActionPerformed

    private void jTextCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigo2ActionPerformed

    private void jTextCodigo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigo4ActionPerformed

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
            java.util.logging.Logger.getLogger(TalonarioChequeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TalonarioChequeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TalonarioChequeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TalonarioChequeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TalonarioChequeNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCodigo1;
    private javax.swing.JLabel LabelCodigo2;
    private javax.swing.JLabel LabelCodigo3;
    private javax.swing.JLabel LabelCodigo4;
    private javax.swing.JPanel PanelSubgrupo;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonGravar1;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonNovo1;
    private javax.swing.JButton jButtonNovo2;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox jComboGrupo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableSubGrupo;
    private javax.swing.JTextField jTextCodigo1;
    private javax.swing.JTextField jTextCodigo2;
    private javax.swing.JTextField jTextCodigo3;
    private javax.swing.JTextField jTextCodigo4;
    private javax.swing.JTextField jTextPesquisar;
    // End of variables declaration//GEN-END:variables
}
