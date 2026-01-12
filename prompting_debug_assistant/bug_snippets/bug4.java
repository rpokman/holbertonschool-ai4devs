public class AuthService {

    private String serviceName;

    public AuthService(String name) {
        this.serviceName = name;
    }

    public boolean checkPassword(String input) {
        String secret = "12345";
        System.out.println("Checking " + this.serviceName + " password...");

        if (input == secret) {
            System.out.println("Access Granted.");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        AuthService auth = new AuthService("MainPortal");
        String userInput = new String("12345"); 

        System.out.println("User input: " + userInput);
        boolean result = auth.checkPassword(userInput);
        
        if (result) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed.");
        }
    }
}




