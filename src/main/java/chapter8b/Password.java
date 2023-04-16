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
        if (!isPasswordValid(password, username, oldPassword)) {
            List<String> errorMessages = whyInvalid(password);
            for (String message : errorMessages) {
                 System.out.println(message);
            }
        } else {
            this.validatedPassword = password;
        }
    }

    private List<String> whyInvalid(String invalidPassword) {
        List<String> errorMessages = new ArrayList<>();
        boolean isPasswordUppercase = isPasswordUppercase(invalidPassword);
        boolean isPasswordLongEnough = isPasswordLongEnough(invalidPassword);
        boolean isPasswordSpecialCharacter = isPasswordSpecialCharacter(invalidPassword);
        boolean isPasswordNotUsername = isPasswordNotUsername(invalidPassword, username);
        boolean isPasswordNotOldPassword = isPasswordNotOldPassword(invalidPassword, oldPassword);

        if(!isPasswordUppercase)
            errorMessages.add(NO_UPPERCASE_MESSAGE);

        if(!isPasswordLongEnough)
            errorMessages.add(TOO_SHORT_MESSAGE);

        if(!isPasswordSpecialCharacter)
            errorMessages.add(NO_SPECIAL_CHARACTERS_MESSAGE);

        if(!isPasswordNotUsername)
            errorMessages.add(SAME_AS_USERNAME_MESSAGE);

        if(!isPasswordNotOldPassword)
            errorMessages.add(SAME_AS_OLD_PASSWORD_MESSAGE);

        return errorMessages;
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

    public boolean isPasswordLongEnough(String password) {
        return password.length() >= 8;
    }

    public boolean isPasswordUppercase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isPasswordSpecialCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isPasswordNotUsername(String password, String username) {
        return !password.equalsIgnoreCase(username);
    }

    public boolean isPasswordNotOldPassword(String password, String oldPassword) {
        return !password.equals(oldPassword);
    }

    public boolean isPasswordValid(String password, String username, String oldPassword) {
        return isPasswordLongEnough(password) && isPasswordUppercase(password) && isPasswordSpecialCharacter(password) && isPasswordNotUsername(password, username) && isPasswordNotOldPassword(password, oldPassword);
    }

}
