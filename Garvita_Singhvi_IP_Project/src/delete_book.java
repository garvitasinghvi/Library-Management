import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w7
 */
public class delete_book extends javax.swing.JFrame {

    /**
     * Creates new form delete_book
     */
    public delete_book() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        r1 = new javax.swing.JRadioButton();
        l2 = new javax.swing.JLabel();
        r2 = new javax.swing.JRadioButton();
        t2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DELETE A BOOK");

        jButton2.setFont(new java.awt.Font("Showcard Gothic", 2, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 204));
        jButton2.setText("delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 2, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 204));
        jButton1.setText("fetch the record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Showcard Gothic", 2, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 204));
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Showcard Gothic", 2, 20)); // NOI18N
        l1.setForeground(new java.awt.Color(204, 0, 51));
        l1.setText("book's  ID");
        l1.setEnabled(false);

        jButton3.setFont(new java.awt.Font("Showcard Gothic", 2, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 204));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        t1.setFont(new java.awt.Font("Showcard Gothic", 0, 20)); // NOI18N
        t1.setEnabled(false);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("  delete a book ");

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 2, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("book's type");

        t3.setFont(new java.awt.Font("Showcard Gothic", 0, 20)); // NOI18N

        t4.setFont(new java.awt.Font("Showcard Gothic", 0, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 2, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("author's id");

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 2, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("book's price");

        t5.setFont(new java.awt.Font("Showcard Gothic", 0, 20)); // NOI18N

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Showcard Gothic", 2, 20)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 102, 0));
        r1.setText("enter book's id");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        l2.setFont(new java.awt.Font("Showcard Gothic", 2, 20)); // NOI18N
        l2.setForeground(new java.awt.Color(204, 0, 51));
        l2.setText("book's title");
        l2.setEnabled(false);

        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Showcard Gothic", 2, 20)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 102, 0));
        r2.setText("enter book's title");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Showcard Gothic", 0, 20)); // NOI18N
        t2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(t1))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(41, 41, 41)
                                .addComponent(jButton3)
                                .addGap(40, 40, 40)
                                .addComponent(jButton4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1)
                    .addComponent(r1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2)
                    .addComponent(r2)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "Do you really want to Delete The Record?");
        if (res == JOptionPane.YES_OPTION) {
            try {

                Class.forName("java.sql.DriverManager");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "gorgeous");

                String a, sql;

                a = t1.getText();

                sql = "delete from book where bid=" + a;

                Statement st = con.createStatement();

                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Record Deleted..!!!!");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
t5.setText("");
r1.setSelected(false);
r2.setSelected(false);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());



            }t2.setEnabled(false); t1.setEnabled(false);r1.setSelected(false);r2.setSelected(false);
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a = t1.getText(),b=t2.getText();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "gorgeous");
            Statement st = con.createStatement();
            String sql = null;
            if(!a.equals(""))
            {sql="select * from book where bid=" + a;t2.setVisible(true);t2.setEnabled(true);l2.setVisible(true);l2.setEnabled(true);} 
            else{sql="select * from book where btitle='"+b+"'" ;t1.setVisible(true);t1.setEnabled(true);l1.setVisible(true);l1.setEnabled(true);}
            st.executeQuery(sql);
            ResultSet rs = st.executeQuery(sql);
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No Such Record..!!!!");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
t5.setText("");
r1.setSelected(false);
r2.setSelected(false);
l1.setEnabled(false);
t1.setEnabled(false);
l2.setEnabled(false);
t2.setEnabled(false);
            } else {t1.setText(rs.getString("bid"));
                t2.setText(rs.getString("btitle"));
                t3.setText(rs.getString("btype"));
                t4.setText(rs.getString("aid"));
                t5.setText(rs.getString("price"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        } 
        // TODO add your handling code here:


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        t1.setText(""); 
        t2.setText("");
        t3.setText("");
                t4.setText("");
         t5.setText("");
r1.setSelected(false);
r2.setSelected(false);
l1.setEnabled(false);
t1.setEnabled(false);
l2.setEnabled(false);
t2.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
if(r2.isSelected()==true)
{l2.setVisible(true);
t2.setVisible(true);
l1.setVisible(false);
t1.setVisible(false);
l2.setEnabled(true);
t2.setEnabled(true); 
}t2.setText("");   // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
if(r1.isSelected()==true)
{l1.setVisible(true);
t1.setVisible(true);
l2.setVisible(false);
t2.setVisible(false);
l1.setEnabled(true);
t1.setEnabled(true);
}t1.setText("");
    // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(delete_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new delete_book().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}