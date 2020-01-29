/*
 * Alt + Shift + F to indent lines.
 */
package builder;

/**
 *
 * @author Vinayak
 */
public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Vinayak").setMidName("YourDad").setLastName("Saini").build();
        System.out.println(user.toString());
    }
}