package academy.devdojo.Nelio.BancoDeDados.src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import academy.devdojo.Nelio.BancoDeDados.src.DB1.DB;

public class Program {
    public static void main(String[] args) {
     Connection conn = null;
     PreparedStatement st = null;

     try {
      conn = DB.getConnection();
      st = conn.prepareStatement("DELETE FROM department " +  "WHERE " + "ID = ?");
      

      st.setInt(1, 1);
      int stAfff = st.executeUpdate();
      System.out.println("Done! " + stAfff);
      
     } catch (SQLException e) {
      // TODO: handle exception
      e.printStackTrace();
     }finally {
      DB.closeStatement(st);
      DB.closeConnection();
     }
    }
}

