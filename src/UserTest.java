public class UserTest {

    public static void main(String[] args) {
        User user = new User();
        User user2 = new User("iga", "pass" );
        System.out.println(user2.username + " " + user2.password);

        user.username = "BBBBBB";
        user.password = "QWERTY";
        user.sayHEllo();

    }
}
