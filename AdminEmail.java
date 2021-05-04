
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminEmail extends javax.swing.JFrame {

    Connection con = MasterPage.con;
    Statement stmt;
    static String email;
    static String table;
    public AdminEmail() {
        initComponents();
        try {
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Wrong w = new Wrong(ex.getMessage());
            w.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(670, 360));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_50px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(590, 10, 50, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("         Change your Email");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 40, 490, 70);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton1.setText("OKAY");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 300, 110, 30);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(170, 230, 280, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye_24px.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(450, 230, 25, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("EPassword");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(170, 210, 130, 19);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Email");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(170, 140, 100, 19);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 160, 300, 40);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String pass = jPasswordField1.getText().trim();
          String email = jTextField1.getText().trim();
          if(pass.length()==0 || email.length()==0){
            Wrong w = new Wrong("All Fields are Mandatory...");
            w.setVisible(true);        
          }else{
              try {
                  String tempe =  Sendmail2.MyAccount;
                  String tempp =  Sendmail2.Password;
                  Sendmail2.MyAccount = email;
                  Sendmail2.Password = pass;
                  String message = "<!doctype html>\n" +
"<html lang=\"en\">\n" +
"  <head>\n" +
"    <meta charset=\"utf-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n" +
"  </head>\n" +
"  <body>\n" +
"    <div class=\"container text-center\">\n" +
"        <img src=\"logo.png\" alt=\"\">\n" +
"        <br><br>\n" +
"        <h5 style=\"color:cadetblue;\">Powered by Enigma</h5>\n" +
"    </div>    \n" +
"    \n" +
"    <div class=\"container\">\n" +
"        <div class=\"row\">\n" +
"           \n" +
"            <div class=\"col-lg-3 col-md-4 col-sm-6 col-xs-4 text-lg-end text-md-end text-sm-center text-center\">\n" +
"                <img src=\"https://cdn.dribbble.com/users/3821672/screenshots/7172846/otp.gif\" height=150 alt=\"\">\n" +
"            </div>\n" +
"            <div class=\"col-lg-9 col-md-8 col-sm-6 col-xs-8 my-lg-5 my-4 text-lg-start text-center\">\n" +
"                   <h5>Dear User, Thanks for signing in with CoreEnergy powered by Enigma 2k21.</h5>\n" +
"             </div>\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"    <div class=\"container text-center\">\n" +
"           <h3 style=\"color:coral;\">Please change your credentials if it's not you.</h3>\n" +
"    </div> \n" +
"    <br><br>\n" +
"    <div class=\"container\">\n" +
"        <div class=\"container mx-5\">\n" +
"            <br>\n" +
"            <h6>Regards:</h6>\n" +
"            <h6>Enigma CorEnergy Fit App.</h6> <br>\n" +
"        </div>\n" +
"    </div>    \n" +
"    <footer class=\"bd-footer p-md-5 bg-dark\">\n" +
"        <div class=\"container\"></div>\n" +
"            <div class=\"row\">\n" +
"               <div class = \"col-xl-1 col-lg-2 col-md-2 col-sm-3 col-xs-3\">\n" +
"                   <img height=100px src=\"Enigma_icon.png\" alt=\"\">\n" +
"               </div> \n" +
"               <div class = \"col-xl-8 col-lg-6 col-md-7 col-sm-8\">\n" +
"                  <h1 style=\"color:aquamarine; font-size:45px;\">ENIGMA 2K21</h1>\n" +
"                  <p style=\"color:lightcyan\">Under Hackathon 2021...</p>\n" +
"               </div>\n" +
"               <div class = \"col-lg-3 col-md-3\">\n" +
"                <ul>\n" +
"                    <li></li>\n" +
"                    <li style=\"color: cornflowerblue;\">Sahil Jain</li>\n" +
"                    <li style=\"color: cornflowerblue;\">Shruti Sharma</li>\n" +
"                    <li style=\"color: cornflowerblue;\">Aryan Khanna</li>\n" +
"                    <li style=\"color: cornflowerblue;\">Priyanka Sharma</li>\n" +
"                </ul>              \n" +
"             </div>\n" +
"            </div>   \n" +
"        </div>\n" +
"    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf\" crossorigin=\"anonymous\"></script>\n" +
"  </body>\n" +
"</html>";
                  int ii = Sendmail2.smail(email, "CoreEnergy: Email Registered as Admin.", message);
                  if(ii!=0){
                  int i = stmt.executeUpdate("update Admin set email = '"+email+"', epass = '"+pass+"'");
                  if(i>0){
                     Done d = new Done();
                     d.setVisible(true);
                     this.dispose();
                  }else{
                     Wrong w = new Wrong("Unexpected Error occured, Please Try Again...");
                     w.setVisible(true);
                  }}else{
                     Sendmail2.MyAccount = tempe;
                     Sendmail2.Password = tempp;
                     Wrong w = new Wrong("Please enter a valid Email...");
                     w.setVisible(true);
                  }
              } catch (SQLException ex) {
                  Logger.getLogger(ForgotPass.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if( flag1 == 0 ){
            flag1=1;
            jPasswordField1.setEchoChar((char)0);
        }else{
            flag1=0;
            jPasswordField1.setEchoChar((char)8226);
        }
    }//GEN-LAST:event_jLabel9MouseClicked
    int flag=0,flag1=0;
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                AdminEmail obj1 =  new AdminEmail();
                obj1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
