class User {
    String username;
    String email;
    int age;

    User (String username) {
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }

    User (String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    User (String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    // constructor with 0 parameter
    User () {
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }
}

public class A2_ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("OVERLOADED CONSTRUCTORS\n");

        User user1 = new User();
        User user2 = new User("SpongeBob");
        User user3 = new User("Patrick","patrickstar@gmail.com");
        User user4 = new User("Squidward", "squidwardtentacle@gmail.com",34);
        

        printDetails(user1.username, user1.email, user1.age);
        printDetails(user2.username, user2.email, user2.age);
        printDetails(user3.username, user3.email, user3.age);
        printDetails(user4.username, user4.email, user4.age);

    }

    static void printDetails(String username, String email, int age) {
        System.out.println("Username : "+username);
        System.out.println("Email : "+email);
        System.out.println("Age : "+age);
        System.out.println();
    }

}

