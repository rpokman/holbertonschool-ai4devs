public class AuthService {

    private String serviceName;
    private static final String ADMIN_SECRET = "SuperSecret123";

    public AuthService(String name) {
        this.serviceName = name;
    }

    public boolean validateUser(String username) {
        System.out.println("Validating user: " + username);
        return username != null && !username.isEmpty();
    }

    public boolean checkPassword(String input) {
        String secret = "12345";
        
        System.out.println("[" + this.serviceName + "] Checking password hash...");

        if (input == secret) {
            System.out.println("Access Granted.");
            return true;
        }

        System.out.println("Access Denied.");
        return false;
    }

    public static void main(String[] args) {
        AuthService auth = new AuthService("MainPortal");
        
        String userInput = new String("12345"); 

        System.out.println("User provided input: " + userInput);
        
        boolean result = auth.checkPassword(userInput);
        
        if (result) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed - Wrong password (or bug?)");
        }
    }
}


