/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altessmann.RetaguardaAdministrativoPessoal;

//import Bean.ClienteBean;
//import DAO.ClienteDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ritiele && Guilherme
 */
public class CadastroPessoaNew extends javax.swing.JFrame {

//    ClienteDAO clienteDAO = new ClienteDAO();
//    ClienteBean clienteBean = new ClienteBean();

    public CadastroPessoaNew() {

        initComponents();
       // this.desativaCampo();
    }

//    public void desativaCampo() {
//        jTexLimite.setEnabled(false);
//        jTextBairro.setEnabled(false);
//        jTextCEP.setEnabled(false);
//        jTextCPF.setEnabled(false);
//        jTextCidade.setEnabled(false);
//        jTextComplemento.setEnabled(false);
//        jTextDtCadastro.setEnabled(false);
//        jTextEmail.setEnabled(false);
//        jComboEstado.setEnabled(false);
//        jTextField12.setEnabled(false);
//        jTextField3.setEnabled(false);
//        jTextField33.setEnabled(false);
//        jTextField34.setEnabled(false);
//        jTextField35.setEnabled(false);
//        jTextField36.setEnabled(false);
//        jTextField38.setEnabled(false);
//        jTextField4.setEnabled(false);
//        jTextFiliacao.setEnabled(false);
//        jTextLogradouro.setEnabled(false);
//        jTextNome.setEnabled(false);
//        jTextObs.setEnabled(false);
//        jTextProfissao.setEnabled(false);
//        jTextRG.setEnabled(false);
//        jTextRenda.setEnabled(false);
//        jTextT1.setEnabled(false);
//        jTextT2.setEnabled(false);
//        jComboSexo.setEnabled(false);
//        jComboStatus.setEnabled(false);
//        jComboTipo.setEnabled(false);
//    }
//
//    public void ativaCampo() {
//        jTexLimite.setEnabled(true);
//        jTextBairro.setEnabled(true);
//        jTextCEP.setEnabled(true);
//        jTextCPF.setEnabled(true);
//        jTextCidade.setEnabled(true);
//        jTextCodigo.setEnabled(true);
//        jTextComplemento.setEnabled(true);
//        jTextDtCadastro.setEnabled(true);
//        jTextEmail.setEnabled(true);
//        jComboEstado.setEnabled(true);
//        jTextField12.setEnabled(true);
//        jTextField3.setEnabled(true);
//        jTextField33.setEnabled(true);
//        jTextField34.setEnabled(true);
//        jTextField35.setEnabled(true);
//        jTextField36.setEnabled(true);
//        jTextField38.setEnabled(true);
//        jTextField4.setEnabled(true);
//        jTextFiliacao.setEnabled(true);
//        jTextLogradouro.setEnabled(true);
//        jTextNome.setEnabled(true);
//        jTextObs.setEnabled(true);
//        jTextProfissao.setEnabled(true);
//        jTextRG.setEnabled(true);
//        jTextRenda.setEnabled(true);
//        jTextT1.setEnabled(true);
//        jTextT2.setEnabled(true);
//        jComboSexo.setEnabled(true);
//        jComboStatus.setEnabled(true);
//        jComboTipo.setEnabled(true);
//    }
//
//    public void limpaCampo() {
//        jTexLimite.setText(null);
//        jTextBairro.setText(null);
//        jTextCEP.setText(null);
//        jTextCPF.setText(null);
//        jTextCidade.setText(null);
//        jTextCodigo.setText(null);
//        jTextComplemento.setText(null);
//        jTextDtCadastro.setText(null);
//        jTextEmail.setText(null);
//        jComboEstado.setSelectedItem("RS");
//        jTextField12.setText(null);
//        jTextField3.setText(null);
//        jTextField33.setText(null);
//        jTextField34.setText(null);
//        jTextField35.setText(null);
//        jTextField36.setText(null);
//        jTextField38.setText(null);
//        jTextField4.setText(null);
//        jTextFiliacao.setText(null);
//        jTextLogradouro.setText(null);
//        jTextNome.setText(null);
//        jTextObs.setText(null);
//        jTextProfissao.setText(null);
//        jTextRG.setText(null);
//        jTextRenda.setText(null);
//        jTextT1.setText(null);
//        jTextT2.setText(null);
//        jComboSexo.setSelectedItem("Masculino");
//        jComboStatus.setSelectedItem("Bloqueado");
//        jComboTipo.setSelectedItem("Física");
//    }
//
//    public void setNovoCodigo() {
//        int c = 0;
//        try {
//            c = clienteDAO.getUltimoCodigo();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao buscar o dado no banco de dados! #0x0001", "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//        c++;
//        jTextCodigo.setText(Integer.toString(c));
//        clienteBean.setTentativas(0); // Atualizo ou insiro um dado novo? Esse loko decide!
//        clienteBean.setnFotos(0);// a ultima foto tirada é a nº 0
//
//        //s.setnFotoNOVO(nfotos);
//    }
//
//    public void getCliente(int cod) {
//        try {
//            if (!clienteDAO.getCliente(cod).isEmpty()) {
//                jTexLimite.setText(clienteDAO.getCliente(cod).get(0).getLimite() + "");
//                jTextBairro.setText(clienteDAO.getCliente(cod).get(0).getBairro());
//                jTextCEP.setText(clienteDAO.getCliente(cod).get(0).getCep());
//                jTextCPF.setText(clienteDAO.getCliente(cod).get(0).getCPF());
//                jTextCidade.setText(clienteDAO.getCliente(cod).get(0).getCidade());
//                jTextCodigo.setText(cod + "");
//                jTextComplemento.setText(clienteDAO.getCliente(cod).get(0).getComplemento());
//                jTextDtCadastro.setText(clienteDAO.getCliente(cod).get(0).getDtCadastro() + "");
//                jDateDtNascimento.setDate(clienteDAO.getCliente(cod).get(0).getDtNascimento());
//                jTextEmail.setText(clienteDAO.getCliente(cod).get(0).getEmail());
//                jComboEstado.setSelectedItem(clienteDAO.getCliente(cod).get(0).getEstado());
//                jTextField12.setText(clienteDAO.getCliente(cod).get(0).getNome());
//                jTextField3.setText(clienteDAO.getCliente(cod).get(0).getNome());
//                jTextField33.setText(clienteDAO.getCliente(cod).get(0).getNome());
//                jTextField34.setText(clienteDAO.getCliente(cod).get(0).getNome());
//                jTextField35.setText(clienteDAO.getCliente(cod).get(0).getNome());
//                jTextField36.setText(clienteDAO.getCliente(cod).get(0).getNome());
//                jTextField38.setText(clienteDAO.getCliente(cod).get(0).getNome());
//                jTextField4.setText(clienteDAO.getCliente(cod).get(0).getNome());
//                jTextFiliacao.setText(clienteDAO.getCliente(cod).get(0).getFiliacao());
//                jTextLogradouro.setText(clienteDAO.getCliente(cod).get(0).getLogradouro());
//                jTextNome.setText(clienteDAO.getCliente(cod).get(0).getNome());
//                jTextObs.setText(clienteDAO.getCliente(cod).get(0).getObs());
//                jTextProfissao.setText(clienteDAO.getCliente(cod).get(0).getProfissao());
//                jTextRG.setText(clienteDAO.getCliente(cod).get(0).getRG());
//                jTextRenda.setText(clienteDAO.getCliente(cod).get(0).getRenda() + "");
//                jTextT1.setText(clienteDAO.getCliente(cod).get(0).getT1());
//                jTextT2.setText(clienteDAO.getCliente(cod).get(0).getT2());
//                jComboSexo.setSelectedItem(clienteDAO.getCliente(cod).get(0).getSexo() + "");
//                jComboStatus.setSelectedItem(clienteDAO.getCliente(cod).get(0).getStatus() + "");
//                jComboTipo.setSelectedItem(clienteDAO.getCliente(cod).get(0).getTipo() + "");
//                jComboEstado.setSelectedItem(clienteDAO.getCliente(cod).get(0).getEstado() + "");
//                this.jButtonEditar.setEnabled(true);
//
//            } else {
//                JOptionPane.showMessageDialog(null, "O código " + cod + " não está cadastrado!", "Código não cadastrado", JOptionPane.INFORMATION_MESSAGE);
//                this.desativaCampo();
//                this.jTextCodigo.setText(null);
//                this.jButtonEditar.setEnabled(false);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//            JOptionPane.showMessageDialog(null, "Erro ao buscar o dado no banco de dados! #0x0002", "Erro", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//
//    public void setCliente() {
//        double reenda=0;
//        double limitee=0;
//        if(jTexLimite.getText()!=null){
//            limitee=Double.parseDouble(jTexLimite.getText() + "");
//        }
//        if(jTextRenda.getText()!=null){
//            reenda=Double.parseDouble(jTextRenda.getText() + "");
//        }
//        clienteDAO.setCliente(jTextNome.getText() + "", limitee, jTextBairro.getText() + "", jTextCEP.getText() + "", jTextCPF.getText() + "", jTextCidade.getText() + "", jTextComplemento.getText() + "", jTextEmail.getText() + "", jComboEstado.getSelectedItem() + "", jTextFiliacao.getText() + "", jTextLogradouro.getText() + "", jTextObs.getText() + "", jTextProfissao.getText() + "", jTextRG.getText() + "", reenda, jTextT1.getText() + "", jTextT2.getText() + "", jComboSexo.getSelectedItem() + "",
//                jComboStatus.getSelectedItem() + "", jComboTipo.getSelectedItem() + "", clienteBean.getTentativas(), jDateDtNascimento.getDate(), jComboEstadoCivil.getSelectedItem() + "");
//    }
//
//    public void atualizaCliente() {
//        double reenda=0;
//        double limitee=0;
//        if(jTexLimite.getText()!=null){
//            limitee=Double.parseDouble(jTexLimite.getText() + "");
//        }
//        if(jTextRenda.getText()!=null){
//            reenda=Double.parseDouble(jTextRenda.getText() + "");
//        }
//
//        clienteDAO.atualizaCliente(Integer.parseInt(jTextCodigo.getText()), jTextNome.getText() + "", limitee, jTextBairro.getText() + "", jTextCEP.getText() + "", jTextCPF.getText() + "", jTextCidade.getText() + "", jTextComplemento.getText() + "", jTextEmail.getText() + "", jComboEstado.getSelectedItem() + "", jTextFiliacao.getText() + "", jTextLogradouro.getText() + "", jTextObs.getText() + "", jTextProfissao.getText() + "", jTextRG.getText() + "", reenda, jTextT1.getText() + "", jTextT2.getText() + "", jComboSexo.getSelectedItem() + "",
//                jComboStatus.getSelectedItem() + "", jComboTipo.getSelectedItem() + "", clienteBean.getTentativas(), jDateDtNascimento.getDate(), jComboEstadoCivil.getSelectedItem() + "");
//
//    }
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboSexo9 = new javax.swing.JComboBox();
        jLabel99 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jTextPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboSelecionaTipoPesquisa = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextFiliacao = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jComboSexo = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jComboEstadoCivil = new javax.swing.JComboBox();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jDateDtNascimento = new com.toedter.calendar.JDateChooser();
        jButtonNovo3 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jTextFiliacao7 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextFiliacao8 = new javax.swing.JTextField();
        jButtonNovo4 = new javax.swing.JButton();
        jTextFiliacao9 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextFiliacao10 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jDateDtNascimento2 = new com.toedter.calendar.JDateChooser();
        jTextFiliacao11 = new javax.swing.JTextField();
        jButtonNovo5 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jTextFiliacao30 = new javax.swing.JTextField();
        jTextFiliacao31 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jDateDtNascimento1 = new com.toedter.calendar.JDateChooser();
        jLabel50 = new javax.swing.JLabel();
        jTextFiliacao32 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextFiliacao33 = new javax.swing.JTextField();
        jTextFiliacao34 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextFiliacao35 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jTextFiliacao36 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jTextFiliacao37 = new javax.swing.JTextField();
        jButtonNovo6 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jButtonNovo15 = new javax.swing.JButton();
        jButtonNovo16 = new javax.swing.JButton();
        jButtonGravar8 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jTextFiliacao14 = new javax.swing.JTextField();
        jButtonNovo8 = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable17 = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jButtonNovo17 = new javax.swing.JButton();
        jButtonNovo18 = new javax.swing.JButton();
        jButtonGravar9 = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jTextFiliacao12 = new javax.swing.JTextField();
        jButtonNovo12 = new javax.swing.JButton();
        jTextFiliacao17 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextFiliacao20 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jTextFiliacao26 = new javax.swing.JTextField();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableCliente2 = new javax.swing.JTable();
        jButtonGravar12 = new javax.swing.JButton();
        jButtonNovo24 = new javax.swing.JButton();
        jComboSexo2 = new javax.swing.JComboBox();
        jComboSexo3 = new javax.swing.JComboBox();
        jLabel84 = new javax.swing.JLabel();
        jTextFiliacao2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabelFoto2 = new javax.swing.JLabel();
        jTextFiliacao3 = new javax.swing.JTextField();
        jTextFiliacao4 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextFiliacao5 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextFiliacao6 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButtonCancelar2 = new javax.swing.JButton();
        jComboStatus3 = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jComboSexo15 = new javax.swing.JComboBox();
        jPanel8 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jComboStatus2 = new javax.swing.JComboBox();
        jLabel85 = new javax.swing.JLabel();
        jButtonNovo2 = new javax.swing.JButton();
        jButtonCancelar3 = new javax.swing.JButton();
        jButtonEditar2 = new javax.swing.JButton();
        jButtonExcluir2 = new javax.swing.JButton();
        jButtonGravar2 = new javax.swing.JButton();
        jDateDtNascimento3 = new com.toedter.calendar.JDateChooser();
        jLabel88 = new javax.swing.JLabel();
        jComboSexo5 = new javax.swing.JComboBox();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel27 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jTextFiliacao13 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jTextFiliacao15 = new javax.swing.JTextField();
        jButtonNovo7 = new javax.swing.JButton();
        jTextFiliacao16 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jTextFiliacao18 = new javax.swing.JTextField();
        jButtonNovo9 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel100 = new javax.swing.JLabel();
        jTextFiliacao25 = new javax.swing.JTextField();
        jTextFiliacao38 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jButtonNovo19 = new javax.swing.JButton();
        jButtonNovo20 = new javax.swing.JButton();
        jButtonGravar10 = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        jTextFiliacao19 = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable15 = new javax.swing.JTable();
        jButtonNovo10 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jButtonNovo21 = new javax.swing.JButton();
        jButtonNovo22 = new javax.swing.JButton();
        jButtonGravar11 = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable16 = new javax.swing.JTable();
        jPanel31 = new javax.swing.JPanel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel61 = new javax.swing.JLabel();
        jTextFiliacao24 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jTextFiliacao27 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jTextFiliacao28 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jTextFiliacao29 = new javax.swing.JTextField();
        jButtonNovo13 = new javax.swing.JButton();
        LabelValorCus118 = new javax.swing.JLabel();
        TextValorCusto138 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jComboSexo6 = new javax.swing.JComboBox();
        jLabel96 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabelFoto3 = new javax.swing.JLabel();
        jTextFiliacao21 = new javax.swing.JTextField();
        jTextFiliacao22 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jButtonCancelar4 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jComboSexo16 = new javax.swing.JComboBox();
        jLabel107 = new javax.swing.JLabel();

