package NewPackage;

public class DataForInput {

    //Data for input field
    protected final String randomfirstname = ("qa") + generateRandomString(12);
    protected final String randomlastname = ("qa") + generateRandomString(8);
    protected final String randomphone = generateRandomNumber(8);
    protected final String randomemail = ("qa") + generateRandomString(15) + ("@gmail.com");

    //Generating random Strings
    protected String generateRandomString(int count) {
        String symbols = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder randString = new StringBuilder();
        for (int i = 0; i < count; i++) {
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));
        }
        return randString.toString();
    }
    protected String generateRandomNumber(int count) {
        String symbols = "0123456789";
        StringBuilder randString = new StringBuilder();
        for (int i = 0; i < count; i++) {
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));
        }
        return randString.toString();
    }
}
