package lesson9.validators;

import java.math.BigDecimal;
import java.util.HashMap;

public class UserInputValidator {
    public boolean validateShapeCreationParameters(HashMap<String, BigDecimal> parameters) {
        for (BigDecimal value : parameters.values()) {
            if (value.compareTo(BigDecimal.ZERO) <= 0) {
                return false;
            }
        }
        return true;
    }
}
