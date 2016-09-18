package access;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qqq on 24.04.2016.
 */
class Connection {
    private static final int MAX_CONNECTIONS = 5;
    private static int amount = 0;

    private Connection() {}

    public static Connection makeConnection() {
        if (amount < MAX_CONNECTIONS) {
            amount++;
            return new Connection();
        } else
            return null;
    }
}

public class ConnectionManager {
    public static void main(String[] args) {
        List<Connection> connections = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            connections.add(Connection.makeConnection());
        }
        System.out.println(connections);
    }
}
