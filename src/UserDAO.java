import java.sql.SQLException;
import java.util.List;
/** Интерфейс UserDAO определяет операции, которые должен поддерживать DAO*/
public interface UserDAO {
    List<User> getAllUsers() throws SQLException;
    User getUser(int id) throws SQLException;
    void updateUser(User user) throws SQLException;
    void deleteUser(User user) throws SQLException;

}

