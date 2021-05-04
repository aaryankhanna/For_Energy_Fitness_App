import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MasterPage {
    static Connection con;
    static Statement stmt;
    private static Boolean hasdata = false;
    
    public ResultSet display(){
        if(con == null){
           getConnection();
        }       
        try{
           stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("select name, password , email, epass, pic from admin");
           return rs;
        } catch (SQLException ex) {
            
        }
        return null;
    }
    
    void getConnection(){
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:.\\DB");
            initialize();
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
    }
    private void initialize(){
          if(!hasdata){
             hasdata = true;
              try {
                  Statement stmt = con.createStatement();
                  ResultSet rs = stmt.executeQuery("select name From sqlite_Master where type = 'table' and name = 'admin'  ");
                  if(!rs.next()){
                     Statement s = con.createStatement();
// Admin Database                     
                         s.execute("CREATE TABLE Admin( name varchar(100), password varchar(100), email varchar(200), epass varchar(200) ,pic varchar(100),primary key(name));");
                                          
// user DATABASE                     
                        s.execute("CREATE TABLE users(" +
                                    "EMAIL VARCHAR(100) PRIMARY KEY," +
                                    "F_NAME VARCHAR(100) NOT NULL," +
                                    "L_NAME VARCHAR(100) NOT NULL," +
                                    "password VARCHAR(200)NOT NULL," +
                                    "pic VARCHAR(100) NOT NULL," +
                                    "Height DECIMAL(10,2) NOT NULL," +
                                    "Weight DECIMAL(10,2) NOT NULL," +
                                    "Goals DECIMAL(10,2) NOT NULL" +
                                    ");");
                     
// plan DATABASE                     
                        s.execute("CREATE TABLE PLAN(" +
                                    "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                                    "PLAN_NAME VARCHAR(100)NOT NULL," +
                                    "DURATION VARCHAR(100) NOT NULL," +
                                    "AMT INTEGER(100)NOT NULL," +
                                    "FIRST VARCHAR(800) NOT NULL," +
                                    "SECOND VARCHAR(800) NOT NULL," +
                                    "THIRD VARCHAR(800) NOT NULL" +
                                    ");");  
                     
// userPlan DATABASE                     
                     s.execute("CREATE TABLE userplan (" +
"                               u_email varchar(200) NOT NULL," +
"                               plan_id int  NOT NULL," +
"                               CONSTRAINT `plain_id` FOREIGN KEY (plan_id) REFERENCES plan (ID) ON DELETE CASCADE ON UPDATE CASCADE," +
"                               CONSTRAINT u_email FOREIGN KEY (u_email) REFERENCES user (email) ON DELETE CASCADE ON UPDATE CASCADE" +
");                             ");

                     PreparedStatement p = con.prepareStatement("insert into admin values(?,?,?,?,?)");
                     p.setString(1, "Admin");
                     p.setString(2, "Password");
                     p.setString(3, "sidkumar8872@gmail.com");
                     p.setString(4, "EPassword");
                     p.setString(5, "user.png");
                     p.execute();
                     
                     PreparedStatement p1 = con.prepareStatement("insert into plan values(?,?,?,?,?,?)");
                     p1.setString(1, "LOWCARBS");
                     p1.setString(2, "1 Week");
                     p1.setString(3, "00");
                     p1.setString(4, "BREAKFAST:SPINACH-MUSHROOM SCRAMBLED EGGS,      LUNCH:CHICKEN SALAD ,    DINNER:ROASTED TUNA");
                     p1.setString(5, "BREAKFAST:OATMEAL AND APPLES     LUNCH:CAULIFLOWER SOUP     DINNER:TANDOORI GRILLED TOFU WITH RED PEPPER AND BROCCOLI");
                     p1.setString(6, "BREAKFAST:FRUITS     LUNCH:ALMOND VEGETABLE STIR FRY     DINNER:CHICKEN BREAST");
                     p1.execute();
                  }
              } catch (SQLException ex) {
              }
          }
    }
}
