/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wijaya;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author salit
 */
public class m_Repair_and_replacement extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public m_Repair_and_replacement() {
        initComponents();
        
        lastId();
        
        { //making panel transparent
        jPanel1.setBackground(new Color(0,0,0,50));
        
        jPanel3.setBackground(new Color(0,0,0,50));
        
        }
        
        
        {
            //implementing date and time methods
            showDate();
           // showTime();
          
        }
        
        
    }
    
    
    
    void lastId(){
    
     try {
            ResultSet rs = DB.getData("SELECT CID FROM customers ORDER BY CID DESC LIMIT 1");
            
            while (rs.next()){
                jLabel18.setText(rs.getString("CID"));
                System.out.println(rs.getString("CID")); 
               
              
                
                
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
    }
    
    
    
    
    }
    
    
    
    
    
    
    // date and time
    void showDate(){
        Date d =new Date();
        System.out.println(d);
        SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd");
        String date = adf.format(d);
        jLabel3.setText(date);
        
        
    }
    
    void showTime(){
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            
              Date d = new Date();
              SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
              String time = sdf.format(d);
             // jLabel4.setText(time);
            }
        }).start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1184, 666));
        setResizable(false);
        setSize(new java.awt.Dimension(1184, 666));
        getContentPane().setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(180, 280, 160, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(740, 170, 110, 10);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Repair History");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(750, 150, 100, 15);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(180, 370, 160, 96);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customers/icons8_Back_50px.png"))); // NOI18N
        jLabel23.setText("Back");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel23);
        jLabel23.setBounds(80, 110, 100, 50);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(270, 180, 110, 14);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setText("Last Repair ID -");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(180, 180, 110, 14);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customers/icons8_Photo_Gallery_25px.png"))); // NOI18N
        jButton5.setText("View All");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(900, 230, 100, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customers/icons8_Search_25px.png"))); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(790, 230, 100, 30);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(610, 230, 160, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("MID/Name/Vendor");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(470, 240, 130, 14);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "RID", "MID", "Type", "Quantity", "Description", "Cost", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(430, 270, 690, 170);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customers/icons8_Delete_25px.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 590, 93, 33);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customers/icons8_Update_User_25px.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 590, 100, 33);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customers/icons8_Add_User_Male_25px.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 590, 80, 33);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(180, 500, 160, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(180, 330, 160, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(180, 240, 160, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setMaximumSize(new java.awt.Dimension(65, 20));
        jTextField1.setMinimumSize(new java.awt.Dimension(65, 20));
        jTextField1.setPreferredSize(new java.awt.Dimension(65, 20));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 200, 160, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Cost");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 510, 90, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Description");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 380, 90, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Quantity");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 340, 90, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Type");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 290, 90, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("MID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 250, 90, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("REID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 210, 90, 15);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/icons8_Home_48px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 110, 50, 40);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3);
        jPanel3.setBounds(410, 210, 750, 260);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 120, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panel_ico/logo1.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panel_ico/icons8_User_75px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 70, 60));

        jLabel20.setText("USERNAME");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 60, -1, -1));

        jLabel21.setText("LogOut");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 80, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1180, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back/back.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1180, 660);

        jButton6.setText("Clean");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1020, 340, 70, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        this.dispose();
        new Home().setVisible(true);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       
          lastId();
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        
        
        try {

            DB.setData("delete from customers where cid = '"+jTextField1.getText()+"'");

//            JOptionPane.showMessageDialog(this, "Customer "+jTextField2.getText()+" "+jTextField3.getText()+" Deleted Successfully");

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        
        
        
        //clearing textfields after
          jTextField1.setText("");      
          jTextField2.setText("");    
          
        
          lastId();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        
        
        
         DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = DB.getData("select* from customers where CID='"+jTextField10.getText()+"' or nic='"+jTextField10.getText()+"' or f_name='"+jTextField10.getText()+"'or l_name='"+jTextField10.getText()+"'or tel='"+jTextField10.getText()+"'");
           
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("CID"));
                v.add(rs.getString("f_name"));
                v.add(rs.getString("l_name"));
                v.add(rs.getString("address_1"));
                v.add(rs.getString("address_2"));
                v.add(rs.getString("city"));
                v.add(rs.getString("tel"));
                v.add(rs.getString("dob"));
                v.add(rs.getString("nic"));
                
                if(rs.getInt("loyalty")==1){
                
                    v.add("Yes");
                
                }else{
                v.add("NO");
                }
                
                

                dtm.addRow(v);
                
                System.out.println("inside while");

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println("finished");
        
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = DB.getData("select* from customers");
           
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("CID"));
                v.add(rs.getString("f_name"));
                v.add(rs.getString("l_name"));
                v.add(rs.getString("address_1"));
                v.add(rs.getString("address_2"));
                v.add(rs.getString("city"));
                v.add(rs.getString("tel"));
                v.add(rs.getString("dob"));
                v.add(rs.getString("nic"));
                if(rs.getInt("loyalty")==1){
                
                    v.add("Yes");
                
                }else{
                v.add("NO");
                }
                

                dtm.addRow(v);
                
                

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        while(dtm.getRowCount() > 0)
        {
            dtm.removeRow(0);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        int row = this.jTable1.getSelectedRow();
        this.jTextField1.setText(dtm.getValueAt(row, 0).toString());
        this.jTextField2.setText(dtm.getValueAt(row, 1).toString());
//        this.jTextField3.setText(dtm.getValueAt(row, 2).toString());
        this.jTextField4.setText(dtm.getValueAt(row, 3).toString());
    //    this.jTextField5.setText(dtm.getValueAt(row, 4).toString());
        this.jTextField6.setText(dtm.getValueAt(row, 5).toString());
    //    this.jTextField7.setText(dtm.getValueAt(row, 6).toString());
    //    ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(dtm.getValueAt(row, 7).toString());
      //  this.jTextField9.setText(dtm.getValueAt(row, 6).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        String cid,f_name,l_name,ad1,ad2,city,dob,nic;
        int tel;
        
        cid = jTextField1.getText();
        f_name = jTextField2.getText();
//        l_name = jTextField3.getText();
        ad1 = jTextField4.getText();
     //   ad2 = jTextField5.getText();
        city = jTextField6.getText();
    //    tel = Integer.parseInt(jTextField7.getText());
       // dob = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
//        nic = jTextField9.getText();
        
        int loyalty =0;
        
        
        try {

//            DB.setData("update customers set f_name='"+f_name+"', l_name='"+l_name+"',address_1='"+ad1+"', address_2='"+ad2+"', city='"+city+"', tel='"+tel+"', dob='"+dob+"', nic='"+nic+"' where CID='"+cid+"'");
           //  DB.setData("update rec_customers set f_name='"+f_name+"', l_name='"+l_name+"',address_1='"+ad1+"', address_2='"+ad2+"', city='"+city+"', tel='"+tel+"', dob='"+dob+"', nic='"+nic+"' where CID='"+cid+"'");
            
//             JOptionPane.showMessageDialog(this, "Customer  "+f_name+" "+l_name+"  updated Successfully");

        } catch (Exception ex) {
            ex.printStackTrace();

        }
                
        //clearing textfields after
          jTextField1.setText("");      
          jTextField2.setText("");    
//          jTextField3.setText("");    
          jTextField4.setText("");    
//          jTextField5.setText("");    
          jTextField6.setText("");    
       //   jTextField7.setText("");    
//          ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");    
      //    jTextField9.setText("");    
        
          
          //
          lastId();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
//        jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
//        jTextField5.requestFocus();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       // jTextField7.requestFocus();
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        this.dispose();
        new Machine().setVisible(true);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}