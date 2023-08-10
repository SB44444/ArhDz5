import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


/**
 * Имплементация UserDAO для работы с базой данных SQL
 */
public class UserDAOImpl implements UserDAO {
    private Connection dbConnection;

    public UserDAOImpl() {
        this.dbConnection = dbConnection;
    }

    @Override  //SQL запрос на получение всех записей из таблицы
    public List<User> getAllUsers() throws SQLException {

        String sql = "SELECT * FROM dbUsers";
        Statement statement = (Statement) dbConnection.createStatement();
        return statement.execute(sql);
    }

    @Override  //SQL запрос в таблицу на получение пользователя по id
    public User getUser(int id) throws SQLException {
        String sql = String.format("SELECT * FROM dbUsers WHERE id = %d", id);
        Statement statement = (Statement) dbConnection.createStatement();
        return statement.execute(sql);
    }

    @Override  //SQL запрос на обновление записи в таблице.
    public void updateUser(User user) throws SQLException {
        // Здесь мы формируем SQL запрос на обновление записи в таблице студентов.
        String sql = String.format("UPDATE dbUsers SET user = '%s' WHERE user = '%s'", user);
        Statement statement = (Statement) dbConnection.createStatement();
        statement.getArguments();
    }

    @Override // Здесь мы формируем SQL запрос на удаление записи из таблицы студентов.
    public void deleteUser(User user) throws SQLException {
        String sql = String.format("DELETE FROM dbUsers WHERE user = '%s'", user);
        Statement statement = (Statement) dbConnection.createStatement();
        statement.getArguments();
    }

}

