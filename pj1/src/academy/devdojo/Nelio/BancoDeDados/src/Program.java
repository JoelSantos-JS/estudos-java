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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Connection connection = null;
      PreparedStatement preparedStatement = null;

      try {
        connection = DB.getConnection();
        preparedStatement = connection.prepareStatement("insert into seller" + 
        "(Name, Email, BirthDate, BaseSalary, DepartmentId)  " + "VALUES " + "(?,?,?,?,?)");

        preparedStatement.setString(1 , "Carl purple");
        preparedStatement.setString(2 , "carl@gmail.com");
        preparedStatement.setDate(3, new java.sql.Date(sdf.parse("22/04/1950").getTime()));
        preparedStatement.setDouble(4, 3000.0);
        preparedStatement.setInt(5, 4);

        int rowsAffectd = preparedStatement.executeUpdate();

        System.out.println("done" + rowsAffectd);
      } catch (SQLException e) {
        // TODO: handle exception
        e.printStackTrace();
      }catch (ParseException e) {
        e.printStackTrace();
      }finally {
        DB.closeStatement(preparedStatement);
        DB.closeConnection();
      }
    }
}
