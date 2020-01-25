/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPackage;

import static connectionPackage.DBconnection.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author halla
 */
public class Practice {
    public static void main(String[] args) {
         try (Connection con = connect()) {
                PreparedStatement pst = con.prepareStatement("SELECT QT_Title FROM QuizesTitle WHERE TA_ID = '" + 2 + "'");
                ResultSet rs = pst.executeQuery();
   
                if (rs.next()) {
                    System.out.println(rs.getString(1));
  
                }
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(Practice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Practice.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
