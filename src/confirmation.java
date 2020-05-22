import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import static javafx.scene.control.Alert.AlertType.CONFIRMATION;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Smiket
 */
public class confirmation extends javax.swing.JFrame {
 Connection conn=null;
 Connection cot=null;
    PreparedStatement st=null;
    PreparedStatement str=null;

    /**
     * Creates new form CONFIRMATION
     */
    public confirmation() {
        initComponents();
        details.setText("ETA is "+Book1.AcTime+" mins Estimated Fare:"+Book1.etfare+"");
        confirmationpanel.setBackground(new Color(0,0,0,240));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmationpanel = new javax.swing.JPanel();
        confirm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        details = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(978, 649));
        setUndecorated(true);
        getContentPane().setLayout(null);

        confirmationpanel.setBackground(new java.awt.Color(0, 0, 0));

        confirm.setBackground(new java.awt.Color(0, 0, 0));
        confirm.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        confirm.setForeground(new java.awt.Color(32, 111, 230));
        confirm.setText("Confirm Booking");
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        confirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(224, 28, 7));
        jButton1.setText("Cancel");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        details.setBackground(new java.awt.Color(0, 0, 0));
        details.setFont(new java.awt.Font("Impact", 2, 22)); // NOI18N
        details.setForeground(new java.awt.Color(240, 240, 240));
        details.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        details.setText("jLabel1");

        javax.swing.GroupLayout confirmationpanelLayout = new javax.swing.GroupLayout(confirmationpanel);
        confirmationpanel.setLayout(confirmationpanelLayout);
        confirmationpanelLayout.setHorizontalGroup(
            confirmationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmationpanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(confirm)
                .addGap(18, 18, 18))
            .addComponent(details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        confirmationpanelLayout.setVerticalGroup(
            confirmationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmationpanelLayout.createSequentialGroup()
                .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(confirmationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(jButton1))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(confirmationpanel);
        confirmationpanel.setBounds(280, 150, 330, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Webp.net-resizeimage (2).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMinimumSize(new java.awt.Dimension(978, 609));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 990, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
      String u ="0";
        try{  
           
            String query = "SELECT `WalBal` FROM `user_info` WHERE Username =?";
        cot = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_data","root","");
            str = cot.prepareStatement(query);
            str.setString(1, Login.y);
            ResultSet ree= str.executeQuery();
            while(ree.next()){
                u = ree.getString("WalBal");
                
            }
                    }catch(SQLException ec){
                   
                    JOptionPane.showMessageDialog(null,"Et44r");
                    }
//         JOptionPane.showMessageDialog(null,u);
        int i = Integer.parseInt(u);
        int f=Book1.fare;
        System.out.print(f+">>"+i);
        int o=i-f;
        
        if(f>i||i<300)
        {
            JOptionPane.showMessageDialog(null,"Insufficient Amount");
            this.dispose();
            new Proifile1().setVisible(true);
        }
        else
        {
            String d=Integer.toString(o);
        try{
                String n=Login.y;
                  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_data","root","");
                  String query="UPDATE `user_info` SET `WalBal`=? WHERE Username=?";
                st = conn.prepareStatement(query);
                
                st.setString(1,Integer.toString(o));
                st.setString(2,n);
                 st.execute();
                 JOptionPane.showMessageDialog(null,"Cab Booked");
                   this.dispose();
        Current_Booking cb=new Current_Booking();
        cb.setVisible(true);
        cb.pack();
        cb.setLocationRelativeTo(null);
         }
         catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(null,"Error");
         }
      
        }
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/driver_data","root","");
                  String query="UPDATE `driver_info` SET Available ='0' WHERE Name =?"; 
                st = conn.prepareStatement(query);
                st.setString(1, Book1.namedriver);
                st.executeUpdate();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Err88or");
        }
        
    }//GEN-LAST:event_confirmMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
        new Proifile1().setVisible(true);     
    }//GEN-LAST:event_jButton1MouseClicked

    private void confirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER) 
    {
         String u ="0";
        try{  
           
            String query = "SELECT `WalBal` FROM `user_info` WHERE Username =?";
        cot = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_data","root","");
            str = cot.prepareStatement(query);
           
            str.setString(1, Login.y);
            ResultSet ree= str.executeQuery();
            while(ree.next()){
                u = ree.getString("WalBal");
                
            }
               
                    }catch(Exception ec){
                   
                    JOptionPane.showMessageDialog(null,"Et44r");
                    }
        System.out.println(u);
        int i = Integer.parseInt(u);
        int f=Book1.fare;
        System.out.print(f+">>"+i);
        int o=i-f;
        
        if(i<f||i<300)
        {
            JOptionPane.showMessageDialog(null,"Insufficient Amount");
        }
        else
        {
            String d=Integer.toString(o);
        try{
                String n=Login.y;
                  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_data","root","");
                  String query="UPDATE `user_info` SET `WalBal`=? WHERE Username=?";
                st = conn.prepareStatement(query);
                
                st.setString(1,Integer.toString(o));
                st.setString(2,n);
                 st.execute();
                 JOptionPane.showMessageDialog(null,"Cab Booked");
                   this.dispose();
        Current_Booking cb=new Current_Booking();
        cb.setVisible(true);
        cb.pack();
        cb.setLocationRelativeTo(null);
         }
         catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(null,"Error");
         }
        }
    }// TODO add your handling code here:
    }//GEN-LAST:event_confirmKeyPressed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmActionPerformed

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
            java.util.logging.Logger.getLogger(CONFIRMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CONFIRMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CONFIRMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CONFIRMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new confirmation().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JPanel confirmationpanel;
    private javax.swing.JLabel details;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private static class CONFIRMATION {

        public CONFIRMATION() {
        }
    }
}