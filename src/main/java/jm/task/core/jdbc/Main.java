package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм
        Util util = new Util();
        User user1 = new User("Ivan", "Ivanov", (byte) 20);
        User user2 = new User("Petr", "Petrov", (byte) 25);
        User user3 = new User("Magomed", "Magomedov", (byte) 30);
        User user4 = new User("Joe", "Johnson", (byte) 40);


    }
}
