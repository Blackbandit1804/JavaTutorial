public class Member extends User {

    private String nickname;

    public Member(int id, String name) {
        super(id, name);
        this.nickname = name;
    }

    public void setNickname(String nick) {
        this.nickname = nick;
    }

    public String getNickname() {
        return this.nickname;
    }

}
