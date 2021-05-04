
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author sahil jain
 */
public class SignIn extends javax.swing.JFrame {
    Connection con = MasterPage.con;
    Statement stmt;
    Home obj = Home.obj;
    public SignIn() {
        initComponents();
        try {
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(520, 720));
        setResizable(false);
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
        jLabel1.setBounds(440, 20, 50, 50);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(110, 240, 310, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(110, 310, 310, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("First name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 210, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Last name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 290, 100, 19);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("          Sign In");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 0)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 100, 350, 70);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton1.setText("SIGN IN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 600, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 360, 100, 19);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye_24px.png"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(390, 450, 25, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(110, 380, 310, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 430, 100, 19);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye_24px.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(390, 520, 25, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Confirm Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(110, 500, 130, 19);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Already have account?? Login here");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 660, 240, 19);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(110, 520, 280, 40);

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPasswordField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(110, 450, 280, 40);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    void elsep(String email, String fname, String lname, String pass){
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
                        "    <div class=\"container text-center\">\n" +
                        "           <h3 style=\"color:coral;\">Dear User, Thanks for Signing in with CoreEnergy.</h3>\n" +
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
                        "                  <h1 style=\"color:blank; font-size:45px;\">ENIGMA 2K21</h1>\n" +
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
                int i = Sendmail2.smail(email, "CorEnergy: Account Registered Verification.", message);
                if(i==0){
                    Wrong w = new Wrong("Sorry, Kindly check your Email or Internet Connection...");
                }else{
                    try {
                        String sql = "insert into users values( '"+email+"', '"+fname+"', '"+lname+"', '"+pass+"', '"+"Not defined"+"', '"+"Not defined"+"', '"+"Not defined"+"', '"+"Not defined"+"' );";
                        stmt.executeUpdate(sql);
                        UserEnd.name = fname;
                        UserEnd ue = new UserEnd();
                        ue.setBounds(obj.getBounds());
                        ue.setVisible(true);
                    } catch (SQLException ex) {
                        Wrong w = new Wrong(ex.getMessage());
                        w.setVisible(true);
                    }
                }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String fname = jTextField1.getText().trim();
            String lname = jTextField2.getText().trim();
            String email = jTextField3.getText().trim();
            String pass  = jPasswordField1.getText().trim();
        if( fname.length()==0 || email.length()==0 || lname.length()==0 || pass.length()==0 ){
              Wrong w = new Wrong("All Fields are Mandatory...");
              w.setVisible(true);
        }else if(!pass.equals(jPasswordField2.getText().trim())){
              Wrong w = new Wrong("Both Passwords should match...");
              w.setVisible(true);
        }else{
         try {
            ResultSet rs = stmt.executeQuery("select * from admin where upper(email) = upper('"+email.trim()+"')");
            int ii=0;
            while(rs.next()){
                ii++;
            }
            if(ii==0){
                rs = stmt.executeQuery("select * from users where upper(email) = upper('"+email+"')");
                while(rs.next())
                   ii++;
                if(ii!=0){
                   Wrong w = new Wrong("Email has already registered...");
                   w.setVisible(true);
                }else{
                   elsep(email, fname, lname, pass);
                }   
            }else{
                 Wrong w = new Wrong("Email has already registered...");
                 w.setVisible(true);
            }} catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        LoginDialog s = new LoginDialog();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked
    int flag = 0;
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if( flag == 0 ){
            flag=1;
            jPasswordField2.setEchoChar((char)0);
        }else{
            flag=0;
            jPasswordField2.setEchoChar((char)8226);
        }
    }//GEN-LAST:event_jLabel10MouseClicked
    int flag1=0;
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
         if( flag1 == 0 ){
            flag1=1;
            jPasswordField1.setEchoChar((char)0);
        }else{
            flag1=0;
            jPasswordField1.setEchoChar((char)8226);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
