import java.security.SecureRandom;

public class Main {
    private static final String LOWERCASE_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String generatePassword(int length, boolean includeUppercase) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        String alphabet = LOWERCASE_ALPHABET;
        if (includeUppercase) alphabet += UPPERCASE_ALPHABET;

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(alphabet.length());
            password.append(alphabet.charAt(randomIndex));
        }
        return password.toString();
    }
    public static void main(String[] args) {
        int length = 7; // Довжина паролю
        boolean includeUppercase = true; // Включити великі літери
        String password = generatePassword(length, includeUppercase);
        System.out.println("Згенерований пароль: " + password);
    }
}
