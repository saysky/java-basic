package structure.pool;

public class DriverManager {

    public static Connection getConnection(String url, String username, String password) {
        return new Connection();
    }
}
