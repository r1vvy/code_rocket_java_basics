package lesson2.task36;

public class PasswordValidationService {
    // 1. A password must have at least eight characters.
    public boolean isLengthValid(Password password) {
        return password.getPassword().length() >= 8;
    }
    // 2. A password consists of only letters and digits.
    public boolean isOnlyLettersAndDigits(Password password) {
        String passwordString = password.getPassword();
        for (int i = 0; i < passwordString.length(); i++) {
            char ch = passwordString.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }
    // 3. A password must contain at least two digits.
    public boolean isDigitCountValid(Password password) {
        String passwordString = password.getPassword();

        int digitCount = 0;
        for (int i = 0; i < passwordString.length(); i++) {
            char ch = passwordString.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
    
    
    public boolean isValid(Password password) {
        return isLengthValid(password) && isOnlyLettersAndDigits(password) && isDigitCountValid(password);
    }
}
