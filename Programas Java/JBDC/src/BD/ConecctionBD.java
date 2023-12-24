package BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConecctionBD {

    public class ConexionBD {
        public static Connection obtenerConexion() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/firstdatabase";
            String usuario = "root";
            String contraseña = "1234";
            return DriverManager.getConnection(url, usuario, contraseña);
        }
    }

}
