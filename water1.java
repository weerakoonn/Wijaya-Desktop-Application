/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wijaya;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author BS
 */
public class water1 extends javax.swing.JFrame {

    /**
     * Creates new form water1
     */
    public water1() {
        initComponents();
    }

      void backgroundset(JLabel x){
        x.setBackground(new Color (0,0,0));
        
    }
    
    void backgroundreset(JLabel y){
        y.setBackground(new Color (102,102,102));
        
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
        jPanel7 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        add1 = new javax.swing.JLabel();
        delete1 = new javax.swing.JLabel();
        clear1 = new javax.swing.JLabel();
        update1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Water", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField8.setBackground(new java.awt.Color(51, 51, 51));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setBorder(null);
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 170, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("<html><font color = \"white\" >Bill No :</font></html>");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 30));

        jTextField7.setBackground(new java.awt.Color(51, 51, 51));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setBorder(null);
        jPanel7.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 140, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("<html><font color = \"white\" >Bill Account No :</font></html>");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 30));
        jPanel7.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 190, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("<html><font color = \"white\" >Date :</font></html>");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 60, 30));

        jTextField9.setBackground(new java.awt.Color(51, 51, 51));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setBorder(null);
        jPanel7.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 180, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("<html><font color = \"white\" >Amount :</font></html>");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, 30));
        jPanel7.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 180, 10));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 140, 10));
        jPanel7.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 170, 10));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 230));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 160));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 460, 180));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("<html><font color = \"white\" >Bill No :</font></html>");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 70, 30));

        jTextField10.setBackground(new java.awt.Color(51, 51, 51));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setBorder(null);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 140, 30));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add1.setBackground(new java.awt.Color(102, 102, 102));
        add1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add1.setForeground(new java.awt.Color(255, 255, 255));
        add1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add1.setText("ADD");
        add1.setOpaque(true);
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add1MouseExited(evt);
            }
        });
        jPanel6.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        delete1.setBackground(new java.awt.Color(102, 102, 102));
        delete1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delete1.setForeground(new java.awt.Color(255, 255, 255));
        delete1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete1.setText("DELETE");
        delete1.setOpaque(true);
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete1MouseExited(evt);
            }
        });
        jPanel6.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 130, 30));

        clear1.setBackground(new java.awt.Color(102, 102, 102));
        clear1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clear1.setForeground(new java.awt.Color(255, 255, 255));
        clear1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clear1.setText("CLEAR");
        clear1.setOpaque(true);
        clear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clear1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clear1MouseExited(evt);
            }
        });
        jPanel6.add(clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 130, 30));

        update1.setBackground(new java.awt.Color(102, 102, 102));
        update1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        update1.setForeground(new java.awt.Color(255, 255, 255));
        update1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update1.setText("UPDATE");
        update1.setOpaque(true);
        update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                update1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update1MouseExited(evt);
            }
        });
        jPanel6.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 130, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 570, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 140, 10));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 30, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("<html><font color = \"white\" >E. Bill No :</font></html>");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 100, 30));

        jTextField12.setBackground(new java.awt.Color(51, 51, 51));
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setBorder(null);
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 80, 30));
        jPanel1.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 80, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked
        backgroundset(add1);
        backgroundreset(delete1);
        //backgroundreset(table);
        backgroundreset(clear1);
        backgroundreset(update1);
    }//GEN-LAST:event_add1MouseClicked

    private void add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseEntered
        backgroundset(add1);
    }//GEN-LAST:event_add1MouseEntered

    private void add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseExited
        backgroundreset(add1);
    }//GEN-LAST:event_add1MouseExited

    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
        backgroundset(delete1);
        backgroundreset(add1);
        // backgroundreset(table);
        backgroundreset(clear1);
        backgroundreset(update1);
    }//GEN-LAST:event_delete1MouseClicked

    private void delete1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseEntered
        backgroundset(delete1);
    }//GEN-LAST:event_delete1MouseEntered

    private void delete1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseExited
        backgroundreset(delete1);
    }//GEN-LAST:event_delete1MouseExited

    private void clear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear1MouseClicked
        backgroundset(clear1);
        backgroundreset(delete1);
        //backgroundreset(table);
        backgroundreset(add1);
        backgroundreset(update1);
    }//GEN-LAST:event_clear1MouseClicked

    private void clear1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear1MouseEntered
        backgroundset(clear1);

    }//GEN-LAST:event_clear1MouseEntered

    private void clear1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear1MouseExited
        backgroundreset(clear1);
    }//GEN-LAST:event_clear1MouseExited

    private void update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseClicked
        backgroundset(update1);
        backgroundreset(delete1);
        backgroundreset(add1);
        backgroundreset(clear1);
        //backgroundreset(table);
    }//GEN-LAST:event_update1MouseClicked

    private void update1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseEntered
        backgroundset(update1);
    }//GEN-LAST:event_update1MouseEntered

    private void update1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseExited
        backgroundreset(update1);
    }//GEN-LAST:event_update1MouseExited
void enter(JLabel x){
    x.setBackground(new Color (216, 19, 34 ));
}

void exit(JLabel y){
    y.setBackground(new Color (51,51,51));
}
    
    
    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
       enter(jLabel1);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        exit(jLabel1);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        bill b = new bill();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(water1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(water1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(water1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(water1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new water1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add1;
    private javax.swing.JLabel clear1;
    private javax.swing.JLabel delete1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel update1;
    // End of variables declaration//GEN-END:variables
}