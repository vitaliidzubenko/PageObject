package PageObject;

public class Utils {
    //Generating random Strings
    public final static String generateRandomString(int count) {
        String symbols = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder randString = new StringBuilder();
        for (int i = 0; i < count; i++) {
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));
        }
        return randString.toString();
    }

    public final static String generateRandomNumber(int count) {
        String symbols = "0123456789";
        StringBuilder randString = new StringBuilder();
        for (int i = 0; i < count; i++) {
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));
        }
        return randString.toString();
    }
}
