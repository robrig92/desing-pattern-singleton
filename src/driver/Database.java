package driver;

/**
 * Database
 */
public class Database {

    private static Database conn;

    private Database() {}

    public static Database getInstance() {
        if (null == conn) {
            return new Database();
        }
        return conn;
    }

    public void query(String query) {
        System.out.println("Query excecuted");
    }
}