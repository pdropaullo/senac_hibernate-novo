/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.tela;

import br.com.senac.entidade.Usuario;

/**
 *
 * @author jonathan.costa1
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private Usuario usuario;
    
    public TelaPrincipal(Usuario usuario) {
       initComponents();       
       this.usuario = usuario;
       varUsuarioLogado.setText("Olá " + usuario.getNome());  
    }
    
    public TelaPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        scrollbar1 = new java.awt.Scrollbar();
        varUsuarioLogado = new javax.swing.JLabel();
        icone_cad_usuario = new javax.swing.JLabel();
        icone_pesq_usuario = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menu_cadastro = new javax.swing.JMenu();
        item_cad_usuario = new javax.swing.JMenuItem();
        item_cad_perfil = new javax.swing.JMenuItem();
        menu_pesquisa = new javax.swing.JMenu();
        item_pesq_usuario = new javax.swing.JMenuItem();
        item_pesq_perfil = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela inicial");

        icone_cad_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cad_usuario.png"))); // NOI18N
        icone_cad_usuario.setToolTipText("Cadastro Usuario");
        icone_cad_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icone_cad_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icone_cad_usuarioMouseClicked(evt);
            }
        });

        icone_pesq_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/pesq_usuario.png"))); // NOI18N
        icone_pesq_usuario.setToolTipText("Pesquisa Usuario");
        icone_pesq_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icone_pesq_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icone_pesq_usuarioMouseClicked(evt);
            }
        });

        menu_cadastro.setText("Cadastro");

        item_cad_usuario.setText("Usuario");
        item_cad_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_cad_usuarioMousePressed(evt);
            }
        });
        item_cad_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cad_usuarioActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_cad_usuario);

        item_cad_perfil.setText("Perfil");
        item_cad_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cad_perfilActionPerformed(evt);
            }
        });
        menu_cadastro.add(item_cad_perfil);

        jMenuBar2.add(menu_cadastro);

        menu_pesquisa.setText("Pesquisa");

        item_pesq_usuario.setText("Usuario");
        item_pesq_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_pesq_usuarioMousePressed(evt);
            }
        });
        menu_pesquisa.add(item_pesq_usuario);

        item_pesq_perfil.setText("Perfil");
        menu_pesquisa.add(item_pesq_perfil);

        jMenuBar2.add(menu_pesquisa);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(513, Short.MAX_VALUE)
                        .addComponent(varUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(icone_pesq_usuario)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(icone_cad_usuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(varUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(icone_cad_usuario)
                .addGap(49, 49, 49)
                .addComponent(icone_pesq_usuario)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void item_cad_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cad_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_cad_usuarioActionPerformed

    private void item_cad_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cad_perfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_cad_perfilActionPerformed

    private void icone_cad_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_cad_usuarioMouseClicked
        new CadastroUsuario().setVisible(true);
    }//GEN-LAST:event_icone_cad_usuarioMouseClicked

    private void icone_pesq_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_pesq_usuarioMouseClicked
        new PesquisaUsuario().setVisible(true);
    }//GEN-LAST:event_icone_pesq_usuarioMouseClicked

    private void item_pesq_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_pesq_usuarioMousePressed
        new PesquisaUsuario().setVisible(true);
    }//GEN-LAST:event_item_pesq_usuarioMousePressed

    private void item_cad_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_cad_usuarioMousePressed
        new PesquisaUsuario().setVisible(true);
    }//GEN-LAST:event_item_cad_usuarioMousePressed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icone_cad_usuario;
    private javax.swing.JLabel icone_pesq_usuario;
    private javax.swing.JMenuItem item_cad_perfil;
    private javax.swing.JMenuItem item_cad_usuario;
    private javax.swing.JMenuItem item_pesq_perfil;
    private javax.swing.JMenuItem item_pesq_usuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menu_cadastro;
    private javax.swing.JMenu menu_pesquisa;
    private java.awt.Scrollbar scrollbar1;
    private javax.swing.JLabel varUsuarioLogado;
    // End of variables declaration//GEN-END:variables
}
