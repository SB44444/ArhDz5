import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/** Класс User представляет объект данных пользователя*/

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}