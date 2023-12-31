import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ruani
 */
public class livroCadastrado extends javax.swing.JFrame {

    /**
     * Creates new form livroCadastrado
     */
    public livroCadastrado() {
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

        verLivros = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLivros = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verLivros.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruani\\OneDrive\\Documentos\\NetBeansProjects\\Bibliotecaa\\images\\Paomedia-Small-N-Flat-Book.24.png")); // NOI18N
        verLivros.setText("Ver Livros");
        verLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verLivrosActionPerformed(evt);
            }
        });
        getContentPane().add(verLivros, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        tableLivros.setBackground(new java.awt.Color(255, 255, 153));
        tableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "isbn", "titulo", "editora", "preco", "edicao", "genero", "autor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableLivros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 65, 570, 150));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruani\\OneDrive\\Documentos\\NetBeansProjects\\Bibliotecaa\\images\\Hopstarter-Sleek-Xp-Basic-Close-2.24.png")); // NOI18N
        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruani\\OneDrive\\Documentos\\NetBeansProjects\\Bibliotecaa\\images\\desktop-728x410.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verLivrosActionPerformed
        // TODO add your handling code here:
        String sql = ("select * from livro");
        
        try{
            Connection conec = conexaoSql.getCon();
            PreparedStatement rp = conec.prepareStatement(sql);
            ResultSet rpc = rp.executeQuery();
            DefaultTableModel modeloR = (DefaultTableModel) tableLivros.getModel();
            modeloR.setRowCount(0);
            
            while(rpc.next()){
                modeloR.addRow(new String[]{rpc.getString(1), rpc.getString(2), rpc.getString(3), rpc.getString(4), rpc.getString(5), rpc.getString(6), rpc.getString(7)});
                
            }
            
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro de conexão com o BD");
        }
    }//GEN-LAST:event_verLivrosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(livroCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(livroCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(livroCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(livroCadastrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new livroCadastrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLivros;
    private javax.swing.JButton verLivros;
    // End of variables declaration//GEN-END:variables
}
