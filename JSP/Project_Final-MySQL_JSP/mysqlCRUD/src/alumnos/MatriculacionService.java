package alumnos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MatriculacionService {
    Connection conn;
    public MatriculacionService(Connection conn){
        this.conn = conn;
    }

    public int update(int id, int grupo_id) throws SQLException{
        Statement statement = null;
        statement = this.conn.createStatement();    
        PreparedStatement prep = this.conn.prepareStatement("UPDATE alumnos  SET grupo_id = ? WHERE id=?");
        if(grupo_id==0)
            prep.setNull(1, java.sql.Types.INTEGER);
        else
            prep.setLong(1, grupo_id);
        prep.setLong(2, id);
        // Ejecución de la consulta
        int affectedRows = prep.executeUpdate();
        statement.close();
        if (affectedRows == 0)
            throw new SQLException("Creating user failed, no rows affected.");
        else
            return affectedRows;
    }
    
}