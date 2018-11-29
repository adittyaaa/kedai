
package kedai;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class db {
    
    Connection con;
    Statement stm;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/db_java","root","");
            stm=con.createStatement();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Connection to mysql Failed"+e.getMessage());
        }
    }
}
