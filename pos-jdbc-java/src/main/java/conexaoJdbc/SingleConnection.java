package conexaoJdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {

    private static String url = "jdbc:postgresql://localhost:5432/pos-java";
    private static String user = "admin";
    private static String password = "adminS3cret";
    private static Connection connection = null;

    private static void connectar() {
        try {
            if (connection == null) {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(url, user, password);
                connection.setAutoCommit(false);
                System.out.println("conectamos");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    };

    public SingleConnection() {
        connectar();
    }

    public static Connection getConnection() {
        return connection;
    }

//    public static void setConnection(Connection connection) {
//        SingleConnection.connection = connection;
//    }

}
