/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.tela;

import br.com.senac.dao.HibernateUtil;
import br.com.senac.dao.PerfilDao;
import br.com.senac.dao.PerfilDaoImpl;
import br.com.senac.dao.UsuarioDao;
import br.com.senac.dao.UsuarioDaoImpl;
import br.com.senac.entidade.Perfil;
import br.com.senac.entidade.Usuario;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author jonathan.costa1
 */
public class CadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroUsuario
     */
    private UsuarioDao usuarioDao;
    private Session sessao;
    private Usuario usuario;
    private List<Perfil> perfis;

    public CadastroUsuario() {
        initComponents();
        carregarComboPerfil();
    }

    public CadastroUsuario(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        varNome.setText(usuario.getNome());
        varLogin.setText(usuario.getLogin());
        carregarComboPerfil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituto_cadastro = new javax.swing.JLabel();
        label_nome = new javax.swing.JLabel();
        label_login = new javax.swing.JLabel();
        label_perfil = new javax.swing.JLabel();
        varNome = new javax.swing.JTextField();
        varLogin = new javax.swing.JTextField();
        varComboPerfil = new javax.swing.JComboBox<>();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Usuário");

        tituto_cadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituto_cadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituto_cadastro.setText("Cadastro Usuário");
        tituto_cadastro.setToolTipText("");

        label_nome.setText("Nome:");

        label_login.setText("Login:");

        label_perfil.setText("Perfil:");

        varComboPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um perfil..." }));

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituto_cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_perfil)
                            .addComponent(label_nome)
                            .addComponent(label_login))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(varNome)
                            .addComponent(varLogin)
                            .addComponent(varComboPerfil, 0, 389, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituto_cadastro)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome)
                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_login)
                    .addComponent(varLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varComboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_perfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addGap(24, 24, 24))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        usuarioDao = new UsuarioDaoImpl();
        sessao = HibernateUtil.abrirConexao();
        if (validarFormulario()) {
            usuario = new Usuario();
            usuario.setNome(varNome.getText());
            usuario.setLogin(varLogin.getText());
            usuario.setSenha("1234");
            int indice = varComboPerfil.getSelectedIndex();
            indice--;
            usuario.setPerfil(perfis.get(indice));
            usuarioDao.salvarOuAlterar(usuario, sessao);
            dispose();
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
            sessao.close();
        }
    }//GEN-LAST:event_btSalvarActionPerformed
    private void carregarComboPerfil() {
        PerfilDao perfilDao = new PerfilDaoImpl();
        try {
            sessao = HibernateUtil.abrirConexao();
            perfis = perfilDao.pesquisarTodos(sessao);
            perfis.forEach(perfil -> {
                varComboPerfil.addItem(perfil.getNome());
            });
        } catch (HibernateException e) {
            System.out.println("erro ao pesquisar todos perfis" + e.getMessage());
        } finally {
            sessao.close();
        }
    }

    private boolean validarFormulario() {
        String nome = varNome.getText().trim();
        if (validarCampoMenor3Caracter(nome)) {
            JOptionPane.showMessageDialog(null, "Preencha o nome corretamente!");
            return false;
        }
        String login = varLogin.getText().trim();
        if (validarCampoMenor3Caracter(login)) {
            JOptionPane.showMessageDialog(null, "Preencha o login corretamente!");
            return false;
        }
        int indice = varComboPerfil.getSelectedIndex();
        if (indice == 0) {
            JOptionPane.showMessageDialog(null, "Escolha um perfil!");
            return false;
        }
        return true; //retornar falso apenas explicação
    }

    private boolean validarCampoMenor3Caracter(String campo) {
        return campo.length() < 3;
    }

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        btCancelar.addActionListener((ActionEvent e) -> {
            varLogin.setText("");
            varNome.setText("");
        });
    }//GEN-LAST:event_btCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_login;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_perfil;
    private javax.swing.JLabel tituto_cadastro;
    private javax.swing.JComboBox<String> varComboPerfil;
    private javax.swing.JTextField varLogin;
    private javax.swing.JTextField varNome;
    // End of variables declaration//GEN-END:variables

}
