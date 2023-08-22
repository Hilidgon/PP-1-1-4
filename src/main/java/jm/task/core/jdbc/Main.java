package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Антон", "Семенов", (byte) 44);
        userService.saveUser("Олег", "Шишкин", (byte) 18);
        userService.saveUser("Владимир", "Журавлев", (byte) 35);
        userService.saveUser("Арина", "Анисимова", (byte) 19);

        List<User> users = userService.getAllUsers();
        System.out.println(users);

        userService.cleanUsersTable();

        userService.dropUsersTable();

        Util.closeFactory();
//        Util.closeConnection();
    }
}
