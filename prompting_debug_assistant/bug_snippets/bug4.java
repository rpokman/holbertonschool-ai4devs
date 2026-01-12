public class AuthService {
    public boolean checkPassword(String input) {
        String secret = "12345";
        if (input == secret) {
            return true;
        }
        return false;
    }
}
