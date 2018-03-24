public class Member extends User {
    
    private String nickname;

    public Member(int id, String name) {
        super(id, name);
        this.nickname = name;
    } 

    void setNick(String nick) {
        this.nickname = nick;
    }

    String getNick() {
        return this.nickname;
    }
    
}
