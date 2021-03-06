/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altessmann.RetaguardaAdministrativo_Produto;

//import Bean.UnidadeBean;
//import DAO.UnidadeDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EngComp
 */
public class UnidadeNew extends javax.swing.JFrame {

    /**
     * Creates new form UnidadeNew
     */
    private String cod1;
    private boolean novo = true;

    public UnidadeNew() {
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

        PanelTabela = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableUnidade = new javax.swing.JTable();
        PanelDados = new javax.swing.JPanel();
        TextCodigo = new javax.swing.JTextField();
        LabelCodigo = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        LabelUnidade = new javax.swing.JLabel();
        TextUnidade = new javax.swing.JTextField();
        LabelItensUni = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaDescricao = new javax.swing.JTextArea();
        TextItensUni = new javax.swing.JTextField();
        LabelDescricao1 = new javax.swing.JLabel();
        ButtonNovo = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        ButtonSalvar = new javax.swing.JButton();
        ButtonPesquisar = new javax.swing.JButton();
        TextPesquisar = new javax.swing.JTextField();
        ButtonCancelar = new javax.swing.JButton();
        ComboTributaria14 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("3D - Soluções Tecnológicas - Unidade");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PanelTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TableUnidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TableUnidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null}
            },
            new String [] {
                "Código", "Unidade", "Quantidade", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableUnidade.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        TableUnidade.setMinimumSize(new java.awt.Dimension(770, 800));
        TableUnidade.setRowHeight(20);
        TableUnidade.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TableUnidade);
        if (TableUnidade.getColumnModel().getColumnCount() > 0) {
            TableUnidade.getColumnModel().getColumn(0).setMinWidth(80);
            TableUnidade.getColumnModel().getColumn(0).setPreferredWidth(80);
            TableUnidade.getColumnModel().getColumn(0).setMaxWidth(80);
            TableUnidade.getColumnModel().getColumn(1).setMinWidth(90);
            TableUnidade.getColumnModel().getColumn(1).setPreferredWidth(90);
            TableUnidade.getColumnModel().getColumn(1).setMaxWidth(90);
            TableUnidade.getColumnModel().getColumn(2).setMinWidth(100);
            TableUnidade.getColumnModel().getColumn(2).setPreferredWidth(100);
            TableUnidade.getColumnModel().getColumn(2).setMaxWidth(100);
            TableUnidade.getColumnModel().getColumn(3).setMinWidth(180);
            TableUnidade.getColumnModel().getColumn(3).setPreferredWidth(180);
            TableUnidade.getColumnModel().getColumn(3).setMaxWidth(180);
        }

        javax.swing.GroupLayout PanelTabelaLayout = new javax.swing.GroupLayout(PanelTabela);
        PanelTabela.setLayout(PanelTabelaLayout);
        PanelTabelaLayout.setHorizontalGroup(
            PanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        PanelTabelaLayout.setVerticalGroup(
            PanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TextCodigo.setEditable(false);
        TextCodigo.setBackground(new java.awt.Color(255, 255, 255));
        TextCodigo.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        TextCodigo.setForeground(new java.awt.Color(153, 153, 153));
        TextCodigo.setText(" ");
        TextCodigo.setEnabled(false);
        TextCodigo.setMaximumSize(new java.awt.Dimension(1000, 10000));
        TextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCodigoActionPerformed(evt);
            }
        });

        LabelCodigo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelCodigo.setText("Código:");

        LabelUnidade.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelUnidade.setText("Unidade:");

        TextUnidade.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        TextUnidade.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        TextUnidade.setEnabled(false);
        TextUnidade.setMaximumSize(new java.awt.Dimension(1000, 10000));
        TextUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUnidadeActionPerformed(evt);
            }
        });

        LabelItensUni.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelItensUni.setText("Quantidade por Unidade:");

        TextAreaDescricao.setColumns(20);
        TextAreaDescricao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TextAreaDescricao.setEnabled(false);
        jScrollPane1.setViewportView(TextAreaDescricao);

        TextItensUni.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        TextItensUni.setForeground(new java.awt.Color(51, 51, 51));
        TextItensUni.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        TextItensUni.setEnabled(false);
        TextItensUni.setMaximumSize(new java.awt.Dimension(1000, 10000));
        TextItensUni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextItensUniActionPerformed(evt);
            }
        });

        LabelDescricao1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelDescricao1.setText("Descrição:");

        javax.swing.GroupLayout PanelDadosLayout = new javax.swing.GroupLayout(PanelDados);
        PanelDados.setLayout(PanelDadosLayout);
        PanelDadosLayout.setHorizontalGroup(
            PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDadosLayout.createSequentialGroup()
                        .addComponent(LabelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDadosLayout.createSequentialGroup()
                                .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelUnidade))
                            .addComponent(LabelItensUni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextItensUni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextUnidade, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                    .addComponent(Separator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDadosLayout.createSequentialGroup()
                        .addComponent(LabelDescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelDadosLayout.setVerticalGroup(
            PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDadosLayout.createSequentialGroup()
                        .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelCodigo)
                            .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelUnidade)
                            .addComponent(TextUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextItensUni, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelItensUni)))
                .addGap(5, 5, 5)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(LabelDescricao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        ButtonNovo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        ButtonNovo.setText("Nova");
        ButtonNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNovoActionPerformed(evt);
            }
        });

        ButtonEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar24x24.png"))); // NOI18N
        ButtonEditar.setText("Editar ");
        ButtonEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButtonExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close24x24.png"))); // NOI18N
        ButtonExcluir.setText("Excluir ");
        ButtonExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        ButtonSalvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save24x24.png"))); // NOI18N
        ButtonSalvar.setText("Salvar ");
        ButtonSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        ButtonPesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PesquisarCli.png"))); // NOI18N
        ButtonPesquisar.setText("Pesquisar Unidade ");
        ButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisarActionPerformed(evt);
            }
        });

        TextPesquisar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextPesquisar.setForeground(new java.awt.Color(153, 153, 153));
        TextPesquisar.setMaximumSize(new java.awt.Dimension(1000, 10000));
        TextPesquisar.setPreferredSize(new java.awt.Dimension(500, 25));
        TextPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPesquisarActionPerformed(evt);
            }
        });

        ButtonCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel24x24.png"))); // NOI18N
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        ComboTributaria14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ComboTributaria14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Unidade", "Descrição" }));
        ComboTributaria14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTributaria14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(ComboTributaria14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(ButtonPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(PanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ButtonEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(ButtonEditar)
                        .addGap(3, 3, 3)
                        .addComponent(ButtonExcluir)
                        .addGap(3, 3, 3)
                        .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboTributaria14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(PanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNovoActionPerformed
        novo = true;
        ButtonNovo.setEnabled(false);
        ButtonEditar.setEnabled(false);
        ButtonExcluir.setEnabled(false);
        ButtonSalvar.setEnabled(true);
        ButtonCancelar.setEnabled(true);
        TextUnidade.setEditable(true);
        TextAreaDescricao.setEditable(true);
        TextItensUni.setEditable(true);
        TextUnidade.setEnabled(true);
        TextAreaDescricao.setEnabled(true);
        TextItensUni.setEnabled(true);
    }//GEN-LAST:event_ButtonNovoActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        novo = false;
        ButtonNovo.setEnabled(false);
        ButtonEditar.setEnabled(false);
        ButtonExcluir.setEnabled(false);
        ButtonSalvar.setEnabled(true);
        ButtonCancelar.setEnabled(true);
        TextUnidade.setEditable(true);
        TextAreaDescricao.setEditable(true);
        TextItensUni.setEditable(true);
        TextUnidade.setEnabled(true);
        TextAreaDescricao.setEnabled(true);
        TextItensUni.setEnabled(true);
    }//GEN-LAST:event_ButtonEditarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
//        try {
//            UnidadeBean unidade = new UnidadeBean();
//            UnidadeDAO enviar = new UnidadeDAO();
//            unidade.setIdunidade(Integer.parseInt(TextCodigo.getText()));
//            enviar.delete(unidade);
//            TextItensUni.setText("");
//            TextAreaDescricao.setText("");
//            TextUnidade.setText("");
//            ButtonNovo.setEnabled(true);
//            ButtonEditar.setEnabled(false);
//            ButtonExcluir.setEnabled(false);
//            ButtonSalvar.setEnabled(false);
//            ButtonCancelar.setEnabled(false);
//            TextUnidade.setEditable(false);
//            TextAreaDescricao.setEditable(false);
//            TextItensUni.setEditable(false);
//            TextUnidade.setEnabled(false);
//            TextAreaDescricao.setEnabled(false);
//            TextItensUni.setEnabled(false);
//        } catch (SQLException ex) {
//            Logger.getLogger(UnidadeNew.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
//        try {
//            ButtonNovo.setEnabled(true);
//            ButtonEditar.setEnabled(false);
//            ButtonExcluir.setEnabled(false);
//            ButtonSalvar.setEnabled(false);
//            ButtonCancelar.setEnabled(false);
//            TextUnidade.setEditable(false);
//            TextAreaDescricao.setEditable(false);
//            TextItensUni.setEditable(false);
//            TextUnidade.setEnabled(false);
//            TextAreaDescricao.setEnabled(false);
//            TextItensUni.setEnabled(false);
//            UnidadeBean unidadee = new UnidadeBean();
//            UnidadeDAO enviar = new UnidadeDAO();
//            unidadee.setIdunidade(Integer.parseInt(TextCodigo.getText()));
//            unidadee.setUnidade(TextUnidade.getText().toUpperCase());
//            unidadee.setQuantidade(Integer.parseInt(TextItensUni.getText()));
//            unidadee.setDescricao(TextAreaDescricao.getText().toUpperCase());
//            if (novo) {
//                enviar.create(unidadee);
//                novo = true;
//            } else {
//                enviar.update(unidadee);
//                novo = true;
//            }
//            TextItensUni.setText("");
//            TextAreaDescricao.setText("");
//            TextUnidade.setText("");
//        } catch (SQLException ex) {
//            Logger.getLogger(UnidadeNew.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (NumberFormatException ex) {
//
//        }

    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void TextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCodigoActionPerformed

    private void ButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPesquisarActionPerformed

    private void TextPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPesquisarActionPerformed

    private void TextUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUnidadeActionPerformed

    private void TextItensUniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextItensUniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextItensUniActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        TextItensUni.setText("");
        TextAreaDescricao.setText("");
        TextUnidade.setText("");
        ButtonNovo.setEnabled(true);
        ButtonEditar.setEnabled(false);
        ButtonExcluir.setEnabled(false);
        ButtonSalvar.setEnabled(false);
        ButtonCancelar.setEnabled(false);
        TextUnidade.setEditable(false);
        TextAreaDescricao.setEditable(false);
        TextItensUni.setEditable(false);
        TextUnidade.setEnabled(false);
        TextAreaDescricao.setEnabled(false);
        TextItensUni.setEnabled(false);
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ComboTributaria14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTributaria14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTributaria14ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TextItensUni.setText("");
        TextAreaDescricao.setText("");
        TextUnidade.setText("");
        TextUnidade.setEditable(false);
        TextAreaDescricao.setEditable(false);
        TextItensUni.setEditable(false);
        TextUnidade.setEnabled(false);
        TextAreaDescricao.setEnabled(false);
        TextItensUni.setEnabled(false);
        ButtonNovo.setEnabled(true);
        ButtonEditar.setEnabled(false);
        ButtonExcluir.setEnabled(false);
        ButtonSalvar.setEnabled(false);
        ButtonCancelar.setEnabled(false);

//        new Thread() {
//            @Override
//            public void run() {
//                atualizarTabela();
//            }
//        }.
//                start();
    }//GEN-LAST:event_formWindowOpened

//    public void atualizarTabela() {
//        new Thread() {
//            @Override
//            public void run() {
//                try {
//                    int cod = 0;
//                    clearTable();
//                    DefaultTableModel model = (DefaultTableModel) TableUnidade.getModel();
//                    UnidadeDAO unidade = new UnidadeDAO();
//                    ResultSet rs = unidade.retriveTotal();
//                    while (rs.next()) {
//                        cod = rs.getInt("idunidade");
//                        String unidades = rs.getString("unidade");
//                        String quanti = rs.getString("quantidade");
//                        String desc = rs.getString("descricao");
//                        model.addRow(new Object[]{cod, unidades, quanti, desc});
//                    }
//                    cod1 = cod + 1 + "";
//                    TextCodigo.setText(cod1);
//                } catch (SQLException e) {
//                    System.out.println("Erro de sql3");
//                } catch (NullPointerException ex) {
//                    // JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados! \nEntre em contado com o administrador do sistema! \nInove Systems - www.inovesystems.com.br", "Inove Systems - Informação", JOptionPane.ERROR_MESSAGE);
//                }
//
//            }
//        }.start();
 //   }

    public void clearTable() {

        try {
            DefaultTableModel model = (DefaultTableModel) TableUnidade.getModel();
            model.getDataVector().removeAllElements();
            TableUnidade.revalidate();
            TableUnidade.repaint();

        } catch (NullPointerException ex) {

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
//        <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UnidadeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnidadeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnidadeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnidadeNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        </editor-fold>
//        </editor-fold>
//        </editor-fold>
//        </editor-fold>
//        </editor-fold>
//        </editor-fold>
//        </editor-fold>
//        </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnidadeNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonNovo;
    private javax.swing.JButton ButtonPesquisar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JComboBox ComboTributaria14;
    private javax.swing.JLabel LabelCodigo;
    private javax.swing.JLabel LabelDescricao1;
    private javax.swing.JLabel LabelItensUni;
    private javax.swing.JLabel LabelUnidade;
    private javax.swing.JPanel PanelDados;
    private javax.swing.JPanel PanelTabela;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JTable TableUnidade;
    private javax.swing.JTextArea TextAreaDescricao;
    private javax.swing.JTextField TextCodigo;
    private javax.swing.JTextField TextItensUni;
    private javax.swing.JTextField TextPesquisar;
    private javax.swing.JTextField TextUnidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
