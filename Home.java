
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Home extends javax.swing.JFrame {
    Connection con = MasterPage.con;
    static Statement stmt;
    static Home obj;
    public Home() throws SQLException {
        initComponents();
        connection();
    }
    void connection(){
        stmt = MasterPage.stmt;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jPopupMenu2.setBackground(new java.awt.Color(102, 102, 102));
        jPopupMenu2.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jPopupMenu2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        jPopupMenu2.setPreferredSize(new java.awt.Dimension(200, 110));

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Constantia", 0, 19)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem3.setText(" Login");
        jMenuItem3.setToolTipText("");
        jMenuItem3.setBorder(null);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem3);

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Constantia", 0, 19)); // NOI18N
        jMenuItem1.setText(" Sign In");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new java.awt.GridLayout(2, 0));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("*  Customize your plans.");

        jLabel5.setFont(new java.awt.Font("Constantia", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("*  Track your BMI.");

        jLabel6.setFont(new java.awt.Font("Constantia", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("*  Diet Charts.");

        jLabel10.setFont(new java.awt.Font("Constantia", 0, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("*  Exercise Routines.");

        jLabel11.setFont(new java.awt.Font("Constantia", 0, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("*  Fun & Fit.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N
        jLabel1.setText("Username");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 102, 102)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 255, 51));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Castellar", 0, 36)); // NOI18N
        jLabel17.setText("Commit to");

        jLabel16.setFont(new java.awt.Font("Castellar", 0, 36)); // NOI18N
        jLabel16.setText("BE");

        jLabel18.setFont(new java.awt.Font("Castellar", 0, 100)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setText("FIT..");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EatHealthyGif.gif"))); // NOI18N
        jPanel5.add(jLabel7);
        jLabel7.setBounds(40, 200, 510, 249);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 51));
        jLabel12.setText("  Premium Plans.");
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel12);
        jLabel12.setBounds(300, 110, 200, 34);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 51));
        jLabel13.setText("____________________________");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(50, 50, 470, 30);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 204));
        jLabel14.setText("  Basic Plans.");
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel14);
        jLabel14.setBounds(90, 110, 170, 34);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Verdana", 1, 26)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 51));
        jLabel15.setText("*  Hey, choose your plans here:");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(50, 40, 470, 33);

        jPanel3.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Yoga.gif"))); // NOI18N
        jPanel6.add(jLabel8);
        jLabel8.setBounds(50, 200, 480, 250);

        jPanel3.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dance.gif"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(40, 200, 440, 250);

        jPanel3.add(jPanel7);

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         jPopupMenu2.show(obj, evt.getXOnScreen()-evt.getX()+10, evt.getYOnScreen()+20);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
               LoginDialog obj1 =  new LoginDialog();
               obj1.setVisible(true);        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
               SignIn obj1 =  new SignIn();
               obj1.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        BasicPlan b = new BasicPlan();
        b.show();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
         BasicPlan1 b = new BasicPlan1();
         b.show();
    }//GEN-LAST:event_jLabel12MouseClicked

    public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MasterPage m = new MasterPage();
                    ResultSet rs = m.display();
                    obj =  new Home();
                    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                    obj.setSize(d.width, d.height);
                    obj.setVisible(true);
                    rs = stmt.executeQuery("select * from plan where upper(plan_name) = upper('HIGH CARBS') ");
                    int i=0;
                    while(rs.next()){
                        i++;
                    }
                    if(i==0){
                    String sql1 = "INSERT INTO plan(PLAN_NAME,DURATION,AMT,FIRST,SECOND,THIRD)VALUES('LOWCARBS','1 WEEK',00,'BREAKFAST:SPINACH-MUSHROOM SCRAMBLED EGGS,LUNCH:CHICKEN SALAD ,DINNER:ROASTED TUNA','BREAKFAST:OATMEAL AND APPLES  LUNCH:CAULIFLOWER SOUP DINNER:TANDOORI GRILLED TOFU WITH RED PEPPER AND BROCCOLI','BREAKFAST:FRUITS     LUNCH:ALMOND VEGETABLE STIR FRY     DINNER:CHICKEN BREAST');";
                    stmt.executeUpdate(sql1);
                    sql1 = "INSERT INTO plan(PLAN_NAME,DURATION,AMT,FIRST,SECOND,THIRD) VALUES('HIGH CARBS','1WEEK',00,'BREAKFAST:PANEER SANDWICH AND TOASTER ,    LUNCH:ROTI AND PULSES ,    DINNER:FRIED CHICKEN WITH A ROTI','BREAKFAST:CHICKENPEAS   ,  LUNCH:LENTILS   ,  DINNER:BROWN RICE','BREAKFAST:FRUITS  ,   LUNCH:WHITE RICE WITH PULSES     DINNER:EAT ANYTHING');";
                    stmt.executeUpdate(sql1);
                    sql1 = "INSERT INTO plan(PLAN_NAME,DURATION,AMT,FIRST,SECOND,THIRD) VALUES('HIGH PROTIEN','1 WEEK',00,'BREAKFAST:6EGG WHITES  , LUNCH:ROTI AND VEGGIES   ,  DINNER:VEG SALAD','BREAKFAST:SPROUTS   ,  LUNCH:BROWN RICE   ,  DINNER:ROASTED CHICKEN','BREAKFAST:FRUITS  ,   LUNCH:ROTI AND PULSES  ,   DINNER:SKIP');";
                    stmt.executeUpdate(sql1);
                    sql1="INSERT INTO plan(PLAN_NAME,DURATION,AMT,FIRST,SECOND,THIRD)VALUES('LOW CARBS','1 MONTH',500,'BREAKFAST:SPINACH-MUSHROOM SCRAMBLED , SPROUTS AND FRUITS  ,   LUNCH:CHICKEN SALAD, BROWN RICE AND VEGGIES  ,   DINNER:ROASTED TUNA, CHICKEN GRAVY AND RICE','BREAKFAST:WHEY PROTIEN,WALNUTS AND DATES     ,   LUNCH:CAULIFLOWER SOUP,PULSES AND VEGGIES      , DINNER:TANDOORI GRILLED TOFU WITH RED PEPPER AND BROCCOLI SALMON','BREAKFAST:EGG HALF FRY AND SPROUTS	   ,   LUNCH:ALMOND VEGETABLE STIR FRY, CHICKEN SALAD    ,    DINNER:CHICKEN BREAST, ROASTED CHICKEN, TUNA AND CRAB')";
                    stmt.executeUpdate(sql1);
                    sql1 = "INSERT INTO plan(PLAN_NAME,DURATION,AMT,FIRST,SECOND,THIRD)VALUES('HIGH CARBS','1 MONTH',500,'BREAKFAST:PANEER SANDWICH OR TOASTER,PARANTHA	,  LUNCH:ROTI AND PULSES, VEGGIES	, 	DINNER:FRIED CHICKEN WITH A ROTI OR ANY SEA FOOD','BREAKFAST:CHICKENPEAS,OMELLET OR SKIP	 ,   LUNCH:LENTIN,PULSES AND VEGGIES	,  DINNER:BROWN RICE,ROTI AND CHICKEN','BREAKFAST:FRUITS,OATS 	,	LUNCH:	WHITE RICE WITH PULSES,SALADS	,	DINNER:EAT ANYTHING' ) ;";
                    }
                    rs = stmt.executeQuery("select * from admin");
                    while(rs.next()){
                        Sendmail2.MyAccount = rs.getString("email").trim();
                        Sendmail2.Password = rs.getString("epass").trim();
                    }  
                    
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    Wrong w = new Wrong(ex.getMessage());
                    w.setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu2;
    // End of variables declaration//GEN-END:variables
}
