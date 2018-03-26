public class Main {

    public static void main(String[] args) {
        User user1 = new User(1001, "Olaf");

        System.out.println(
                "User 1:\n" +
                "\tID: " + user1.id +
                "\n\tName: " + user1.getName()
        );

        User user2 = new User(1002, "Günter");

        user2.setName("Martin");

        System.out.println(
                "User 2:\n" +
                "\tID: " + user2.id +
                "\n\tName: " + user2.getName()
        );

        Member member1 = new Member(2001, "Dominik");
        member1.setName("Dominic");
        member1.setNickname("Dome");

        System.out.println(
                "Member 1:\n" +
                "\tID: " + member1.id +
                "\n\tName: " + member1.getName() +
                "\n\tNickname: " + member1.getNickname()
        );

        System.out.println(
                "STATICS:\n" +
                        "\tDefault name: " + User.getDefaultName() +
                        "\n\tName Static: " + User.getNameStatic(member1)
        );

    }

}