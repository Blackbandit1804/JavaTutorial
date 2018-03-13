public class Main {

    public static void main(String[] args) {
        
        User user = new User(101, "Olaf");

        System.out.println(
            "Name: " + user.getName() +
            "\nID: " + user.id
        );

        Member member = new Member(201, "Günter");
        member.setNick("Günni");

        System.out.println(
            "Name: " + member.getName() +
            "\nID: " + member.id +
            "\nNick: " + member.getNick()
        );

    }

}
