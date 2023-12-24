package BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();

        // Guardar en la base de datos
        try (Connection conexion = ConecctionBD.ConexionBD.obtenerConexion()) {
            String consulta = "INSERT INTO personas (nombre, apellido) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {
                preparedStatement.setString(1, nombre);
                preparedStatement.setString(2, apellido);
                preparedStatement.executeUpdate();
                System.out.println("Datos guardados correctamente en la base de datos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
