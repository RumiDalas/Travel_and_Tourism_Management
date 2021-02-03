
package travel_and_tourism;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DbConnection {
        Connection con;
    public static Connection ConnecerDb(){
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","");
            return con;
		}catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                    return null ;
                
                
                
                }
		
	}
    
}
