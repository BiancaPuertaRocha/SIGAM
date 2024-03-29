/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControleAluno;
import control.ControleCaixa;
import control.ControlePessoa;
import control.ControleSecretario;
import control.ControleTreinador;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.persistence.NoResultException;
import model.Aluno;
import model.Caixa;
import model.Pessoa;
import model.Secretario;
import model.Treinador;

/**
 *
 * @author abner
 */
public class LoginForm extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private ControlePessoa cp = new ControlePessoa();
    private ControleCaixa cc = new ControleCaixa();

    /**
     * Creates new form loginForm
     */
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/view/images/favicon2.png")));
        warningPanelForm1.setVisible(false);
        txtUsuario.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        sideImage = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        txtUsuario = new com.hq.swingmaterialdesign.materialdesign.MTextField();
        txtSenha = new com.hq.swingmaterialdesign.materialdesign.MPasswordField();
        btnEntrar = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mButton3 = new com.hq.swingmaterialdesign.materialdesign.MButton();
        mGradientButton2 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton3 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton4 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton5 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton6 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton7 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        jLabel3 = new javax.swing.JLabel();
        mGradientButton8 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton9 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton10 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton12 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton13 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton14 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton15 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        mGradientButton16 = new com.hq.swingmaterialdesign.materialdesign.MGradientButton();
        warningPanelForm1 = new javax.swing.JPanel();
        btnError1 = new com.hq.swingmaterialdesign.materialdesign.MButton();
        labelWarningForm1 = new javax.swing.JLabel();
        loadingPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgMouseDragged(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bgMouseReleased(evt);
            }
        });
        bg.setLayout(new java.awt.CardLayout());

        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/SIGAM.png"))); // NOI18N
        loginPanel.add(sideImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        formPanel.setBackground(new java.awt.Color(37, 46, 55));
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(37, 46, 55));
        txtUsuario.setForeground(new java.awt.Color(240, 240, 240));
        txtUsuario.setAccent(new java.awt.Color(220, 148, 74));
        txtUsuario.setFont(new java.awt.Font("Nunito SemiBold", 0, 16)); // NOI18N
        txtUsuario.setLabel("Nome de usuário");
        txtUsuario.setSelectionColor(new java.awt.Color(220, 148, 74));
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        formPanel.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 310, 60));

        txtSenha.setBackground(new java.awt.Color(37, 46, 55));
        txtSenha.setForeground(new java.awt.Color(240, 240, 240));
        txtSenha.setAccent(new java.awt.Color(220, 148, 74));
        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSenha.setLabel("Senha");
        txtSenha.setSelectionColor(new java.awt.Color(220, 148, 74));
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
        });
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSenhaKeyTyped(evt);
            }
        });
        formPanel.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 310, 60));

        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.setBorderRadius(40);
        btnEntrar.setEndColor(new java.awt.Color(232, 25, 30));
        btnEntrar.setFont(new java.awt.Font("Nunito ExtraBold", 0, 14)); // NOI18N
        btnEntrar.setHoverEndColor(new java.awt.Color(244, 12, 17));
        btnEntrar.setHoverStartColor(new java.awt.Color(220, 126, 30));
        btnEntrar.setStartColor(new java.awt.Color(220, 148, 74));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        formPanel.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 310, 40));

        mButton3.setBackground(new java.awt.Color(37, 46, 55));
        mButton3.setBorder(null);
        mButton3.setForeground(new java.awt.Color(240, 240, 240));
        mButton3.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.CLOSE));
        mButton3.setBorderRadius(0);
        mButton3.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(20f));
        mButton3.setType(com.hq.swingmaterialdesign.materialdesign.MButton.Type.FLAT);
        mButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mButton3MouseExited(evt);
            }
        });
        mButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButton3ActionPerformed(evt);
            }
        });
        formPanel.add(mButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 40, 40));

        mGradientButton2.setBorderRadius(10);
        mGradientButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton2.setEndColor(new java.awt.Color(227, 49, 45));
        mGradientButton2.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton2.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton2.setStartColor(new java.awt.Color(225, 59, 47));
        mGradientButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGradientButton2ActionPerformed(evt);
            }
        });
        formPanel.add(mGradientButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 60, 13, 80));

        mGradientButton3.setBorderRadius(10);
        mGradientButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton3.setEndColor(new java.awt.Color(232, 25, 30));
        mGradientButton3.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton3.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton3.setStartColor(new java.awt.Color(230, 31, 34));
        formPanel.add(mGradientButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 13, 40));

        mGradientButton4.setBorderRadius(10);
        mGradientButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton4.setEndColor(new java.awt.Color(228, 35, 36));
        mGradientButton4.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton4.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton4.setStartColor(new java.awt.Color(227, 42, 41));
        formPanel.add(mGradientButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 70, 13, 60));

        mGradientButton5.setBorderRadius(10);
        mGradientButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton5.setEndColor(new java.awt.Color(222, 128, 63));
        mGradientButton5.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton5.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton5.setStartColor(new java.awt.Color(220, 138, 68));
        mGradientButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGradientButton5ActionPerformed(evt);
            }
        });
        formPanel.add(mGradientButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 60, 13, 80));

        mGradientButton6.setBorderRadius(10);
        mGradientButton6.setContentAreaFilled(false);
        mGradientButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton6.setEndColor(new java.awt.Color(220, 138, 68));
        mGradientButton6.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton6.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton6.setStartColor(new java.awt.Color(220, 144, 71));
        formPanel.add(mGradientButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 70, 13, 60));

        mGradientButton7.setBorderRadius(10);
        mGradientButton7.setEnabled(false);
        mGradientButton7.setEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton7.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton7.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton7.setStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGradientButton7ActionPerformed(evt);
            }
        });
        formPanel.add(mGradientButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 66, 13, 49));

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("S I G A M");
        formPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 420, 40));

        mGradientButton8.setBorderRadius(10);
        mGradientButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton8.setEndColor(new java.awt.Color(225, 71, 48));
        mGradientButton8.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton8.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton8.setStartColor(new java.awt.Color(223, 80, 50));
        formPanel.add(mGradientButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 76, 13, 25));

        mGradientButton9.setBorderRadius(10);
        mGradientButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton9.setEndColor(new java.awt.Color(223, 87, 51));
        mGradientButton9.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton9.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton9.setStartColor(new java.awt.Color(223, 95, 52));
        formPanel.add(mGradientButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 76, 13, 25));

        mGradientButton10.setBorderRadius(10);
        mGradientButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton10.setEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton10.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton10.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton10.setStartColor(new java.awt.Color(240, 240, 240));
        formPanel.add(mGradientButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 102, 13, 32));

        mGradientButton12.setBorderRadius(10);
        mGradientButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton12.setEndColor(new java.awt.Color(220, 146, 72));
        mGradientButton12.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton12.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton12.setStartColor(new java.awt.Color(220, 148, 74));
        formPanel.add(mGradientButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 80, 13, 40));

        mGradientButton13.setBorderRadius(10);
        mGradientButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton13.setEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton13.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton13.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton13.setStartColor(new java.awt.Color(240, 240, 240));
        formPanel.add(mGradientButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 124, 52, 13));

        mGradientButton14.setBorderRadius(10);
        mGradientButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton14.setEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton14.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton14.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton14.setStartColor(new java.awt.Color(240, 240, 240));
        formPanel.add(mGradientButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 64, 50, 13));

        mGradientButton15.setBorderRadius(10);
        mGradientButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton15.setEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton15.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton15.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton15.setStartColor(new java.awt.Color(240, 240, 240));
        formPanel.add(mGradientButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 102, 50, 13));

        mGradientButton16.setBorderRadius(10);
        mGradientButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mGradientButton16.setEndColor(new java.awt.Color(223, 100, 53));
        mGradientButton16.setHoverEndColor(new java.awt.Color(240, 240, 240));
        mGradientButton16.setHoverStartColor(new java.awt.Color(240, 240, 240));
        mGradientButton16.setStartColor(new java.awt.Color(223, 108, 54));
        formPanel.add(mGradientButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 76, 13, 25));

        warningPanelForm1.setBackground(new java.awt.Color(255, 51, 51));

        btnError1.setBackground(new java.awt.Color(255, 51, 51));
        btnError1.setBorder(null);
        btnError1.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.CLOSE));
        btnError1.setBorderRadius(0);
        btnError1.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(20f));
        btnError1.setType(com.hq.swingmaterialdesign.materialdesign.MButton.Type.FLAT);
        btnError1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnError1ActionPerformed(evt);
            }
        });

        labelWarningForm1.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        labelWarningForm1.setForeground(new java.awt.Color(255, 255, 255));
        labelWarningForm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWarningForm1.setText("Preencha os campos corretamente.");

        javax.swing.GroupLayout warningPanelForm1Layout = new javax.swing.GroupLayout(warningPanelForm1);
        warningPanelForm1.setLayout(warningPanelForm1Layout);
        warningPanelForm1Layout.setHorizontalGroup(
            warningPanelForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, warningPanelForm1Layout.createSequentialGroup()
                .addComponent(labelWarningForm1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnError1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        warningPanelForm1Layout.setVerticalGroup(
            warningPanelForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningPanelForm1Layout.createSequentialGroup()
                .addGroup(warningPanelForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnError1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWarningForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        formPanel.add(warningPanelForm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 430, -1));

        loginPanel.add(formPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 430, 540));

        bg.add(loginPanel, "card2");

        loadingPanel.setBackground(new java.awt.Color(37, 46, 55));

        javax.swing.GroupLayout loadingPanelLayout = new javax.swing.GroupLayout(loadingPanel);
        loadingPanel.setLayout(loadingPanelLayout);
        loadingPanelLayout.setHorizontalGroup(
            loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        loadingPanelLayout.setVerticalGroup(
            loadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        bg.add(loadingPanel, "card3");

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

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void mButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_mButton3ActionPerformed

    private void mButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mButton3MouseEntered
        mButton3.setForeground(new java.awt.Color(232, 25, 30));
    }//GEN-LAST:event_mButton3MouseEntered

    private void mButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mButton3MouseExited
        mButton3.setForeground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_mButton3MouseExited

    private void mGradientButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGradientButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mGradientButton2ActionPerformed

    private void mGradientButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGradientButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mGradientButton5ActionPerformed

    private void mGradientButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGradientButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mGradientButton7ActionPerformed

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_bgMousePressed

    private void bgMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseReleased
        try {
            setOpacity((float) 1);
        } catch (java.lang.UnsupportedOperationException e) {

        }
    }//GEN-LAST:event_bgMouseReleased

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        setLocation(evt.getXOnScreen() - xMouse, evt.getYOnScreen() - yMouse);
        try {
            setOpacity((float) 0.9);
        } catch (java.lang.UnsupportedOperationException e) {

        }
    }//GEN-LAST:event_bgMouseDragged

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        entrar();
    }//GEN-LAST:event_btnEntrarActionPerformed
    private void entrar() {
        if (txtSenha.getText().equals("") || txtUsuario.getText().equals("")) {
            labelWarningForm1.setText("Preencha os campos corretamente");
            warningPanelForm1.setVisible(true);
            Color errorColor = new Color(255, 0, 0);
            if (txtSenha.getText().equals("")) {
                txtSenha.setForeground(errorColor);
            }
            if (txtUsuario.getText().equals("")) {
                txtUsuario.setForeground(errorColor);
            }
        } else {
            Pessoa p = null;
            try {
                p = cp.findByLoginSenha(txtUsuario.getText(), txtSenha.getText());
                loadingPanel.setVisible(true);
                formPanel.setVisible(false);
                if (p instanceof Secretario) {
                    System.out.println(((Secretario) p).getHrEntrada());
                    ControleSecretario.setLogado((Secretario) p);
                    DashboardSecretario tela = new DashboardSecretario();
                    tela.setVisible(true);
                    this.dispose();
                    Caixa c = null;
                    try {
                        c = cc.findByAbertoFuncionario((Secretario) p, new Date());
                    } catch (NoResultException ex) {
                        System.out.println("nao encontrou caixa");
                    }
                    ControleCaixa.setCaixa(c);
                } else if (p instanceof Treinador) {
                    ControleTreinador.setLogado((Treinador) p);
                    DashboardTreinador tela = new DashboardTreinador();
                    tela.setVisible(true);
                    this.dispose();
                } else if (p instanceof Aluno) {
                    ControleAluno.setLogado((Aluno) p);
                    DashboardAluno tela = new DashboardAluno();
                    tela.setVisible(true);
                    this.dispose();
                }

            } catch (NoResultException e) {
                labelWarningForm1.setText("Usuário ou senha incorretos");
                warningPanelForm1.setVisible(true);
            }
        }
    }
    private void btnError1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnError1ActionPerformed
        warningPanelForm1.setVisible(false);
    }//GEN-LAST:event_btnError1ActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario.setForeground(new Color(240, 240, 240));
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        txtSenha.setForeground(new Color(240, 240, 240));
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyTyped

    }//GEN-LAST:event_txtSenhaKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped

    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            entrar();

        }

    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            entrar();

        }

    }//GEN-LAST:event_txtUsuarioKeyPressed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton btnEntrar;
    private com.hq.swingmaterialdesign.materialdesign.MButton btnError1;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelWarningForm1;
    private javax.swing.JPanel loadingPanel;
    private javax.swing.JPanel loginPanel;
    private com.hq.swingmaterialdesign.materialdesign.MButton mButton3;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton10;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton12;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton13;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton14;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton15;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton16;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton2;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton3;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton4;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton5;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton6;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton7;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton8;
    private com.hq.swingmaterialdesign.materialdesign.MGradientButton mGradientButton9;
    private javax.swing.JLabel sideImage;
    private com.hq.swingmaterialdesign.materialdesign.MPasswordField txtSenha;
    private com.hq.swingmaterialdesign.materialdesign.MTextField txtUsuario;
    private javax.swing.JPanel warningPanelForm1;
    // End of variables declaration//GEN-END:variables
}
