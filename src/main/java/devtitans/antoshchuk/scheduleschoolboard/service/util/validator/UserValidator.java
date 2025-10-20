package devtitans.antoshchuk.scheduleschoolboard.service.util.validator;

public class UserValidator {
    public static boolean passwordValidation(String password) {
        //&& password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,16}$")
        return password.length() >= 8 && password.length() <= 16;
    }
}
