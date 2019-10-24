package app;

import driver.Database;

public class App {
    public static void main(String[] args) throws Exception {
        Database conn = Database.getInstance();

        conn.query("SELECT * FROM users");
    }
}