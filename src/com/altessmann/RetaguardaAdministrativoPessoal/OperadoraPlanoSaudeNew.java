/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altessmann.RetaguardaAdministrativoPessoal;

/**
 *
 * @author Ritiele Aldeburg
 */
public class OperadoraPlanoSaudeNew extends javax.swing.JFrame {

    /**
     * Creates new form OperadoraPlanoSaudeNew
     */
    public OperadoraPlanoSaudeNew() {
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

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCliente2 = new javax.swing.JTable();
        jTextPesquisar2 = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonGravar1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        LabelValorCus115 = new javax.swing.JLabel();
        TextValorCusto133 = new javax.swing.JTextField();
        TextValorCusto134 = new javax.swing.JTextField();
        jButtonNovo6 = new javax.swing.JButton();
        TextValorCusto137 = new javax.swing.JTextField();
        LabelValorCus117 = new javax.swing.JLabel();
        TextValorCusto135 = new javax.swing.JTextField();
        LabelValorCus119 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTabbedPane3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTableCliente2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableCliente2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro Ans", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliente2.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        jTableCliente2.setMinimumSize(new java.awt.Dimension(770, 800));
        jTableCliente2.setRowHeight(20);
        jTableCliente2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTableCliente2);

        jTextPesquisar2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextPesquisar2.setForeground(new java.awt.Color(153, 153, 153));
        jTextPesquisar2.setText("Selecione uma das opções de pesquisa ...");
        jTextPesquisar2.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextPesquisar2.setPreferredSize(new java.awt.Dimension(500, 25));
        jTextPesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPesquisar2ActionPerformed(evt);
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

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jButton2.setText("Adicionar ");
        jButton2.setToolTipText("");
        jButton2.setMaximumSize(new java.awt.Dimension(300, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/abrircli.png"))); // NOI18N
        jButton3.setText("Listar ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextPesquisar2, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonPesquisar)
                        .addGap(3, 3, 3)
                        .addComponent(jButton3)
                        .addGap(3, 3, 3)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextPesquisar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jTabbedPane3.addTab("  Pesquisar Operadora  ", jPanel4);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "  Operadora Plano de Saude  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jButtonNovo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo.setText("Novo Plano");
        jButtonNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar24x24.png"))); // NOI18N
        jButtonEditar.setText("Editar Cadastro");
        jButtonEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close24x24.png"))); // NOI18N
        jButtonExcluir.setText("Excluir Cadastro");
        jButtonExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonGravar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save24x24.png"))); // NOI18N
        jButtonGravar.setText("Salvar Cadastro");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButtonNovo)
                .addGap(3, 3, 3)
                .addComponent(jButtonEditar)
                .addGap(3, 3, 3)
                .addComponent(jButtonExcluir)
                .addGap(3, 3, 3)
                .addComponent(jButtonGravar)
                .addGap(3, 3, 3)
                .addComponent(jButtonGravar1)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGravar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "  Detalhes  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        LabelValorCus115.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelValorCus115.setText("Conta Contabil:");

        TextValorCusto133.setEditable(false);
        TextValorCusto133.setBackground(new java.awt.Color(255, 255, 255));
        TextValorCusto133.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        TextValorCusto133.setForeground(new java.awt.Color(153, 153, 153));
        TextValorCusto133.setMaximumSize(new java.awt.Dimension(1000, 10000));
        TextValorCusto133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorCusto133ActionPerformed(evt);
            }
        });

        TextValorCusto134.setEditable(false);
        TextValorCusto134.setBackground(new java.awt.Color(255, 255, 255));
        TextValorCusto134.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        TextValorCusto134.setForeground(new java.awt.Color(153, 153, 153));
        TextValorCusto134.setMaximumSize(new java.awt.Dimension(1000, 10000));
        TextValorCusto134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorCusto134ActionPerformed(evt);
            }
        });

        jButtonNovo6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo6ActionPerformed(evt);
            }
        });

        TextValorCusto137.setEditable(false);
        TextValorCusto137.setBackground(new java.awt.Color(255, 255, 255));
        TextValorCusto137.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        TextValorCusto137.setForeground(new java.awt.Color(153, 153, 153));
        TextValorCusto137.setMaximumSize(new java.awt.Dimension(1000, 10000));
        TextValorCusto137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorCusto137ActionPerformed(evt);
            }
        });

        LabelValorCus117.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelValorCus117.setText("Registro Ans:");

        TextValorCusto135.setEditable(false);
        TextValorCusto135.setBackground(new java.awt.Color(255, 255, 255));
        TextValorCusto135.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        TextValorCusto135.setForeground(new java.awt.Color(153, 153, 153));
        TextValorCusto135.setMaximumSize(new java.awt.Dimension(1000, 10000));
        TextValorCusto135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorCusto135ActionPerformed(evt);
            }
        });

        LabelValorCus119.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelValorCus119.setText("Nome:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelValorCus115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextValorCusto133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addComponent(jButtonNovo6))
                    .addComponent(LabelValorCus117)
                    .addComponent(TextValorCusto137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextValorCusto134, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextValorCusto135, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(LabelValorCus119)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(LabelValorCus115)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonNovo6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(TextValorCusto133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(TextValorCusto134, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelValorCus117, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelValorCus119, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TextValorCusto135, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TextValorCusto137, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("  Operadora Detalhes  ", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPesquisar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPesquisar2ActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        //        DefaultTableModel model = (DefaultTableModel) jTableCliente.getModel();
        //        if (model.getRowCount() > 0) {
            //            while (model.getRowCount() > 0) {
                //                model.removeRow(0); // limpa a tabela
                //            }
            //        }
        //        try {           // adiciona as tabelas de acordo com a String selecionada no jComboBox
            //
            //            String terminal = jComboSelecionaTipoPesquisa.getSelectedItem() + ""; // transforma o jComboBox em uma String
            //            try {
                //                if (terminal.equals("Código")) {    // compara para ver se a String e o codigo
                    //                    if (!clienteDAO.getCliente(Integer.parseInt(jTextPesquisar.getText() + "")).isEmpty()) { //testa para ver se existem clientes com o cpodigo informado
                        //                        for (int i = 0; i < clienteDAO.numeroLinhas; i++) {
                            //                            model.addRow(new String[]{jTextPesquisar.getText() + "", clienteDAO.getCliente(Integer.parseInt(jTextPesquisar.getText() + "")).get(i).getNome(), clienteDAO.getCliente(Integer.parseInt(jTextPesquisar.getText() + "")).get(i).getLogradouro(), clienteDAO.getCliente(Integer.parseInt(jTextPesquisar.getText() + "")).get(i).getT1(), clienteDAO.getCliente(Integer.parseInt(jTextPesquisar.getText() + "")).get(i).getStatus()});
                            //                        }
                        //                    } else {
                        //                        JOptionPane.showMessageDialog(null, "Não existem clientes com o código " + jTextPesquisar.getText() + " cadastrados!", "Erro", JOptionPane.WARNING_MESSAGE);
                        //                    }
                    //                }
                //            } catch (Exception e) {
                //                JOptionPane.showMessageDialog(null, "Não foi possível executar a pesquisa, por favor, rivise os dados e tente novamente!", "Erro", JOptionPane.WARNING_MESSAGE);
                //
                //            }
            //            if (terminal.equals("Nome")) {
                //                if (!clienteDAO.getCliente(jTextPesquisar.getText() + "", null, null).isEmpty()) {
                    //                    for (int i = 0; i < clienteDAO.numeroLinhas; i++) {
                        //                        model.addRow(new String[]{clienteDAO.getCliente(jTextPesquisar.getText() + "", null, null).get(i).getCodigo() + "", clienteDAO.getCliente(jTextPesquisar.getText() + "", null, null).get(i).getNome(), clienteDAO.getCliente(jTextPesquisar.getText() + "", null, null).get(i).getLogradouro(), clienteDAO.getCliente(jTextPesquisar.getText() + "", null, null).get(i).getT1(), clienteDAO.getCliente(jTextPesquisar.getText() + "", null, null).get(i).getStatus()});
                        //                    }
                    //                } else {
                    //                    JOptionPane.showMessageDialog(null, "Não existem clientes com o nome '" + jTextPesquisar.getText() + "' cadastrados!", "Erro", JOptionPane.WARNING_MESSAGE);
                    //                }
                //                //clienteDAO.getCliente(jTextPesquisar.getText() + "", null, null).get(0).getCodigo();
                //            }
            //            if (terminal.equals("RG")) {
                //                if (!clienteDAO.getCliente(null, null, jTextPesquisar.getText() + "").isEmpty()) {
                    //                    System.out.println(clienteDAO.getCliente(null, null, jTextPesquisar.getText() + "").get(0).getNome());
                    //
                    //                    model.addRow(new String[]{clienteDAO.getCliente(null, null, jTextPesquisar.getText() + "").get(0).getCodigo() + "", clienteDAO.getCliente(null, null, jTextPesquisar.getText() + "").get(0).getNome(), clienteDAO.getCliente(null, null, jTextPesquisar.getText() + "").get(0).getLogradouro(), clienteDAO.getCliente(null, null, jTextPesquisar.getText() + "").get(0).getT1(), clienteDAO.getCliente(null, null, jTextPesquisar.getText() + "").get(0).getStatus()});
                    //
                    //                } else {
                    //                    JOptionPane.showMessageDialog(null, "Não existem clientes com o RG '" + jTextPesquisar.getText() + "' cadastrados!", "Erro", JOptionPane.WARNING_MESSAGE);
                    //
                    //                }
                //                //clienteDAO.getCliente(null, null, jTextPesquisar.getText() + "");
                //            }
            //
            //            if (terminal.equals("CPF")) {
                //
                //                if (!clienteDAO.getCliente(null, jTextPesquisar.getText() + "", null).isEmpty()) {
                    //                    for (int i = 0; i < clienteDAO.numeroLinhas; i++) {
                        //                        model.addRow(new String[]{clienteDAO.getCliente(null,jTextPesquisar.getText() + "",null).get(i).getCodigo() + "", clienteDAO.getCliente(null,jTextPesquisar.getText() + "",null).get(i).getNome(), clienteDAO.getCliente(null,jTextPesquisar.getText() + "",null).get(i).getLogradouro(), clienteDAO.getCliente(null,jTextPesquisar.getText() + "",null).get(i).getT1(), clienteDAO.getCliente(null,jTextPesquisar.getText() + "",null).get(i).getStatus()});
                        //                    }
                    //                } else {
                    //                    JOptionPane.showMessageDialog(null, "Não existem clientes com o CPF '" + jTextPesquisar.getText() + "' cadastrados!", "Erro", JOptionPane.WARNING_MESSAGE);
                    //
                    //                }
                //                //clienteDAO.getCliente(null, jTextPesquisar.getText() + "", null);
                //            }
            //        } catch (SQLException ex) {
            //            Logger.getLogger(ClienteNew.class.getName()).log(Level.SEVERE, null, ex);
            //            JOptionPane.showMessageDialog(null, "Não foi possível executar a pesquisa, por favor, rivise os dados e tente novamente!", "Erro", JOptionPane.WARNING_MESSAGE);
            //        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //        DefaultTableModel model = (DefaultTableModel) jTableCliente.getModel();
        //        if (model.getRowCount() > 0) {
            //            while (model.getRowCount() > 0) {
                //                model.removeRow(0); // limpa a tabela
                //            }
            //        }
        //        try {
            //            if (!clienteDAO.getCliente("", null, null).isEmpty()) {
                //                for (int i = 0; i < clienteDAO.numeroLinhas; i++) {
                    //                    model.addRow(new String[]{clienteDAO.getCliente().get(i).getCodigo() + "", clienteDAO.getCliente().get(i).getNome(), clienteDAO.getCliente().get(i).getLogradouro(), clienteDAO.getCliente().get(i).getT1(), clienteDAO.getCliente().get(i).getStatus()});
                    //                }
                //            } else {
                //                JOptionPane.showMessageDialog(null, "Não existem clientes com o nome '" + jTextPesquisar.getText() + "' cadastrados!", "Erro", JOptionPane.WARNING_MESSAGE);
                //            }
            //        } catch (SQLException ex) {
            //            System.out.println(ex);
            //        }
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void jButtonGravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravar1ActionPerformed

    private void TextValorCusto133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorCusto133ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorCusto133ActionPerformed

    private void TextValorCusto134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorCusto134ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorCusto134ActionPerformed

    private void jButtonNovo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo6ActionPerformed

    private void TextValorCusto137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorCusto137ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorCusto137ActionPerformed

    private void TextValorCusto135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorCusto135ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorCusto135ActionPerformed

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
            java.util.logging.Logger.getLogger(OperadoraPlanoSaudeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperadoraPlanoSaudeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperadoraPlanoSaudeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperadoraPlanoSaudeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperadoraPlanoSaudeNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelValorCus115;
    private javax.swing.JLabel LabelValorCus117;
    private javax.swing.JLabel LabelValorCus119;
    private javax.swing.JTextField TextValorCusto133;
    private javax.swing.JTextField TextValorCusto134;
    private javax.swing.JTextField TextValorCusto135;
    private javax.swing.JTextField TextValorCusto137;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonGravar1;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonNovo6;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTableCliente2;
    private javax.swing.JTextField jTextPesquisar2;
    // End of variables declaration//GEN-END:variables
}