public class User {

    public int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    static final String DEFAULT_NAME = "Detlef";

    static String getNameStatic(User user) {
        return user.getName();
    }

}
