import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDialog extends javax.swing.JFrame {
    Home obj = Home.obj;
    Connection con = MasterPage.con;
    Statement stmt;
    private static String OTP; 
    public LoginDialog() {
        initComponents();
        try {
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Wrong w = new Wrong(ex.getMessage());
            w.setVisible(true);
        }
        OTP = new Random().nextInt(50)+"";
                               while(OTP.length()<4){
                                  OTP += new Random().nextInt(9); 
                               }  
                  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_50px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(430, 10, 50, 50);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(100, 280, 310, 40);

        jLabel2.setText("Forgot Password?");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 400, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Email");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 260, 80, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 330, 80, 19);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("        User Login");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 120, 350, 70);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 470, 120, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye_24px.png"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(380, 350, 25, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Don't have account?? Sign In here");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 530, 230, 19);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 200, 350, 20);

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPasswordField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(100, 350, 280, 40);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String email = jTextField1.getText();
            String password = jPasswordField2.getText();
            ResultSet rs = stmt.executeQuery("select * from Admin where upper(email) = upper('"+email+"') and password ='"+password+"' " );
            int i=0;
            String name="";
            while(rs.next()){
              i++;
              name = rs.getString("name");
            }
            if( i != 0){
                adm.name = name;
                adm a = new adm();
                a.setBounds(obj.getBounds());
                a.setVisible(true);
                this.dispose();
                obj.dispose();
            }else{
                ResultSet rss = stmt.executeQuery("select * from users where upper(email) = upper('"+email+"') and password ='"+password+"' " );
                i=0;
                name="";
                while(rs.next()){
                  i++;
                  name = rs.getString("f_name");
                }
                if(i!=0){
                   UserEnd.name = name;
                   UserEnd a = new UserEnd();
                   a.setBounds(obj.getBounds());
                   a.setVisible(true);
                   this.dispose();
                   obj.dispose();
                }else{
                   jLabel7.setText("Wrong Credentials...");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SendMail(String email, String table){
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
"                   <h5>Dear User, we are sending you OTP(One Time Password). Please don't share this with anyone.</h5>\n" +
"             </div>\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"    <div class=\"container text-center\">\n" +
"           <h3 style=\"color:coral;\">OTP : "+OTP+"</h3>\n" +
"    </div> \n" +
"    <br><br>\n" +
"    <div class=\"container\">\n" +
"        <div class=\"container mx-5\">\n" +
"            <h6> Please provide this OTP to do accomplish the procedure. Thank you so much. </h6>\n" +
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
                  
                  int valid = Sendmail2.smail(email, "CorEnergy:Password Reset", message);
                  if(valid == 1){
                      otpDialog.OTP = OTP;
                      otpDialog.oobj = this;
                      otpDialog.email = email;
                      otpDialog.table = table;
                      otpDialog otp = new otpDialog();
                      otp.show();
                  }else{
                      Wrong w = new Wrong("Check your Internet Connection...");
                      w.setVisible(true);
                  }
    }
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if( jTextField1.getText().length() == 0 ){
            jLabel7.setText("Please enter Email...");
        }else{
            try {
                String email = jTextField1.getText();
                ResultSet rs = stmt.executeQuery("select email from users where upper(email) = upper('"+email+"') ");
                int i=0;
                while(rs.next())
                    i++;
                if(i==0){
                    ResultSet rs1 = stmt.executeQuery("select email from admin where upper(email) = upper('"+email+"') ");
                    int x = 0;
                    while(rs1.next())
                        x++;
                    if(x==0){
                       Wrong w = new Wrong("Sorry, User not Found...");
                       w.setVisible(true);
                    }else{
                        SendMail(email, "Admin");
                    }
                }else{
                       SendMail(email, "Users");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                Wrong w = new Wrong(ex.getMessage());
                w.setVisible(true);
            }  
        }
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        SignIn s = new SignIn();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if( evt.getKeyChar() != KeyEvent.VK_ENTER ){
           jLabel7.setText("");
        }else{
           jPasswordField2.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed
    int flag=0; 
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if( flag == 0 ){
            flag=1;
            jPasswordField2.setEchoChar((char)0);
        }else{
            flag=0;
            jPasswordField2.setEchoChar((char)8226);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // obj =  new LoginDialog();
               // obj.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
