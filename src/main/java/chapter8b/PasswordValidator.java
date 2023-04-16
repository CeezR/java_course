package chapter8b;

public class PasswordValidator {
    public static void main(String[] args) {
        Password password = new Password();
        password.setUsername("johndoe");
        password.setOldPassword("johndoe");
        password.setPassword("joH%ndoe");
        // System.out.println(password.isPasswordValid());
    }
}