        jComboSexo9.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jComboSexo9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));

        jLabel99.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel99.setText("Fornecedor:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("3D - Soluções Tecnológicas - Cliente");
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTableCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo", "Email", "Site", "Cliente", "Fornecedor", "Colaborador", "Transportadora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableCliente.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        jTableCliente.setMinimumSize(new java.awt.Dimension(770, 800));
        jTableCliente.setRowHeight(20);
        jTableCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableCliente);
        if (jTableCliente.getColumnModel().getColumnCount() > 0) {
            jTableCliente.getColumnModel().getColumn(0).setMinWidth(300);
            jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTableCliente.getColumnModel().getColumn(0).setMaxWidth(300);
            jTableCliente.getColumnModel().getColumn(1).setMinWidth(150);
            jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTableCliente.getColumnModel().getColumn(1).setMaxWidth(150);
            jTableCliente.getColumnModel().getColumn(2).setMinWidth(200);
            jTableCliente.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTableCliente.getColumnModel().getColumn(2).setMaxWidth(200);
            jTableCliente.getColumnModel().getColumn(3).setMinWidth(200);
            jTableCliente.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTableCliente.getColumnModel().getColumn(3).setMaxWidth(200);
            jTableCliente.getColumnModel().getColumn(4).setMinWidth(100);
            jTableCliente.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTableCliente.getColumnModel().getColumn(4).setMaxWidth(100);
            jTableCliente.getColumnModel().getColumn(5).setMinWidth(100);
            jTableCliente.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTableCliente.getColumnModel().getColumn(5).setMaxWidth(100);
            jTableCliente.getColumnModel().getColumn(6).setMinWidth(100);
            jTableCliente.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTableCliente.getColumnModel().getColumn(6).setMaxWidth(100);
            jTableCliente.getColumnModel().getColumn(7).setMinWidth(100);
            jTableCliente.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTableCliente.getColumnModel().getColumn(7).setMaxWidth(100);
        }

        jTextPesquisar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextPesquisar.setForeground(new java.awt.Color(153, 153, 153));
        jTextPesquisar.setText("Selecione uma das opções de pesquisa ...");
        jTextPesquisar.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextPesquisar.setPreferredSize(new java.awt.Dimension(500, 25));
        jTextPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPesquisarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PesquisarCli.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar Pessoa");
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
        jButton3.setText("Listar Pessoas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboSelecionaTipoPesquisa.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboSelecionaTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "RG", "CPF" }));
        jComboSelecionaTipoPesquisa.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboSelecionaTipoPesquisa, 0, 278, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jButton3)
                        .addGap(3, 3, 3)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboSelecionaTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jTabbedPane1.addTab("  Pesquisar Pessoa  ", jPanel2);

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setText("Código:");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setText("Nome Completo :");

        jLabel32.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel32.setText("Nacionalidade:");

        jTextFiliacao.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacaoActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel33.setText("Sexo:");

        jComboSexo.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jComboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        jLabel34.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel34.setText("Data de Nascimento:");

        jLabel40.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel40.setText("Estado Civil:");

        jComboEstadoCivil.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jButtonNovo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addCliente.png"))); // NOI18N
        jButtonNovo.setText("Nova Pessoa");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelarCli.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar ");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editarCliente.png"))); // NOI18N
        jButtonEditar.setText("Editar Cadastro");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ExcluirCliente.png"))); // NOI18N
        jButtonExcluir.setText("Excluir Cadastro");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonGravar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvarCliente (2).png"))); // NOI18N
        jButtonGravar.setText("Salvar Dados");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jDateDtNascimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jDateDtNascimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Calendar.png")));

        jButtonNovo3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo3ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel83.setText("Raça:");

        jTabbedPane6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel38.setText("CPF:");

        jTextFiliacao7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao7.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao7.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao7ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel39.setText("Cópia  CPF:");

        jTextFiliacao8.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao8.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao8.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao8ActionPerformed(evt);
            }
        });

        jButtonNovo4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo4ActionPerformed(evt);
            }
        });

        jTextFiliacao9.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao9.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao9.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao9ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel41.setText("RG:");

        jTextFiliacao10.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao10.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao10.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao10ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel42.setText("Orgão Exp:");

        jLabel43.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel43.setText("Data de Emissão:");

        jDateDtNascimento2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jDateDtNascimento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Calendar.png")));

        jTextFiliacao11.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao11.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao11.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao11ActionPerformed(evt);
            }
        });

        jButtonNovo5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo5ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel44.setText("Cópia RG:");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateDtNascimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovo4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovo5))
                    .addComponent(jSeparator4))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFiliacao9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFiliacao10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateDtNascimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonNovo5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane6.addTab("  Documentos Principais  ", jPanel23);

        jLabel48.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel48.setText("CNH Numero:");

        jTextFiliacao30.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao30.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao30.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao30ActionPerformed(evt);
            }
        });

        jTextFiliacao31.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao31.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao31.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao31ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel49.setText("CNH Categoria:");

        jDateDtNascimento1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jDateDtNascimento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Calendar.png")));

        jLabel50.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel50.setText("CNH Vencimento:");

        jTextFiliacao32.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao32.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao32.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao32ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel51.setText("Titulo Numero:");

        jLabel52.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel52.setText("Titulo Zona:");

        jTextFiliacao33.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao33.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao33.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao33ActionPerformed(evt);
            }
        });

        jTextFiliacao34.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao34.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao34.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao34ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel53.setText("Titulo Seção:");

        jLabel54.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel54.setText("Reservista Numero:");

        jTextFiliacao35.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao35.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao35.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao35ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel55.setText("Reservista Categoria:");

        jTextFiliacao36.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao36.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao36.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao36ActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel57.setText("Cópia  CNH / Titulo Eleitoral / Certificado Reservista:");

        jTextFiliacao37.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao37.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao37.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao37ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFiliacao32, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                    .addComponent(jTextFiliacao30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFiliacao35, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel52)
                                        .addGap(36, 36, 36)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFiliacao33, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(jTextFiliacao31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel53))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFiliacao34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateDtNascimento1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFiliacao36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovo6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateDtNascimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao32, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFiliacao34, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFiliacao35, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFiliacao36, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao37, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane6.addTab("  Documentos Extras  ", jPanel1);

        jButtonNovo15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo15ActionPerformed(evt);
            }
        });

        jButtonNovo16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar24x24.png"))); // NOI18N
        jButtonNovo16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo16ActionPerformed(evt);
            }
        });

        jButtonGravar8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close24x24.png"))); // NOI18N
        jButtonGravar8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonGravar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravar8ActionPerformed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel59.setText("Comprovante End:");

        jTextFiliacao14.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao14.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao14.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao14ActionPerformed(evt);
            }
        });

        jButtonNovo8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo8ActionPerformed(evt);
            }
        });

        jTable17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTable17.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Logradouro", "Numero", "Complemento", "Bairro", "Cidade", "Cep", "Municipio Ibge", "UF", "Fone", "Principal", "Entrega", "Cobrança", "Correspondencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable17.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable17.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        jTable17.setMinimumSize(new java.awt.Dimension(770, 800));
        jTable17.setRowHeight(20);
        jTable17.setRowSelectionAllowed(false);
        jTable17.getTableHeader().setReorderingAllowed(false);
        jScrollPane19.setViewportView(jTable17);
        if (jTable17.getColumnModel().getColumnCount() > 0) {
            jTable17.getColumnModel().getColumn(0).setMinWidth(300);
            jTable17.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTable17.getColumnModel().getColumn(0).setMaxWidth(300);
            jTable17.getColumnModel().getColumn(1).setMinWidth(200);
            jTable17.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable17.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable17.getColumnModel().getColumn(2).setMinWidth(150);
            jTable17.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable17.getColumnModel().getColumn(2).setMaxWidth(150);
            jTable17.getColumnModel().getColumn(3).setMinWidth(150);
            jTable17.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable17.getColumnModel().getColumn(3).setMaxWidth(150);
            jTable17.getColumnModel().getColumn(4).setMinWidth(300);
            jTable17.getColumnModel().getColumn(4).setPreferredWidth(300);
            jTable17.getColumnModel().getColumn(4).setMaxWidth(300);
            jTable17.getColumnModel().getColumn(5).setMinWidth(100);
            jTable17.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable17.getColumnModel().getColumn(5).setMaxWidth(100);
            jTable17.getColumnModel().getColumn(6).setMinWidth(100);
            jTable17.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable17.getColumnModel().getColumn(6).setMaxWidth(100);
            jTable17.getColumnModel().getColumn(7).setMinWidth(100);
            jTable17.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTable17.getColumnModel().getColumn(7).setMaxWidth(100);
            jTable17.getColumnModel().getColumn(9).setMinWidth(100);
            jTable17.getColumnModel().getColumn(9).setPreferredWidth(100);
            jTable17.getColumnModel().getColumn(9).setMaxWidth(100);
            jTable17.getColumnModel().getColumn(10).setMinWidth(100);
            jTable17.getColumnModel().getColumn(10).setPreferredWidth(100);
            jTable17.getColumnModel().getColumn(10).setMaxWidth(100);
            jTable17.getColumnModel().getColumn(11).setMinWidth(100);
            jTable17.getColumnModel().getColumn(11).setPreferredWidth(100);
            jTable17.getColumnModel().getColumn(11).setMaxWidth(100);
            jTable17.getColumnModel().getColumn(12).setMinWidth(100);
            jTable17.getColumnModel().getColumn(12).setPreferredWidth(100);
            jTable17.getColumnModel().getColumn(12).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jButtonNovo15)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonNovo16)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonGravar8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao14, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovo8))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNovo15, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jButtonNovo16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGravar8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovo8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFiliacao14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jTabbedPane6.addTab("  Endereços  ", jPanel25);

        jButtonNovo17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo17ActionPerformed(evt);
            }
        });

        jButtonNovo18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar24x24.png"))); // NOI18N
        jButtonNovo18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo18ActionPerformed(evt);
            }
        });

        jButtonGravar9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close24x24.png"))); // NOI18N
        jButtonGravar9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonGravar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravar9ActionPerformed(evt);
            }
        });

        jTable14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Site", "Fone Comercial", "Fone Residencial", "Fone Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable14.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable14.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        jTable14.setMinimumSize(new java.awt.Dimension(770, 800));
        jTable14.setRowHeight(20);
        jTable14.getTableHeader().setReorderingAllowed(false);
        jScrollPane16.setViewportView(jTable14);
        if (jTable14.getColumnModel().getColumnCount() > 0) {
            jTable14.getColumnModel().getColumn(0).setMinWidth(300);
            jTable14.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTable14.getColumnModel().getColumn(0).setMaxWidth(300);
            jTable14.getColumnModel().getColumn(1).setMinWidth(200);
            jTable14.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable14.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable14.getColumnModel().getColumn(2).setMinWidth(200);
            jTable14.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable14.getColumnModel().getColumn(2).setMaxWidth(200);
            jTable14.getColumnModel().getColumn(3).setMinWidth(150);
            jTable14.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable14.getColumnModel().getColumn(3).setMaxWidth(150);
            jTable14.getColumnModel().getColumn(4).setMinWidth(150);
            jTable14.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable14.getColumnModel().getColumn(4).setMaxWidth(150);
            jTable14.getColumnModel().getColumn(5).setMinWidth(150);
            jTable14.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTable14.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jButtonNovo17)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonNovo18)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonGravar9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonNovo18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButtonNovo17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGravar9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jTabbedPane6.addTab("  Contatos  ", jPanel22);

        jLabel45.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel45.setText("Comprovante Renda:");

        jTextFiliacao12.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao12.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao12.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao12ActionPerformed(evt);
            }
        });

        jButtonNovo12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo12ActionPerformed(evt);
            }
        });

        jTextFiliacao17.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao17.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao17.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao17ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel46.setText("Renda:");

        jTextFiliacao20.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao20.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao20.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao20ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel56.setText("% da Renda:");

        jLabel62.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel62.setText("Limite Final:");

        jTextFiliacao26.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao26.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao26.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao26ActionPerformed(evt);
            }
        });

        jRadioButton6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jRadioButton6.setText("Limite Automatico");

        jRadioButton8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jRadioButton8.setText("Limite Manual");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovo12))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao17, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao20, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao26, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFiliacao17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFiliacao20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFiliacao26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("   Renda / Limite Compra ", jPanel17);

        jTableCliente2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTableCliente2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"RITIELE MOREIRA ALDEBURG", "BARÃO DO RIO BRANCO 424", "53 32481203", "ATIVO"}
            },
            new String [] {
                "Nome Completo", "Endereço", "Telefone", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCliente2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableCliente2.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        jTableCliente2.setMinimumSize(new java.awt.Dimension(770, 800));
        jTableCliente2.setRowHeight(20);
        jTableCliente2.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(jTableCliente2);
        if (jTableCliente2.getColumnModel().getColumnCount() > 0) {
            jTableCliente2.getColumnModel().getColumn(0).setMinWidth(400);
            jTableCliente2.getColumnModel().getColumn(0).setPreferredWidth(400);
            jTableCliente2.getColumnModel().getColumn(0).setMaxWidth(400);
            jTableCliente2.getColumnModel().getColumn(1).setMinWidth(380);
            jTableCliente2.getColumnModel().getColumn(1).setPreferredWidth(380);
            jTableCliente2.getColumnModel().getColumn(1).setMaxWidth(380);
            jTableCliente2.getColumnModel().getColumn(2).setMinWidth(100);
            jTableCliente2.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableCliente2.getColumnModel().getColumn(2).setMaxWidth(100);
            jTableCliente2.getColumnModel().getColumn(3).setMinWidth(100);
            jTableCliente2.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableCliente2.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jButtonGravar12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close24x24.png"))); // NOI18N
        jButtonGravar12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonGravar12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravar12ActionPerformed(evt);
            }
        });

        jButtonNovo24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNovo24)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonGravar12)))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNovo24, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButtonGravar12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jTabbedPane6.addTab("  Dependentes  ", jPanel32);

        jComboSexo2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jComboSexo3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel84.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel84.setText("Tipo Sanguinio:");

        jTextFiliacao2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao2.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao2.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao2ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel35.setText("Naturalidade:");

        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel24.setToolTipText("");

        jLabelFoto2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelFoto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fotoadd.png"))); // NOI18N
        jLabelFoto2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFoto2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFoto2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );

        jTextFiliacao3.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao3.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao3.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao3ActionPerformed(evt);
            }
        });

        jTextFiliacao4.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao4.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao4.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao4ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel36.setText("Nome Mãe:");

        jTextFiliacao5.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao5.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao5.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao5ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel37.setText("Nome Pai:");

        jTextFiliacao6.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao6.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao6.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao6ActionPerformed(evt);
            }
        });

        jButtonCancelar2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/visualizar.png"))); // NOI18N
        jButtonCancelar2.setText("Ver Documentos");
        jButtonCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar2ActionPerformed(evt);
            }
        });

        jComboStatus3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jComboStatus3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Bloqueado", "Inativo" }));
        jComboStatus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboStatus3ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel30.setText("Status:");

        jLabel106.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel106.setText("Tipo Cadastral:");

        jComboSexo15.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jComboSexo15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cliente", "Colaborador", "Cliente e Colaborador" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(3, 3, 3)
                                .addComponent(jDateDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jComboEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNovo3))
                            .addComponent(jSeparator3)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFiliacao3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextFiliacao4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(320, 320, 320)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel106)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jComboSexo15, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboStatus3, 0, 175, Short.MAX_VALUE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonExcluir)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonEditar)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonGravar)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jTextFiliacao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFiliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel83)
                                .addGap(3, 3, 3)
                                .addComponent(jComboSexo2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel84)
                                .addGap(3, 3, 3)
                                .addComponent(jComboSexo3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jTextFiliacao5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFiliacao6, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel30)
                            .addComponent(jLabel106))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFiliacao4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboSexo15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFiliacao3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateDtNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jComboEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonNovo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFiliacao2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jComboSexo2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboSexo3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFiliacao, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFiliacao6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jTextFiliacao5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditar)
                        .addComponent(jButtonGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar)
                        .addComponent(jButtonCancelar2)))
                .addContainerGap())
        );

        jTabbedPane2.addTab(" Pessoa Fisica ", jPanel7);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel17.setText("Código:");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel22.setText("Nome:");

        jLabel29.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel29.setText("Status:");

        jComboStatus2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jComboStatus2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Bloqueado", "Inativo" }));
        jComboStatus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboStatus2ActionPerformed(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel85.setText("Data Constituição:");

        jButtonNovo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addCliente.png"))); // NOI18N
        jButtonNovo2.setText("Novo Pessoa");
        jButtonNovo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo2ActionPerformed(evt);
            }
        });

        jButtonCancelar3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelarCli.png"))); // NOI18N
        jButtonCancelar3.setText("Cancelar ");
        jButtonCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar3ActionPerformed(evt);
            }
        });

        jButtonEditar2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonEditar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editarCliente.png"))); // NOI18N
        jButtonEditar2.setText("Editar Cadastro");
        jButtonEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditar2ActionPerformed(evt);
            }
        });

        jButtonExcluir2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonExcluir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ExcluirCliente.png"))); // NOI18N
        jButtonExcluir2.setText("Excluir Cadastro");
        jButtonExcluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluir2ActionPerformed(evt);
            }
        });

        jButtonGravar2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvarCliente (2).png"))); // NOI18N
        jButtonGravar2.setText("Salvar Dados");
        jButtonGravar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravar2ActionPerformed(evt);
            }
        });

        jDateDtNascimento3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jDateDtNascimento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Calendar.png")));

        jLabel88.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel88.setText("CRT:");

        jComboSexo5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jComboSexo5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 - Simples Nacional", "2- Simples Nacional - Excesso Sublimite", "3- Regime Normal" }));

        jTabbedPane7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel89.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel89.setText("CNPJ:");

        jTextFiliacao13.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao13.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao13.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao13ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel90.setText("Documento 1:");

        jTextFiliacao15.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao15.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao15.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao15ActionPerformed(evt);
            }
        });

        jButtonNovo7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo7ActionPerformed(evt);
            }
        });

        jTextFiliacao16.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao16.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao16.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao16ActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel91.setText("IE:");

        jTextFiliacao18.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao18.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao18.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao18ActionPerformed(evt);
            }
        });

        jButtonNovo9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo9ActionPerformed(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel94.setText("Documento 2:");

        jLabel100.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel100.setText("Suframa:");

        jTextFiliacao25.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao25.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao25.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao25ActionPerformed(evt);
            }
        });

        jTextFiliacao38.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao38.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao38.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao38ActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel92.setText("IM:");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao16, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao38, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao25, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jTextFiliacao15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNovo7))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jTextFiliacao18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNovo9)))))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao38, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonNovo9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane7.addTab("  Documentos  ", jPanel27);

        jButtonNovo19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo19ActionPerformed(evt);
            }
        });

        jButtonNovo20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar24x24.png"))); // NOI18N
        jButtonNovo20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo20ActionPerformed(evt);
            }
        });

        jButtonGravar10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close24x24.png"))); // NOI18N
        jButtonGravar10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonGravar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravar10ActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel95.setText("Comprovante End:");

        jTextFiliacao19.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao19.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao19.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao19ActionPerformed(evt);
            }
        });

        jTable15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTable15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Logradouro", "Numero", "Complemento", "Bairro", "Cidade", "Cep", "Municipio Ibge", "UF", "Fone", "Principal", "Entrega", "Cobrança", "Correspondencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable15.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable15.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        jTable15.setMinimumSize(new java.awt.Dimension(770, 800));
        jTable15.setRowHeight(20);
        jTable15.setRowSelectionAllowed(false);
        jTable15.getTableHeader().setReorderingAllowed(false);
        jScrollPane17.setViewportView(jTable15);
        if (jTable15.getColumnModel().getColumnCount() > 0) {
            jTable15.getColumnModel().getColumn(0).setMinWidth(300);
            jTable15.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTable15.getColumnModel().getColumn(0).setMaxWidth(300);
            jTable15.getColumnModel().getColumn(1).setMinWidth(200);
            jTable15.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable15.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable15.getColumnModel().getColumn(2).setMinWidth(150);
            jTable15.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable15.getColumnModel().getColumn(2).setMaxWidth(150);
            jTable15.getColumnModel().getColumn(3).setMinWidth(150);
            jTable15.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable15.getColumnModel().getColumn(3).setMaxWidth(150);
            jTable15.getColumnModel().getColumn(4).setMinWidth(300);
            jTable15.getColumnModel().getColumn(4).setPreferredWidth(300);
            jTable15.getColumnModel().getColumn(4).setMaxWidth(300);
            jTable15.getColumnModel().getColumn(5).setMinWidth(100);
            jTable15.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable15.getColumnModel().getColumn(5).setMaxWidth(100);
            jTable15.getColumnModel().getColumn(6).setMinWidth(100);
            jTable15.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable15.getColumnModel().getColumn(6).setMaxWidth(100);
            jTable15.getColumnModel().getColumn(7).setMinWidth(100);
            jTable15.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTable15.getColumnModel().getColumn(7).setMaxWidth(100);
            jTable15.getColumnModel().getColumn(8).setMinWidth(100);
            jTable15.getColumnModel().getColumn(8).setPreferredWidth(100);
            jTable15.getColumnModel().getColumn(8).setMaxWidth(100);
            jTable15.getColumnModel().getColumn(9).setMinWidth(100);
            jTable15.getColumnModel().getColumn(9).setPreferredWidth(100);
            jTable15.getColumnModel().getColumn(9).setMaxWidth(100);
            jTable15.getColumnModel().getColumn(10).setMinWidth(100);
            jTable15.getColumnModel().getColumn(10).setPreferredWidth(100);
            jTable15.getColumnModel().getColumn(10).setMaxWidth(100);
            jTable15.getColumnModel().getColumn(11).setMinWidth(100);
            jTable15.getColumnModel().getColumn(11).setPreferredWidth(100);
            jTable15.getColumnModel().getColumn(11).setMaxWidth(100);
            jTable15.getColumnModel().getColumn(12).setMinWidth(100);
            jTable15.getColumnModel().getColumn(12).setPreferredWidth(100);
            jTable15.getColumnModel().getColumn(12).setMaxWidth(100);
        }

        jButtonNovo10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jButtonNovo19)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonNovo20)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonGravar10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel95)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao19, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovo10)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonGravar10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(jButtonNovo20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(jButtonNovo19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(jButtonNovo10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(jTextFiliacao19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jTabbedPane7.addTab("  Endereços  ", jPanel28);

        jButtonNovo21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo21ActionPerformed(evt);
            }
        });

        jButtonNovo22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar24x24.png"))); // NOI18N
        jButtonNovo22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo22ActionPerformed(evt);
            }
        });

        jButtonGravar11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonGravar11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close24x24.png"))); // NOI18N
        jButtonGravar11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonGravar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravar11ActionPerformed(evt);
            }
        });

        jTable16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTable16.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Site", "Fone Comercial", "Fone Residencial", "Fone Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable16.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable16.setMaximumSize(new java.awt.Dimension(2147483647, 200));
        jTable16.setMinimumSize(new java.awt.Dimension(770, 800));
        jTable16.setRowHeight(20);
        jTable16.getTableHeader().setReorderingAllowed(false);
        jScrollPane18.setViewportView(jTable16);
        if (jTable16.getColumnModel().getColumnCount() > 0) {
            jTable16.getColumnModel().getColumn(0).setMinWidth(300);
            jTable16.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTable16.getColumnModel().getColumn(0).setMaxWidth(300);
            jTable16.getColumnModel().getColumn(1).setMinWidth(200);
            jTable16.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable16.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable16.getColumnModel().getColumn(2).setMinWidth(200);
            jTable16.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable16.getColumnModel().getColumn(2).setMaxWidth(200);
            jTable16.getColumnModel().getColumn(3).setMinWidth(150);
            jTable16.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable16.getColumnModel().getColumn(3).setMaxWidth(150);
            jTable16.getColumnModel().getColumn(4).setMinWidth(150);
            jTable16.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable16.getColumnModel().getColumn(4).setMaxWidth(150);
            jTable16.getColumnModel().getColumn(5).setMinWidth(150);
            jTable16.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTable16.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jButtonNovo21)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonNovo22)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonGravar11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonNovo22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jButtonNovo21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGravar11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jTabbedPane7.addTab("  Contatos  ", jPanel29);

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jRadioButton9.setText("Limite Automatico");

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jRadioButton10.setText("Limite Manual");

        jLabel61.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel61.setText("Comprovante Faturamento:");

        jTextFiliacao24.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao24.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao24.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao24ActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel63.setText("Faturamento:");

        jTextFiliacao27.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao27.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao27.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao27ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel64.setText("% da Renda:");

        jTextFiliacao28.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao28.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao28.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao28ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel65.setText("Limite Final:");

        jTextFiliacao29.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao29.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao29.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao29ActionPerformed(evt);
            }
        });

        jButtonNovo13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNovo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add2.png"))); // NOI18N
        jButtonNovo13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonNovo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovo13ActionPerformed(evt);
            }
        });

        LabelValorCus118.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelValorCus118.setText("Porcento Desconto:");

        TextValorCusto138.setEditable(false);
        TextValorCusto138.setBackground(new java.awt.Color(255, 255, 255));
        TextValorCusto138.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        TextValorCusto138.setForeground(new java.awt.Color(153, 153, 153));
        TextValorCusto138.setMaximumSize(new java.awt.Dimension(1000, 10000));
        TextValorCusto138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorCusto138ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFiliacao24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovo13))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFiliacao27, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFiliacao28, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFiliacao29, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                                .addComponent(jRadioButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelValorCus118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextValorCusto138, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                    .addComponent(jSeparator7))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10))
                .addGap(5, 5, 5)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextValorCusto138, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelValorCus118, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNovo13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiliacao24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );

        jTabbedPane7.addTab("  Faturamento / Comprovante ", jPanel31);

        jComboSexo6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jComboSexo6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lucro Real", "Lucro Presumido", "Simples Nacional" }));

        jLabel96.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel96.setText("Tipo Regime:");

        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel30.setToolTipText("");

        jLabelFoto3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelFoto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/empresaaddfoto.png"))); // NOI18N
        jLabelFoto3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFoto3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFoto3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );

        jTextFiliacao21.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao21.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao21.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao21ActionPerformed(evt);
            }
        });

        jTextFiliacao22.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jTextFiliacao22.setForeground(new java.awt.Color(153, 153, 153));
        jTextFiliacao22.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jTextFiliacao22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiliacao22ActionPerformed(evt);
            }
        });

        jButtonCancelar4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCancelar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/visualizar.png"))); // NOI18N
        jButtonCancelar4.setText("Ver Documentos");
        jButtonCancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar4ActionPerformed(evt);
            }
        });

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jComboSexo16.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jComboSexo16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cliente", "Fornecedor", "Colaborador", "Tranpostadora", "Cliente e Fornecedor", "Cliente e Colaborador", "Cliente e Transportadora", "Fornecedor e Transportadora", "Fornecedor e Colaborador", "Colaborador e Transportadora" }));

        jLabel107.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel107.setText("Tipo Cadastral:");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboSexo5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel96)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboSexo6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel85)
                        .addGap(3, 3, 3)
                        .addComponent(jDateDtNascimento3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jButtonNovo2)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonExcluir2)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonEditar2)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonGravar2)
                        .addGap(3, 3, 3)
                        .addComponent(jButtonCancelar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFiliacao21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFiliacao22, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel107)
                                            .addComponent(jComboSexo16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel29)
                                            .addComponent(jComboStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jSeparator6))))))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel29)
                            .addComponent(jLabel107))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboSexo16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFiliacao22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFiliacao21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateDtNascimento3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboSexo5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboSexo6, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(15, 15, 15)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonNovo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonExcluir2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditar2)
                        .addComponent(jButtonGravar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar3)
                        .addComponent(jButtonCancelar4)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1082, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Pessoa Juridica", jPanel8);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("  Pessoa Detalhes  ", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPesquisarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
