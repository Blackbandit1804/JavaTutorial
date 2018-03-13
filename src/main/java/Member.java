public class Member extends User {
    
    private String nickname;

    public Member(int id, String name) {
        super(id, name);
        this.nickname = name;
    } 

    void setNick(String nick) {
        this.nickname = nick;
    }

    void getNick() {
        return this.nickname;
    }
    
}
