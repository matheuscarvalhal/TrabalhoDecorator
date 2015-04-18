/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.ads.gui;

import br.ba.senai.ads.asw.Fabrica;
import br.ba.senai.ads.asw.FabricaSorvete;
import br.ba.senai.ads.asw.GranuladoDecorator;
import br.ba.senai.ads.asw.MMDecorator;
import br.ba.senai.ads.asw.MelDecorator;
import br.ba.senai.ads.asw.Sorvete;
import br.ba.senai.ads.asw.SorveteDecorator;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Tela extends javax.swing.JFrame {

    private final Fabrica fs = new FabricaSorvete();
    private Sorvete sorvete;

    /**
     * Creates new form Tela2
     */
    public Tela() {
        initComponents();
        sorvete = fs.criarSorvete("sundae");
        tfTotal.setText(String.valueOf(sorvete.valor()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSorvetes = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        pSorvete = new javax.swing.JPanel();
        lbTipoSorvete = new javax.swing.JLabel();
        rbSundae = new javax.swing.JRadioButton();
        rbCasquinha = new javax.swing.JRadioButton();
        rbTradicional = new javax.swing.JRadioButton();
        pAdicional = new javax.swing.JPanel();
        lbTipoAdicional = new javax.swing.JLabel();
        cbGranulado = new javax.swing.JCheckBox();
        cbMel = new javax.swing.JCheckBox();
        cbMM = new javax.swing.JCheckBox();
        pTotal = new javax.swing.JPanel();
        lbReais = new javax.swing.JLabel();
        btOK = new javax.swing.JButton();
        tfTotal = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pSorvete.setBackground(new java.awt.Color(102, 153, 255));
        pSorvete.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sorvete", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        lbTipoSorvete.setText("Tipo:");

        rbSundae.setBackground(new java.awt.Color(102, 153, 255));
        bgSorvetes.add(rbSundae);
        rbSundae.setSelected(true);
        rbSundae.setText("Sundae");
        rbSundae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarValorSundae(evt);
            }
        });

        rbCasquinha.setBackground(new java.awt.Color(102, 153, 255));
        bgSorvetes.add(rbCasquinha);
        rbCasquinha.setText("Casquinha");
        rbCasquinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarValorCasquinha(evt);
            }
        });

        rbTradicional.setBackground(new java.awt.Color(102, 153, 255));
        bgSorvetes.add(rbTradicional);
        rbTradicional.setText("Tradicional");
        rbTradicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarValorTradicional(evt);
            }
        });

        javax.swing.GroupLayout pSorveteLayout = new javax.swing.GroupLayout(pSorvete);
        pSorvete.setLayout(pSorveteLayout);
        pSorveteLayout.setHorizontalGroup(
            pSorveteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSorveteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTipoSorvete)
                .addGap(36, 36, 36)
                .addGroup(pSorveteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbTradicional)
                    .addComponent(rbSundae)
                    .addComponent(rbCasquinha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pSorveteLayout.setVerticalGroup(
            pSorveteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSorveteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSorveteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoSorvete)
                    .addComponent(rbSundae))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCasquinha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTradicional)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pAdicional.setBackground(new java.awt.Color(102, 153, 255));
        pAdicional.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicional", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        lbTipoAdicional.setText("Tipo:");

        cbGranulado.setBackground(new java.awt.Color(102, 153, 255));
        cbGranulado.setText("Granulado");
        cbGranulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarValorGranulado(evt);
            }
        });

        cbMel.setBackground(new java.awt.Color(102, 153, 255));
        cbMel.setText("Mel");
        cbMel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarValorMel(evt);
            }
        });

        cbMM.setBackground(new java.awt.Color(102, 153, 255));
        cbMM.setText("M&M");
        cbMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarValorMM(evt);
            }
        });

        javax.swing.GroupLayout pAdicionalLayout = new javax.swing.GroupLayout(pAdicional);
        pAdicional.setLayout(pAdicionalLayout);
        pAdicionalLayout.setHorizontalGroup(
            pAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdicionalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTipoAdicional)
                .addGap(37, 37, 37)
                .addGroup(pAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMel)
                    .addComponent(cbGranulado)
                    .addComponent(cbMM))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        pAdicionalLayout.setVerticalGroup(
            pAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdicionalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAdicionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoAdicional)
                    .addComponent(cbGranulado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMM)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pTotal.setBackground(new java.awt.Color(102, 153, 255));
        pTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        lbReais.setText("R$:");

        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarResultado(evt);
            }
        });

        javax.swing.GroupLayout pTotalLayout = new javax.swing.GroupLayout(pTotal);
        pTotal.setLayout(pTotalLayout);
        pTotalLayout.setHorizontalGroup(
            pTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbReais)
                .addGap(18, 18, 18)
                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btOK)
                .addContainerGap())
        );
        pTotalLayout.setVerticalGroup(
            pTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbReais)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pAdicional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pSorvete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pSorvete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alterarValorSundae(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarValorSundae
        // TODO add your handling code here:
        this.sorvete = fs.criarSorvete("sundae");
        tfTotal.setText(String.valueOf(sorvete.valor()));
    }//GEN-LAST:event_alterarValorSundae

    private void alterarValorCasquinha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarValorCasquinha
        // TODO add your handling code here:
        this.sorvete = fs.criarSorvete("casquinha");
        tfTotal.setText(String.valueOf(sorvete.valor()));
    }//GEN-LAST:event_alterarValorCasquinha

    private void alterarValorTradicional(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarValorTradicional
        // TODO add your handling code here:
        this.sorvete = fs.criarSorvete("tradicional");
        tfTotal.setText(String.valueOf(sorvete.valor()));
    }//GEN-LAST:event_alterarValorTradicional

    private void alterarValorGranulado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarValorGranulado
        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;
        if (this.cbGranulado.isSelected() || this.cbMel.isSelected() || this.cbMM.isSelected()) {
            if (this.cbGranulado.isSelected()) {
                SorveteDecorator granulado = new GranuladoDecorator(this.sorvete);
                valor1 = granulado.getValor();
            }
            if (this.cbMel.isSelected()) {
                SorveteDecorator mel = new MelDecorator(this.sorvete);
                valor2 = mel.getValor();
            }
            if (this.cbMM.isSelected()) {
                SorveteDecorator mm = new MMDecorator(this.sorvete);
                valor3 = mm.getValor();
            }
            tfTotal.setText(String.valueOf(this.sorvete.valor() + valor1 + valor2 + valor3));
        } else {
            tfTotal.setText(String.valueOf(this.sorvete.valor()));
        }
    }//GEN-LAST:event_alterarValorGranulado

    private void alterarValorMel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarValorMel
        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;
        if (this.cbGranulado.isSelected() || this.cbMel.isSelected() || this.cbMM.isSelected()) {
            if (this.cbGranulado.isSelected()) {
                SorveteDecorator granulado = new GranuladoDecorator(this.sorvete);
                valor1 = granulado.getValor();
            }
            if (this.cbMel.isSelected()) {
                SorveteDecorator mel = new MelDecorator(this.sorvete);
                valor2 = mel.getValor();
            }
            if (this.cbMM.isSelected()) {
                SorveteDecorator mm = new MMDecorator(this.sorvete);
                valor3 = mm.getValor();
            }
            tfTotal.setText(String.valueOf(this.sorvete.valor() + valor1 + valor2 + valor3));
        } else {
            tfTotal.setText(String.valueOf(this.sorvete.valor()));
        }

    }//GEN-LAST:event_alterarValorMel

    private void alterarValorMM(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarValorMM
        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;
        if (this.cbGranulado.isSelected() || this.cbMel.isSelected() || this.cbMM.isSelected()) {
            if (this.cbGranulado.isSelected()) {
                SorveteDecorator granulado = new GranuladoDecorator(this.sorvete);
                valor1 = granulado.getValor();
            }
            if (this.cbMel.isSelected()) {
                SorveteDecorator mel = new MelDecorator(this.sorvete);
                valor2 = mel.getValor();
            }
            if (this.cbMM.isSelected()) {
                SorveteDecorator mm = new MMDecorator(this.sorvete);
                valor3 = mm.getValor();
            }
            tfTotal.setText(String.valueOf(this.sorvete.valor() + valor1 + valor2 + valor3));
        } else {
            tfTotal.setText(String.valueOf(this.sorvete.valor()));
        }
    }//GEN-LAST:event_alterarValorMM

    private void mostrarResultado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarResultado
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Total:" + tfTotal.getText());
    }//GEN-LAST:event_mostrarResultado

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSorvetes;
    private javax.swing.JButton btOK;
    private javax.swing.JCheckBox cbGranulado;
    private javax.swing.JCheckBox cbMM;
    private javax.swing.JCheckBox cbMel;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbReais;
    private javax.swing.JLabel lbTipoAdicional;
    private javax.swing.JLabel lbTipoSorvete;
    private javax.swing.JPanel pAdicional;
    private javax.swing.JPanel pSorvete;
    private javax.swing.JPanel pTotal;
    private javax.swing.JRadioButton rbCasquinha;
    private javax.swing.JRadioButton rbSundae;
    private javax.swing.JRadioButton rbTradicional;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
