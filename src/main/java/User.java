public class User {

    public int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }


    private static final String DEFAULT_NAME = "Herbert";

    public static String getNameStatic(User user) {
        return user.name;
    }

    public static String getDefaultName() {
        return DEFAULT_NAME;
    }
}
