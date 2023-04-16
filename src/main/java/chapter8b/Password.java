package chapter8b;

import java.util.ArrayList;
import java.util.List;

public class Password {
    private static final String NO_SPECIAL_CHARACTERS_MESSAGE = "Password must contain at least one special character";
    private static final String NO_UPPERCASE_MESSAGE = "Password must contain at least one uppercase character";
    private static final String TOO_SHORT_MESSAGE = "Password must be at least 8 characters long";
    private static final String SAME_AS_USERNAME_MESSAGE = "Password cannot be the same as the username";
    private static final String SAME_AS_OLD_PASSWORD_MESSAGE = "Password cannot be the same as the old password";

    private String username;
    private String oldPassword;
    private String validatedPassword;

    public String getPassword() {
        return validatedPassword;
    }

    public void setPassword(String password) {
        if (!isPasswordValid(password)) {
            List<String> errorMessages = whyInvalid(password);
            for (String message : errorMessages) {
                System.out.println(message);
            }
        } else {
            this.validatedPassword = password;
        }
    }

    public List<String> whyInvalid(String invalidPassword) {
        List<String> errorMessages = new ArrayList<>();

        if (!isPasswordLongEnough(invalidPassword)) {
            errorMessages.add(TOO_SHORT_MESSAGE);
        }
        if (!isPasswordUppercase(invalidPassword)) {
            errorMessages.add(NO_UPPERCASE_MESSAGE);
        }
        if (!isPasswordSpecialCharacter(invalidPassword)) {
            errorMessages.add(NO_SPECIAL_CHARACTERS_MESSAGE);
        }
        if (!isPasswordNotUsername(invalidPassword, username)) {
            errorMessages.add(SAME_AS_USERNAME_MESSAGE);
        }
        if (!isPasswordNotOldPassword(invalidPassword, oldPassword)) {
            errorMessages.add(SAME_AS_OLD_PASSWORD_MESSAGE);
        }

        return errorMessages;
    }

    public boolean isPasswordLongEnough(String password) {
        return password.length() >= 8;
    }

    public boolean isPasswordUppercase(String password) {
        return password.matches(".*[A-Z].*");
    }

    public boolean isPasswordSpecialCharacter(String password) {
        return password.matches(".*[^a-zA-Z0-9].*");
    }

    public boolean isPasswordNotUsername(String password, String username) {
        return !password.equalsIgnoreCase(username);
    }

    public boolean isPasswordNotOldPassword(String password, String oldPassword) {
        return !password.equals(oldPassword);
    }

    public boolean isPasswordValid(String password) {
        return isPasswordLongEnough(password)
                && isPasswordUppercase(password)
                && isPasswordSpecialCharacter(password)
                && isPasswordNotUsername(password, username)
                && isPasswordNotOldPassword(password, oldPassword);
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
