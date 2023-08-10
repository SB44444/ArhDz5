import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserDAO userDao = new UserDAOImpl();

        try {
            System.out.println(userDao.getAllUsers()); // Вывести список всех пользователей
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(userDao.getUser(1));  // Вывести пользователя с id == 1
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            userDao.updateUser(userDao.getUser(1)); // Обновить пользователя с id == 1
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            userDao.deleteUser(userDao.getUser(1)); // Удалить пользователя с id == 1
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}