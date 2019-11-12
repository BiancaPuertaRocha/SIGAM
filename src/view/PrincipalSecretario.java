/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import util.AtualizadorHorario;

/**
 *
 * @author bianca
 */
public class PrincipalSecretario extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public PrincipalSecretario() {
       
        initComponents();
        AtualizadorHorario ah = new AtualizadorHorario(txtTime, txtData);
        ah.mostrarData(true);
        Thread thHora = ah;
        thHora.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new com.hq.swingmaterialdesign.materialdesign.MButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mPanel6 = new com.hq.swingmaterialdesign.materialdesign.MPanel();
        btnExit1 = new com.hq.swingmaterialdesign.materialdesign.MButton();
        jLabel1 = new javax.swing.JLabel();
        mPanel11 = new com.hq.swingmaterialdesign.materialdesign.MPanel();
        btnExit4 = new com.hq.swingmaterialdesign.materialdesign.MButton();
        jLabel4 = new javax.swing.JLabel();
        mPanel10 = new com.hq.swingmaterialdesign.materialdesign.MPanel();
        btnExit3 = new com.hq.swingmaterialdesign.materialdesign.MButton();
        jLabel3 = new javax.swing.JLabel();
        mPanel13 = new com.hq.swingmaterialdesign.materialdesign.MPanel();
        btnExit6 = new com.hq.swingmaterialdesign.materialdesign.MButton();
        jLabel6 = new javax.swing.JLabel();
        mPanel14 = new com.hq.swingmaterialdesign.materialdesign.MPanel();
        btnExit7 = new com.hq.swingmaterialdesign.materialdesign.MButton();
        jLabel7 = new javax.swing.JLabel();
        mPanel15 = new com.hq.swingmaterialdesign.materialdesign.MPanel();
        btnExit8 = new com.hq.swingmaterialdesign.materialdesign.MButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        jPanel4.setBackground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(37, 46, 55));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setForeground(new java.awt.Color(153, 153, 153));
        btnExit.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.CLOSE));
        btnExit.setBorderRadius(0);
        btnExit.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(20f));
        btnExit.setType(com.hq.swingmaterialdesign.materialdesign.MButton.Type.FLAT);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(37, 46, 55));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ACCESS_TIME));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 73, 48));

        txtTime.setBackground(java.awt.Color.white);
        txtTime.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txtTime.setForeground(java.awt.Color.white);
        txtTime.setText("00:00:00");
        jPanel3.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 140, -1));

        txtData.setBackground(java.awt.Color.white);
        txtData.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txtData.setForeground(java.awt.Color.white);
        txtData.setText("00.00.0000");
        jPanel3.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 135, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setLayout(new java.awt.GridLayout(2, 3));

        mPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btnExit1.setBackground(new java.awt.Color(255, 255, 255));
        btnExit1.setBorder(null);
        btnExit1.setForeground(new java.awt.Color(153, 153, 153));
        btnExit1.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.PERSON_ADD));
        btnExit1.setBorderRadius(0);
        btnExit1.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        btnExit1.setType(com.hq.swingmaterialdesign.materialdesign.MButton.Type.FLAT);
        btnExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExit1MouseExited(evt);
            }
        });
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ADICIONAR SECRETÁRIO");

        javax.swing.GroupLayout mPanel6Layout = new javax.swing.GroupLayout(mPanel6);
        mPanel6.setLayout(mPanel6Layout);
        mPanel6Layout.setHorizontalGroup(
            mPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        mPanel6Layout.setVerticalGroup(
            mPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mPanel6Layout.createSequentialGroup()
                .addComponent(btnExit1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.add(mPanel6);

        mPanel11.setBackground(new java.awt.Color(255, 255, 255));

        btnExit4.setBackground(new java.awt.Color(255, 255, 255));
        btnExit4.setBorder(null);
        btnExit4.setForeground(new java.awt.Color(153, 153, 153));
        btnExit4.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.PERSON_ADD));
        btnExit4.setBorderRadius(0);
        btnExit4.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        btnExit4.setType(com.hq.swingmaterialdesign.materialdesign.MButton.Type.FLAT);
        btnExit4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExit4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExit4MouseExited(evt);
            }
        });
        btnExit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit4ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("ADICIONAR ALUNO");

        javax.swing.GroupLayout mPanel11Layout = new javax.swing.GroupLayout(mPanel11);
        mPanel11.setLayout(mPanel11Layout);
        mPanel11Layout.setHorizontalGroup(
            mPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mPanel11Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(54, 54, 54))
        );
        mPanel11Layout.setVerticalGroup(
            mPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mPanel11Layout.createSequentialGroup()
                .addComponent(btnExit4, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel2.add(mPanel11);

        mPanel10.setBackground(new java.awt.Color(255, 255, 255));

        btnExit3.setBackground(new java.awt.Color(255, 255, 255));
        btnExit3.setBorder(null);
        btnExit3.setForeground(new java.awt.Color(153, 153, 153));
        btnExit3.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.DIRECTIONS_RUN));
        btnExit3.setBorderRadius(0);
        btnExit3.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        btnExit3.setType(com.hq.swingmaterialdesign.materialdesign.MButton.Type.FLAT);
        btnExit3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExit3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExit3MouseExited(evt);
            }
        });
        btnExit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit3ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("ADICIONAR TREINADOR");

        javax.swing.GroupLayout mPanel10Layout = new javax.swing.GroupLayout(mPanel10);
        mPanel10.setLayout(mPanel10Layout);
        mPanel10Layout.setHorizontalGroup(
            mPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mPanel10Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(35, 35, 35))
        );
        mPanel10Layout.setVerticalGroup(
            mPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mPanel10Layout.createSequentialGroup()
                .addComponent(btnExit3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel2.add(mPanel10);

        mPanel13.setBackground(new java.awt.Color(255, 255, 255));

        btnExit6.setBackground(new java.awt.Color(255, 255, 255));
        btnExit6.setBorder(null);
        btnExit6.setForeground(new java.awt.Color(153, 153, 153));
        btnExit6.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.PERSON_ADD));
        btnExit6.setBorderRadius(0);
        btnExit6.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        btnExit6.setType(com.hq.swingmaterialdesign.materialdesign.MButton.Type.FLAT);
        btnExit6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExit6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExit6MouseExited(evt);
            }
        });
        btnExit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit6ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("CAIXA");

        javax.swing.GroupLayout mPanel13Layout = new javax.swing.GroupLayout(mPanel13);
        mPanel13.setLayout(mPanel13Layout);
        mPanel13Layout.setHorizontalGroup(
            mPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mPanel13Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel6)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        mPanel13Layout.setVerticalGroup(
            mPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mPanel13Layout.createSequentialGroup()
                .addComponent(btnExit6, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel2.add(mPanel13);

        mPanel14.setBackground(new java.awt.Color(255, 255, 255));

        btnExit7.setBackground(new java.awt.Color(255, 255, 255));
        btnExit7.setBorder(null);
        btnExit7.setForeground(new java.awt.Color(153, 153, 153));
        btnExit7.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.PERSON_ADD));
        btnExit7.setBorderRadius(0);
        btnExit7.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        btnExit7.setType(com.hq.swingmaterialdesign.materialdesign.MButton.Type.FLAT);
        btnExit7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExit7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExit7MouseExited(evt);
            }
        });
        btnExit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit7ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("DESPESAS");

        javax.swing.GroupLayout mPanel14Layout = new javax.swing.GroupLayout(mPanel14);
        mPanel14.setLayout(mPanel14Layout);
        mPanel14Layout.setHorizontalGroup(
            mPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mPanel14Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel7)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        mPanel14Layout.setVerticalGroup(
            mPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mPanel14Layout.createSequentialGroup()
                .addComponent(btnExit7, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel2.add(mPanel14);

        mPanel15.setBackground(new java.awt.Color(255, 255, 255));

        btnExit8.setBackground(new java.awt.Color(255, 255, 255));
        btnExit8.setBorder(null);
        btnExit8.setForeground(new java.awt.Color(153, 153, 153));
        btnExit8.setText(String.valueOf(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ASSESSMENT));
        btnExit8.setBorderRadius(0);
        btnExit8.setFont(com.hq.swingmaterialdesign.materialdesign.resource.MaterialIcons.ICON_FONT.deriveFont(40f));
        btnExit8.setType(com.hq.swingmaterialdesign.materialdesign.MButton.Type.FLAT);
        btnExit8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExit8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExit8MouseExited(evt);
            }
        });
        btnExit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit8ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("BALANÇO");

        javax.swing.GroupLayout mPanel15Layout = new javax.swing.GroupLayout(mPanel15);
        mPanel15.setLayout(mPanel15Layout);
        mPanel15Layout.setHorizontalGroup(
            mPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mPanel15Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(83, 83, 83))
        );
        mPanel15Layout.setVerticalGroup(
            mPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mPanel15Layout.createSequentialGroup()
                .addComponent(btnExit8, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel2.add(mPanel15);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setForeground(new java.awt.Color(50, 60, 69));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setForeground(new java.awt.Color(153, 153, 153));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit1MouseEntered

    private void btnExit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit1MouseExited

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnExit3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit3MouseEntered

    private void btnExit3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit3MouseExited

    private void btnExit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit3ActionPerformed

    private void btnExit4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit4MouseEntered

    private void btnExit4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit4MouseExited

    private void btnExit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit4ActionPerformed

    private void btnExit6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit6MouseEntered

    private void btnExit6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit6MouseExited

    private void btnExit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit6ActionPerformed

    private void btnExit7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit7MouseEntered

    private void btnExit7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit7MouseExited

    private void btnExit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit7ActionPerformed

    private void btnExit8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit8MouseEntered

    private void btnExit8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit8MouseExited

    private void btnExit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit8ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalSecretario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.hq.swingmaterialdesign.materialdesign.MButton btnExit;
    private com.hq.swingmaterialdesign.materialdesign.MButton btnExit1;
    private com.hq.swingmaterialdesign.materialdesign.MButton btnExit3;
    private com.hq.swingmaterialdesign.materialdesign.MButton btnExit4;
    private com.hq.swingmaterialdesign.materialdesign.MButton btnExit6;
    private com.hq.swingmaterialdesign.materialdesign.MButton btnExit7;
    private com.hq.swingmaterialdesign.materialdesign.MButton btnExit8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.hq.swingmaterialdesign.materialdesign.MPanel mPanel10;
    private com.hq.swingmaterialdesign.materialdesign.MPanel mPanel11;
    private com.hq.swingmaterialdesign.materialdesign.MPanel mPanel13;
    private com.hq.swingmaterialdesign.materialdesign.MPanel mPanel14;
    private com.hq.swingmaterialdesign.materialdesign.MPanel mPanel15;
    private com.hq.swingmaterialdesign.materialdesign.MPanel mPanel6;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtTime;
    // End of variables declaration//GEN-END:variables
}