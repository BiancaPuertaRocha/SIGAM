/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.hq.swingmaterialdesign.materialdesign.MGradientPanel;
import control.ControleCaixa;
import control.ControleFuncionario;
import control.ControleSecretario;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Funcionario;
import util.AtualizadorHorario;

/**
 *
 * @author abner
 */
public class DashboardSecretario extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    
    ControleCaixa contCaixa = new ControleCaixa();
    ControleFuncionario contFunc = new ControleFuncionario();

    public DashboardSecretario() {
        initComponents();
        configTela();
        atualizaOnline();
        iniciaHorario();
        if(!ControleSecretario.getLogado().isTipo()){
            labelSecretarios.setVisible(false);
            labelTreinadores.setVisible(false);
            botTreinadores.setVisible(false);
            botSecretarios.setVisible(false);
        }
    }
    private void configTela(){
        this.setTitle("SIGAM");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/view/images/favicon2.png")));
        this.setExtendedState(MAXIMIZED_BOTH);
        try {
            ImageIcon im = new ImageIcon(ControleSecretario.getLogado().getImagem());
            profileImagePanel.setImage(im.getImage());
            profileImagePanel.repaint();
        } catch (Exception e) {

        }
       
        mostraMenu(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        logo1 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        logo2 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        logo3 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        profileImagePanel = new com.hq.swingmaterialdesign.materialdesign.MGradientPanel();
        panGuia = new javax.swing.JPanel();
        panHome = new javax.swing.JPanel();
        panHomeGradient = new com.hq.swingmaterialdesign.materialdesign.MGradientPanel();
        txtHora = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtDataHora = new javax.swing.JLabel();
        panMenuUser1 = new com.hq.swingmaterialdesign.materialdesign.MGradientPanel();
        mGradientButton9 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton10 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnRefresh = new com.hq.swingmaterialdesign.materialdesign.MButton();
        botAlunos = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        jLabel1 = new javax.swing.JLabel();
        botTreinadores = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        labelTreinadores = new javax.swing.JLabel();
        botSecretarios = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        labelSecretarios = new javax.swing.JLabel();
        botCaixa = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        jLabel4 = new javax.swing.JLabel();
        botDespesa = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        jLabel5 = new javax.swing.JLabel();
        botPagamentos = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        sidePanel.setBackground(new java.awt.Color(37, 46, 55));

        logo1.setBorderRadius(10);
        logo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logo1.setEndColor(new java.awt.Color(222, 128, 63));
        logo1.setHoverEndColor(new java.awt.Color(240, 240, 240));
        logo1.setHoverStartColor(new java.awt.Color(240, 240, 240));
        logo1.setStartColor(new java.awt.Color(223, 80, 50));
        logo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logo1ActionPerformed(evt);
            }
        });

        logo2.setBorderRadius(10);
        logo2.setContentAreaFilled(false);
        logo2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logo2.setEndColor(new java.awt.Color(220, 138, 68));
        logo2.setHoverEndColor(new java.awt.Color(240, 240, 240));
        logo2.setHoverStartColor(new java.awt.Color(240, 240, 240));
        logo2.setStartColor(new java.awt.Color(223, 95, 52));

        logo3.setBorderRadius(10);
        logo3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logo3.setEndColor(new java.awt.Color(223, 95, 52));
        logo3.setHoverEndColor(new java.awt.Color(240, 240, 240));
        logo3.setHoverStartColor(new java.awt.Color(240, 240, 240));
        logo3.setStartColor(new java.awt.Color(223, 108, 54));

        profileImagePanel.setBackground(new java.awt.Color(37, 46, 55));
        profileImagePanel.setBorderRadius(120);
        profileImagePanel.setFillBackground(false);
        profileImagePanel.setFillImage(true);
        profileImagePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileImagePanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout profileImagePanelLayout = new javax.swing.GroupLayout(profileImagePanel);
        profileImagePanel.setLayout(profileImagePanelLayout);
        profileImagePanelLayout.setHorizontalGroup(
            profileImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        profileImagePanelLayout.setVerticalGroup(
            profileImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addComponent(logo3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(profileImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logo3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 584, Short.MAX_VALUE)
                .addComponent(profileImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panGuia.setLayout(new java.awt.CardLayout());

        panHomeGradient.setBorderRadius(0);
        panHomeGradient.setEndColor(new java.awt.Color(37, 46, 55));
        panHomeGradient.setStartColor(new java.awt.Color(50, 60, 69));
        panHomeGradient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panHomeGradientMouseClicked(evt);
            }
        });

        txtHora.setFont(new java.awt.Font("Nunito SemiBold", 0, 48)); // NOI18N
        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        txtHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtDataHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDataHora.setForeground(new java.awt.Color(255, 255, 255));
        txtDataHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        panMenuUser1.setBackground(new java.awt.Color(0,0,0,0));
        panMenuUser1.setBorderRadius(35);
        panMenuUser1.setEndColor(new java.awt.Color(73, 91, 109));
        panMenuUser1.setStartColor(new java.awt.Color(92, 110, 127));

        mGradientButton9.setForeground(new java.awt.Color(255, 255, 255));
        mGradientButton9.setText("EDITAR PERFIL");
        mGradientButton9.setEndColor(new java.awt.Color(81, 102, 122));
        mGradientButton9.setFont(new java.awt.Font("Nunito ExtraBold", 0, 18)); // NOI18N
        mGradientButton9.setHoverEndColor(new java.awt.Color(81, 102, 122));
        mGradientButton9.setHoverStartColor(new java.awt.Color(0, 153, 153));
        mGradientButton9.setStartColor(new java.awt.Color(92, 110, 127));
        mGradientButton9.setType(com.hq.swingmaterialdesign.materialdesign.MGradientButton.Type.FLAT);

        mGradientButton10.setForeground(new java.awt.Color(255, 255, 255));
        mGradientButton10.setText("LOGOUT");
        mGradientButton10.setEndColor(new java.awt.Color(81, 102, 122));
        mGradientButton10.setFont(new java.awt.Font("Nunito ExtraBold", 0, 18)); // NOI18N
        mGradientButton10.setHoverEndColor(new java.awt.Color(81, 102, 122));
        mGradientButton10.setHoverStartColor(new java.awt.Color(0, 153, 153));
        mGradientButton10.setStartColor(new java.awt.Color(92, 110, 127));
        mGradientButton10.setType(com.hq.swingmaterialdesign.materialdesign.MGradientButton.Type.FLAT);
        mGradientButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGradientButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panMenuUser1Layout = new javax.swing.GroupLayout(panMenuUser1);
        panMenuUser1.setLayout(panMenuUser1Layout);
        panMenuUser1Layout.setHorizontalGroup(
            panMenuUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mGradientButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
            .addComponent(mGradientButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panMenuUser1Layout.setVerticalGroup(
            panMenuUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuUser1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(mGradientButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mGradientButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new Color(0,0,0,0));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new Color(0,0,0,0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(jPanel1);

        jLabel8.setFont(new java.awt.Font("Nunito ExtraBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Funcionários na academia");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(37, 46, 55));
        btnRefresh.setBorder(null);
        btnRefresh.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.REFRESH));
        btnRefresh.setBorderRadius(40);
        btnRefresh.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(20f));
        btnRefresh.setType(com.hq.swingmaterialdesign.materialdesign.MButton.Type.FLAT);
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRefreshMouseExited(evt);
            }
        });
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        btnRefresh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRefreshKeyPressed(evt);
            }
        });

        botAlunos.setBackground(new Color(0,0,0,0));
        botAlunos.setForeground(new java.awt.Color(255, 255, 255));
        botAlunos.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.PERSON_ADD));
        botAlunos.setBorderRadius(40);
        botAlunos.setEndColor(new java.awt.Color(120, 255, 214));
        botAlunos.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        botAlunos.setHoverEndColor(new java.awt.Color(144, 217, 104));
        botAlunos.setHoverStartColor(new java.awt.Color(144, 217, 104));
        botAlunos.setStartColor(new java.awt.Color(168, 255, 120));
        botAlunos.setType(com.hq.swingmaterialdesign.materialdesign.MGradientButton.Type.FLAT);
        botAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAlunosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nunito ExtraBold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TREINADORES");

        botTreinadores.setBackground(new Color(0,0,0,0));
        botTreinadores.setForeground(new java.awt.Color(255, 255, 255));
        botTreinadores.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.PERSON_ADD));
        botTreinadores.setBorderRadius(40);
        botTreinadores.setEndColor(new java.awt.Color(243, 115, 53));
        botTreinadores.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        botTreinadores.setHoverEndColor(new java.awt.Color(226, 176, 33));
        botTreinadores.setHoverStartColor(new java.awt.Color(226, 176, 33));
        botTreinadores.setStartColor(new java.awt.Color(253, 200, 48));
        botTreinadores.setType(com.hq.swingmaterialdesign.materialdesign.MGradientButton.Type.FLAT);
        botTreinadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botTreinadoresActionPerformed(evt);
            }
        });

        labelTreinadores.setFont(new java.awt.Font("Nunito ExtraBold", 0, 14)); // NOI18N
        labelTreinadores.setForeground(new java.awt.Color(255, 255, 255));
        labelTreinadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTreinadores.setText("ALUNOS");

        botSecretarios.setBackground(new Color(0,0,0,0));
        botSecretarios.setForeground(new java.awt.Color(255, 255, 255));
        botSecretarios.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.PERSON_ADD));
        botSecretarios.setBorderRadius(40);
        botSecretarios.setEndColor(new java.awt.Color(247, 183, 51));
        botSecretarios.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        botSecretarios.setHoverEndColor(new java.awt.Color(241, 215, 131));
        botSecretarios.setHoverStartColor(new java.awt.Color(241, 215, 131));
        botSecretarios.setStartColor(new java.awt.Color(255, 239, 186));
        botSecretarios.setType(com.hq.swingmaterialdesign.materialdesign.MGradientButton.Type.FLAT);
        botSecretarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSecretariosActionPerformed(evt);
            }
        });

        labelSecretarios.setFont(new java.awt.Font("Nunito ExtraBold", 0, 14)); // NOI18N
        labelSecretarios.setForeground(new java.awt.Color(255, 255, 255));
        labelSecretarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSecretarios.setText("SECRETÁRIOS");

        botCaixa.setBackground(new Color(0,0,0,0));
        botCaixa.setForeground(new java.awt.Color(255, 255, 255));
        botCaixa.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ASSESSMENT));
        botCaixa.setBorderRadius(40);
        botCaixa.setEndColor(new java.awt.Color(189, 194, 214));
        botCaixa.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        botCaixa.setHoverEndColor(new java.awt.Color(62, 208, 181));
        botCaixa.setHoverStartColor(new java.awt.Color(62, 208, 181));
        botCaixa.setStartColor(new java.awt.Color(116, 235, 213));
        botCaixa.setType(com.hq.swingmaterialdesign.materialdesign.MGradientButton.Type.FLAT);
        botCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCaixaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nunito ExtraBold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CAIXA");

        botDespesa.setBackground(new Color(0,0,0,0));
        botDespesa.setForeground(new java.awt.Color(255, 255, 255));
        botDespesa.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.MONEY_OFF));
        botDespesa.setBorderRadius(40);
        botDespesa.setEndColor(new java.awt.Color(255, 94, 98));
        botDespesa.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        botDespesa.setHoverEndColor(new java.awt.Color(233, 129, 77));
        botDespesa.setHoverStartColor(new java.awt.Color(233, 129, 77));
        botDespesa.setStartColor(new java.awt.Color(255, 153, 102));
        botDespesa.setType(com.hq.swingmaterialdesign.materialdesign.MGradientButton.Type.FLAT);
        botDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botDespesaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nunito ExtraBold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DESPESAS");

        botPagamentos.setBackground(new Color(0,0,0,0));
        botPagamentos.setForeground(new java.awt.Color(255, 255, 255));
        botPagamentos.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ATTACH_MONEY));
        botPagamentos.setBorderRadius(40);
        botPagamentos.setEndColor(new java.awt.Color(240, 80, 83));
        botPagamentos.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        botPagamentos.setHoverEndColor(new java.awt.Color(200, 218, 158));
        botPagamentos.setHoverStartColor(new java.awt.Color(200, 218, 158));
        botPagamentos.setStartColor(new java.awt.Color(225, 238, 195));
        botPagamentos.setType(com.hq.swingmaterialdesign.materialdesign.MGradientButton.Type.FLAT);
        botPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPagamentosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Nunito ExtraBold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PAGAMENTOS");

        javax.swing.GroupLayout panHomeGradientLayout = new javax.swing.GroupLayout(panHomeGradient);
        panHomeGradient.setLayout(panHomeGradientLayout);
        panHomeGradientLayout.setHorizontalGroup(
            panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHomeGradientLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panHomeGradientLayout.createSequentialGroup()
                        .addGroup(panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(botTreinadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTreinadores, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(botDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelSecretarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botPagamentos, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(botSecretarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(428, 428, 428))
                    .addGroup(panHomeGradientLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panHomeGradientLayout.createSequentialGroup()
                        .addGroup(panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(panHomeGradientLayout.createSequentialGroup()
                                .addComponent(panMenuUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDataHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31))))
        );
        panHomeGradientLayout.setVerticalGroup(
            panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHomeGradientLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panHomeGradientLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panHomeGradientLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panHomeGradientLayout.createSequentialGroup()
                                .addGroup(panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panHomeGradientLayout.createSequentialGroup()
                                        .addComponent(botAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelTreinadores))
                                    .addGroup(panHomeGradientLayout.createSequentialGroup()
                                        .addComponent(botSecretarios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelSecretarios)))
                                .addGap(26, 26, 26)
                                .addGroup(panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panHomeGradientLayout.createSequentialGroup()
                                        .addComponent(botPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panHomeGradientLayout.createSequentialGroup()
                                        .addComponent(botDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))))
                            .addGroup(panHomeGradientLayout.createSequentialGroup()
                                .addComponent(botTreinadores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panHomeGradientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHomeGradientLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(161, 161, 161))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panHomeGradientLayout.createSequentialGroup()
                                        .addComponent(botCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(panMenuUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        panHomeGradientLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botAlunos, botCaixa, botDespesa, botPagamentos, botSecretarios, botTreinadores});

        javax.swing.GroupLayout panHomeLayout = new javax.swing.GroupLayout(panHome);
        panHome.setLayout(panHomeLayout);
        panHomeLayout.setHorizontalGroup(
            panHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1348, Short.MAX_VALUE)
            .addGroup(panHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panHomeGradient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1348, Short.MAX_VALUE))
        );
        panHomeLayout.setVerticalGroup(
            panHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
            .addGroup(panHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panHomeLayout.createSequentialGroup()
                    .addComponent(panHomeGradient, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        panGuia.add(panHome, "card4");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1287, Short.MAX_VALUE))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panGuia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1288, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panGuia, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void atualizaOnline() {
        
        for(Component c : jPanel1.getComponents())
            c.setVisible(false);
        
        int ind = 0;
        for (Funcionario i : contFunc.findOnline()) {
            String[] textoSeparado = i.getNome().split(" ");
            funcionariosAtivos(textoSeparado[0], i.getImagem(), ind);
            ind++;
        }
    }

    private void iniciaHorario() {
        AtualizadorHorario ah = new AtualizadorHorario(txtHora, txtDataHora);
        ah.mostrarData(true);
        Thread thHora = ah;
        thHora.start();
    }
    private void logo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logo1ActionPerformed

    private void botCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCaixaActionPerformed
        FormCaixa tela = new FormCaixa(this, false);
        tela.setVisible(true);
        mostraMenu(false);
    }//GEN-LAST:event_botCaixaActionPerformed

    private void botSecretariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSecretariosActionPerformed
        FormSecretario form = new FormSecretario(this, false);
        form.setVisible(true);
        mostraMenu(false);
    }//GEN-LAST:event_botSecretariosActionPerformed

    private void botTreinadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botTreinadoresActionPerformed
        FormTreinador form = new FormTreinador(this, false);
        form.setVisible(true);
        mostraMenu(false);
    }//GEN-LAST:event_botTreinadoresActionPerformed

    private void botAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAlunosActionPerformed
        FormAluno form = new FormAluno(this, false);
        form.setVisible(true);
        mostraMenu(false);
    }//GEN-LAST:event_botAlunosActionPerformed

    private void botDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botDespesaActionPerformed
        FormDespesas form = new FormDespesas(this, false);
        form.setVisible(true);
        mostraMenu(false);
    }//GEN-LAST:event_botDespesaActionPerformed

    private void botPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPagamentosActionPerformed
        FormPagamento form = new FormPagamento(this, false);
        form.setVisible(true);
        mostraMenu(false);
    }//GEN-LAST:event_botPagamentosActionPerformed

    private void mGradientButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGradientButton10ActionPerformed
     ControleSecretario.setLogado(null);
        ControleCaixa.setCaixa(null);
        LoginForm form = new LoginForm();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mGradientButton10ActionPerformed

    private void panHomeGradientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panHomeGradientMouseClicked
        mostraMenu(false);
    }//GEN-LAST:event_panHomeGradientMouseClicked

    private void profileImagePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileImagePanelMouseClicked
        if(panMenuUser1.isVisible())
            mostraMenu(false);
        else
            mostraMenu(true);
    }//GEN-LAST:event_profileImagePanelMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshMouseEntered

    private void btnRefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshMouseExited

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
       atualizaOnline();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRefreshKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRefreshKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_F5)
        btnRefresh.doClick();
    }//GEN-LAST:event_btnRefreshKeyPressed

    private void mostraMenu(boolean b) {
      
        panMenuUser1.setVisible(b);
    }

    private void imageInPanel(JPanel panel, MGradientPanel image, JLabel label, String nome, byte[] profilePic) {
        panel.setBackground(new Color(0, 0, 0, 0));

        image.setBackground(new Color(0, 0, 0, 0));
        image.setBorderRadius(120);
        image.setFillBackground(false);
        image.setFillImage(true);
        try {
            ImageIcon im = new ImageIcon(profilePic);
            image.setImage(im.getImage());
            image.repaint();
        } catch (Exception e) {
        }

        label.setFont(new java.awt.Font("Nunito ExtraBold", 0, 14));
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText(nome);

        // swing layout spaces
        javax.swing.GroupLayout ativo1Layout = new javax.swing.GroupLayout(image);
        image.setLayout(ativo1Layout);
        ativo1Layout.setHorizontalGroup(
                ativo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        ativo1Layout.setVerticalGroup(
                ativo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panFuncioLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panFuncioLayout);
        panFuncioLayout.setHorizontalGroup(
                panFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panFuncioLayout.createSequentialGroup()
                                .addGroup(panFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        panFuncioLayout.setVerticalGroup(
                panFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panFuncioLayout.createSequentialGroup()
                                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label))
        );
    }

    private void funcionariosAtivos(String nome, byte[] profilePic, int index) {
        JPanel panel = new JPanel();
        MGradientPanel image = new MGradientPanel();
        JLabel label = new javax.swing.JLabel();

        imageInPanel(panel, image, label, nome, profilePic);

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(118 * index, 0, -1, -1));

        jScrollPane1.setViewportView(jPanel1);
    }

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
            java.util.logging.Logger.getLogger(DashboardSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardSecretario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton botAlunos;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton botCaixa;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton botDespesa;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton botPagamentos;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton botSecretarios;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton botTreinadores;
    private com.hq.swingmaterialdesign.materialdesign.MButton btnRefresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelSecretarios;
    private javax.swing.JLabel labelTreinadores;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton logo1;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton logo2;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton logo3;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton10;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton9;
    private javax.swing.JPanel panGuia;
    private javax.swing.JPanel panHome;
    private com.hq.swingmaterialdesign.materialdesign.MGradientPanel panHomeGradient;
    private com.hq.swingmaterialdesign.materialdesign.MGradientPanel panMenuUser1;
    private com.hq.swingmaterialdesign.materialdesign.MGradientPanel profileImagePanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel txtDataHora;
    private javax.swing.JLabel txtHora;
    // End of variables declaration//GEN-END:variables
}