//            Logger.getLogger(CadastroPessoaNewCadastroPessoaNew.class.getName()).log(Level.SEVERE, null, ex);
//            JOptionPane.showMessageDialog(null, "Não foi possível executar a pesquisa, por favor, rivise os dados e tente novamente!", "Erro", JOptionPane.WARNING_MESSAGE);
//        }


    }//GEN-LAST:event_jButtonPesquisarActionPerformed

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

    private void jButtonNovo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo3ActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        //        if (jDateDtNascimento.getDate() != null) {
            //            try {
                //                if (clienteDAO.ContaCod(Integer.parseInt(jTextCodigo.getText())) == 0) {
                    //                    this.setCliente();
                    //                } else {
                    //                    this.atualizaCliente();
                    //                }
                //                this.desativaCampo();
                //                this.jButtonGravar.setEnabled(false);
                //                this.jButtonNovo.setEnabled(true);
                //            } catch (SQLException ex) {
                //                Logger.getLogger(CadastroPessoaNewCadastroPessoaNew.class.getName()).log(Level.SEVERE, null, ex);
                //                JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos!", "Erro", JOptionPane.WARNING_MESSAGE);
                //            }
            //        } else {
            //            JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos!", "Erro", JOptionPane.WARNING_MESSAGE);
            //        }
        //
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        //        clienteBean.setBairro("dfjdsipofjdsf");
        //        System.out.println(clienteBean.getBairro());
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        //        this.ativaCampo();
        //        this.jButtonGravar.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        //        clienteBean.setFotoTirada(false); // o cliente não tm nenhuma foto tirada!!! Informo ao bean isso.
        //        this.jButtonNovo.setEnabled(false);
        //        this.ativaCampo();
        //        this.limpaCampo();
        //        this.jButtonGravar.setEnabled(true);
        //        this.setNovoCodigo();
        //s.setValidaFoto(Integer.parseInt(codigo.getText()), fotoTirada);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextFiliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacaoActionPerformed

    private void jTextFiliacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao2ActionPerformed

    private void jTextFiliacao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao3ActionPerformed

    private void jTextFiliacao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao4ActionPerformed

    private void jTextFiliacao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao5ActionPerformed

    private void jTextFiliacao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao6ActionPerformed

    private void jTextFiliacao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao7ActionPerformed

    private void jTextFiliacao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao8ActionPerformed

    private void jButtonNovo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo4ActionPerformed

    private void jTextFiliacao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao9ActionPerformed

    private void jTextFiliacao10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao10ActionPerformed

    private void jTextFiliacao11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao11ActionPerformed

    private void jButtonNovo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo5ActionPerformed

    private void jButtonCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelar2ActionPerformed

    private void jButtonNovo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo15ActionPerformed

    private void jButtonNovo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo16ActionPerformed

    private void jButtonGravar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravar8ActionPerformed

    private void jTextFiliacao14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao14ActionPerformed

    private void jButtonNovo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo8ActionPerformed

    private void jButtonNovo17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo17ActionPerformed

    private void jButtonNovo18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo18ActionPerformed

    private void jButtonGravar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravar9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravar9ActionPerformed

    private void jComboStatus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboStatus2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboStatus2ActionPerformed

    private void jButtonNovo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo2ActionPerformed

    private void jButtonCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelar3ActionPerformed

    private void jButtonEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditar2ActionPerformed

    private void jButtonExcluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluir2ActionPerformed

    private void jButtonGravar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravar2ActionPerformed

    private void jTextFiliacao13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao13ActionPerformed

    private void jTextFiliacao15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao15ActionPerformed

    private void jButtonNovo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo7ActionPerformed

    private void jTextFiliacao16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao16ActionPerformed

    private void jTextFiliacao18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao18ActionPerformed

    private void jButtonNovo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo9ActionPerformed

    private void jButtonNovo19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo19ActionPerformed

    private void jButtonNovo20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo20ActionPerformed

    private void jButtonGravar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravar10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravar10ActionPerformed

    private void jTextFiliacao19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao19ActionPerformed

    private void jButtonNovo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo10ActionPerformed

    private void jButtonNovo21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo21ActionPerformed

    private void jButtonNovo22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo22ActionPerformed

    private void jButtonGravar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravar11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravar11ActionPerformed

    private void jTextFiliacao21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao21ActionPerformed

    private void jTextFiliacao22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao22ActionPerformed

    private void jButtonCancelar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelar4ActionPerformed

    private void jTextFiliacao25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao25ActionPerformed

    private void jTextFiliacao12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao12ActionPerformed

    private void jButtonNovo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo12ActionPerformed

    private void jTextFiliacao17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao17ActionPerformed

    private void jTextFiliacao20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao20ActionPerformed

    private void jTextFiliacao26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao26ActionPerformed

    private void jTextFiliacao24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao24ActionPerformed

    private void jTextFiliacao27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao27ActionPerformed

    private void jTextFiliacao28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao28ActionPerformed

    private void jTextFiliacao29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao29ActionPerformed

    private void jButtonNovo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo13ActionPerformed

    private void jComboStatus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboStatus3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboStatus3ActionPerformed

    private void jButtonGravar12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravar12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravar12ActionPerformed

    private void jButtonNovo24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo24ActionPerformed

    private void jTextFiliacao30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao30ActionPerformed

    private void jTextFiliacao31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao31ActionPerformed

    private void jTextFiliacao32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao32ActionPerformed

    private void jTextFiliacao33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao33ActionPerformed

    private void jTextFiliacao34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao34ActionPerformed

    private void jTextFiliacao35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao35ActionPerformed

    private void jTextFiliacao36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao36ActionPerformed

    private void jTextFiliacao37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao37ActionPerformed

    private void jButtonNovo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovo6ActionPerformed

    private void jTextFiliacao38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiliacao38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiliacao38ActionPerformed

    private void TextValorCusto138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorCusto138ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorCusto138ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPessoaNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoaNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelValorCus118;
    private javax.swing.JTextField TextValorCusto138;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCancelar2;
    private javax.swing.JButton jButtonCancelar3;
    private javax.swing.JButton jButtonCancelar4;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEditar2;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonExcluir2;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonGravar10;
    private javax.swing.JButton jButtonGravar11;
    private javax.swing.JButton jButtonGravar12;
    private javax.swing.JButton jButtonGravar2;
    private javax.swing.JButton jButtonGravar8;
    private javax.swing.JButton jButtonGravar9;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonNovo10;
    private javax.swing.JButton jButtonNovo12;
    private javax.swing.JButton jButtonNovo13;
    private javax.swing.JButton jButtonNovo15;
    private javax.swing.JButton jButtonNovo16;
    private javax.swing.JButton jButtonNovo17;
    private javax.swing.JButton jButtonNovo18;
    private javax.swing.JButton jButtonNovo19;
    private javax.swing.JButton jButtonNovo2;
    private javax.swing.JButton jButtonNovo20;
    private javax.swing.JButton jButtonNovo21;
    private javax.swing.JButton jButtonNovo22;
    private javax.swing.JButton jButtonNovo24;
    private javax.swing.JButton jButtonNovo3;
    private javax.swing.JButton jButtonNovo4;
    private javax.swing.JButton jButtonNovo5;
    private javax.swing.JButton jButtonNovo6;
    private javax.swing.JButton jButtonNovo7;
    private javax.swing.JButton jButtonNovo8;
    private javax.swing.JButton jButtonNovo9;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox jComboEstadoCivil;
    private javax.swing.JComboBox jComboSelecionaTipoPesquisa;
    private javax.swing.JComboBox jComboSexo;
    private javax.swing.JComboBox jComboSexo15;
    private javax.swing.JComboBox jComboSexo16;
    private javax.swing.JComboBox jComboSexo2;
    private javax.swing.JComboBox jComboSexo3;
    private javax.swing.JComboBox jComboSexo5;
    private javax.swing.JComboBox jComboSexo6;
    private javax.swing.JComboBox jComboSexo9;
    private javax.swing.JComboBox jComboStatus2;
    private javax.swing.JComboBox jComboStatus3;
    private com.toedter.calendar.JDateChooser jDateDtNascimento;
    private com.toedter.calendar.JDateChooser jDateDtNascimento1;
    private com.toedter.calendar.JDateChooser jDateDtNascimento2;
    private com.toedter.calendar.JDateChooser jDateDtNascimento3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelFoto2;
    private javax.swing.JLabel jLabelFoto3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable16;
    private javax.swing.JTable jTable17;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTable jTableCliente2;
    private javax.swing.JTextField jTextFiliacao;
    private javax.swing.JTextField jTextFiliacao10;
    private javax.swing.JTextField jTextFiliacao11;
    private javax.swing.JTextField jTextFiliacao12;
    private javax.swing.JTextField jTextFiliacao13;
    private javax.swing.JTextField jTextFiliacao14;
    private javax.swing.JTextField jTextFiliacao15;
    private javax.swing.JTextField jTextFiliacao16;
    private javax.swing.JTextField jTextFiliacao17;
    private javax.swing.JTextField jTextFiliacao18;
    private javax.swing.JTextField jTextFiliacao19;
    private javax.swing.JTextField jTextFiliacao2;
    private javax.swing.JTextField jTextFiliacao20;
    private javax.swing.JTextField jTextFiliacao21;
    private javax.swing.JTextField jTextFiliacao22;
    private javax.swing.JTextField jTextFiliacao24;
    private javax.swing.JTextField jTextFiliacao25;
    private javax.swing.JTextField jTextFiliacao26;
    private javax.swing.JTextField jTextFiliacao27;
    private javax.swing.JTextField jTextFiliacao28;
    private javax.swing.JTextField jTextFiliacao29;
    private javax.swing.JTextField jTextFiliacao3;
    private javax.swing.JTextField jTextFiliacao30;
    private javax.swing.JTextField jTextFiliacao31;
    private javax.swing.JTextField jTextFiliacao32;
    private javax.swing.JTextField jTextFiliacao33;
    private javax.swing.JTextField jTextFiliacao34;
    private javax.swing.JTextField jTextFiliacao35;
    private javax.swing.JTextField jTextFiliacao36;
    private javax.swing.JTextField jTextFiliacao37;
    private javax.swing.JTextField jTextFiliacao38;
    private javax.swing.JTextField jTextFiliacao4;
    private javax.swing.JTextField jTextFiliacao5;
    private javax.swing.JTextField jTextFiliacao6;
    private javax.swing.JTextField jTextFiliacao7;
    private javax.swing.JTextField jTextFiliacao8;
    private javax.swing.JTextField jTextFiliacao9;
    private javax.swing.JTextField jTextPesquisar;
    // End of variables declaration//GEN-END:variables
}
