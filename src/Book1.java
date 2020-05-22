
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import static java.lang.Math.abs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smiket
 */
public class Book1 extends javax.swing.JFrame {
 Connection conn=null;
    PreparedStatement st=null;
    static String pp ="";
    static String dp="";
    static String namedriver;
    static String time;
    static int fare;
    static String etfare;
    static int c;
    static String AcTime;
    static String mob;
    static String rot;
    static String vid;
    int avcon=0;
     int dxn1 = 0;
     int a =0;
     static Thread thread=new Thread();
    
    /**
     * Creates new form Book1
     */
    public Book1() {
        initComponents();
        this.setLocationRelativeTo(null);
   book.setBackground(new Color(0,0,0,240));
 
    }

        public void close(){
 
 WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
 Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
 
 }
           public  void Updater(String user){
        
         String query="UPDATE `user_info` SET `loggedin`='0' WHERE Username=?";
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_data", "root","");
             st=conn.prepareStatement(query);
             st.setString(1,user);
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Updater Not Working");
        }
           }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        book = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Cancel_booking = new javax.swing.JButton();
        Bool_cab = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pickuplist = new javax.swing.JComboBox<>();
        Droplist = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(978, 649));
        setUndecorated(true);
        getContentPane().setLayout(null);

        book.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(237, 240, 239));
        jLabel6.setText("Enter Pick-up Point:");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(237, 240, 239));
        jLabel7.setText("Enter Drop-off Point:");

        Cancel_booking.setBackground(new java.awt.Color(0, 0, 0));
        Cancel_booking.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Cancel_booking.setForeground(new java.awt.Color(242, 0, 0));
        Cancel_booking.setText("Cancel");
        Cancel_booking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cancel_bookingMouseClicked(evt);
            }
        });

        Bool_cab.setBackground(new java.awt.Color(0, 0, 0));
        Bool_cab.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Bool_cab.setForeground(new java.awt.Color(32, 111, 230));
        Bool_cab.setText("Book");
        Bool_cab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bool_cabMouseClicked(evt);
            }
        });
        Bool_cab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bool_cabActionPerformed(evt);
            }
        });
        Bool_cab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Bool_cabKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Book a Cab");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(224, 87, 7));
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(166, 162, 162));
        jLabel13.setText("-");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        pickuplist.setBackground(new java.awt.Color(0, 0, 0));
        pickuplist.setForeground(new java.awt.Color(7, 235, 144));
        pickuplist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Pickup Point", "Secunderabad", "Kukatpally", "Gachibowli", "BPHC", "Alwal", "Banjara Hills", "Zoological Park", "Miyapur", "HITEC City", "Airport" }));
        pickuplist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickuplistActionPerformed(evt);
            }
        });

        Droplist.setBackground(new java.awt.Color(0, 0, 0));
        Droplist.setForeground(new java.awt.Color(242, 0, 0));
        Droplist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Drop-off Point", "Secunderabad", "Kukatpally", "Gachibowli", "BPHC", "Alwal", "Banjara Hills", "Zoological Park", "Miyapur", "HITEC City", "Airport" }));
        Droplist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DroplistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookLayout = new javax.swing.GroupLayout(book);
        book.setLayout(bookLayout);
        bookLayout.setHorizontalGroup(
            bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookLayout.createSequentialGroup()
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pickuplist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Droplist, 0, 146, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookLayout.createSequentialGroup()
                        .addComponent(Cancel_booking)
                        .addGap(63, 63, 63)
                        .addComponent(Bool_cab, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel12)
                .addGap(128, 128, 128))
        );
        bookLayout.setVerticalGroup(
            bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookLayout.createSequentialGroup()
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(34, 34, 34)
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pickuplist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Droplist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bool_cab, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        getContentPane().add(book);
        book.setBounds(250, 140, 440, 290);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Webp.net-resizeimage (2).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1080, 653);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cancel_bookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_bookingMouseClicked
        this.hide();
        new Proifile1().setVisible(true);
       
        
    }//GEN-LAST:event_Cancel_bookingMouseClicked

    private void Bool_cabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bool_cabMouseClicked
        int key=0;
        if(pp.equals("Select Pickup Point")||pp.equals(""))
        {
            key++;
            JOptionPane.showMessageDialog(null,"Please Select Pick-up Point");
        }
        else if(dp.equals("Select Drop-off Point")||dp.equals(""))
        {
            key++;
            JOptionPane.showMessageDialog(null,"Please Select Drop-off Point");
        }
        else if(pp.equals(dp))
        {
            key++;
            JOptionPane.showMessageDialog(null,"Select different Drop Location");
        }
        else if(key==0)
        {
            String d1 = null;
             dxn1 = 0;
            try{
            String query="SELECT`distance`, `direction` FROM `data` WHERE location=?";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/locations", "root","");
            st=conn.prepareStatement(query);
            st.setString(1, pp);
            ResultSet rst =st.executeQuery();
            while(rst.next())
            {
                d1=rst.getString("distance");
                String k=rst.getString("direction");
                dxn1=Integer.parseInt(k);  
                
            }
        }
        catch(SQLException ec)
        {
            JOptionPane.showMessageDialog(null,"Error");
        
        }
            String d2 = null;
            int dxn2 = 0;
                 try{
            String query="SELECT`distance`, `direction` FROM `data` WHERE location=?";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/locations", "root","");
            st=conn.prepareStatement(query);
            st.setString(1, dp);
            ResultSet rst =st.executeQuery();
            while(rst.next())
            {
                d2=rst.getString("distance");
                    String kk=rst.getString("direction");
                dxn2=Integer.parseInt(kk);
                
            }
        }
        catch(SQLException ec)
        {
            JOptionPane.showMessageDialog(null,"Error");
        
        }
                  a=Integer.parseInt(d1);
                 int b=Integer.parseInt(d2);
           
                 if(dxn1==dxn2)
                 {
                     c=abs(a-b);
                 }
                 else
                 {
                     c=a+b;
                 }
                 String j=Integer.toString(c);
                  if(c<=20)
        {
            fare=200;

        }
                  else if(c<30&&c>20)
                      fare=300;
                  else if(c<40&&c>30)
                      fare=500;
                  else if(c<50&&c>40)
                      fare=800;
                  else
                      fare=1000;
                  etfare=Integer.toString(fare);
             int AcT =(c*60/40);
             AcTime = Integer.toString(AcT);
        namedriver ="";
        int min = Integer.MAX_VALUE;
        int totl;
        int Prt=Integer.MAX_VALUE;
      
    try{
        String wee = "SELECT * FROM `driver_info`";
      Connection cot = DriverManager.getConnection("jdbc:mysql://localhost:3306/driver_data", "root","");
      PreparedStatement pst = cot.prepareStatement(wee);
        ResultSet ree = pst.executeQuery();
        
        while(ree.next()){
          String  u= ree.getString("dis");
          String r = ree.getString("dir");
          String n = ree.getString("Name");
          String rt =ree.getString("rating");
          String moby =ree.getString("Mobile");
          String vii =ree.getString("Vid");
          int av = ree.getInt("Available");
          if(av==0) avcon++;
          if(av==1){
//          rot = rt;
//          vid=ree.getString("Vid");
          int dd = Integer.parseInt(u);
          int dx =Integer.parseInt(r);
          int rw =Integer.parseInt(rt);
          
          if(dxn1==dx){
              
          totl =abs(dd-a);
          
          }
          else{ totl =dd+a;}
          System.out.println("a->"+a);
          System.out.println("dd->"+dd);
          
          System.out.println(totl);
          if(totl<min){
              min =totl;
          namedriver =n;
          Prt =rw;
        mob =moby;
        rot = rt;
        vid=vii;
          }
          else if(totl==min){
          if(Prt<rw){
             min =totl;
             namedriver=n;
             Prt=rw;
            mob =moby;
            rot = rt;
            vid=vii;
          }
       
          
          }
        
        }
    }
        
//        JOptionPane.showMessageDialog(null,namedriver);
        
        
    }catch(HeadlessException | NumberFormatException | SQLException ec)
    {
       JOptionPane.showMessageDialog(null,"Dikkat hai bhai");
        
    }
   int t=(min/40)*60;
    if(avcon==7){ JOptionPane.showMessageDialog(null,"No Driver Available");
    new Proifile1().setVisible(true);
    avcon=0;
    this.dispose();
    }
    
    else{
    if(t==0)
        t=1;
    time=Integer.toString(t);

        this.dispose();
       confirmation cnf=new confirmation();
       cnf.pack();
       cnf.setVisible(true);
       cnf.setLocationRelativeTo(null);
            }
        }
    
    }//GEN-LAST:event_Bool_cabMouseClicked
    
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
      Updater(Login.y);
        System.exit(0);
       
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void pickuplistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickuplistActionPerformed
      pp=pickuplist.getSelectedItem().toString();
        // TODO add your handling code here:
    }//GEN-LAST:event_pickuplistActionPerformed

    private void DroplistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DroplistActionPerformed
        dp=Droplist.getSelectedItem().toString();// TODO add your handling code here:
    }//GEN-LAST:event_DroplistActionPerformed

    private void Bool_cabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bool_cabKeyPressed
//    if(evt.getKeyCode()==KeyEvent.VK_ENTER) 
//    {
//    }// TODO add your handling code here:
    }//GEN-LAST:event_Bool_cabKeyPressed

    private void Bool_cabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bool_cabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bool_cabActionPerformed

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
            java.util.logging.Logger.getLogger(Book1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bool_cab;
    private javax.swing.JButton Cancel_booking;
    private javax.swing.JComboBox<String> Droplist;
    private javax.swing.JPanel book;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> pickuplist;
    // End of variables declaration//GEN-END:variables
}
