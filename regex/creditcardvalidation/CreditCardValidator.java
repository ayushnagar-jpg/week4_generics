package regex.creditcardvalidation;
public class CreditCardValidator {
    public static boolean isValidCard(String cardNumber) {
        String regex = "^(4[0-9]{15}|5[1-5][0-9]{14})$";
        return cardNumber.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(isValidCard("4111111111111111")); // ✅ true (Visa)
        System.out.println(isValidCard("5105105105105100")); // ✅ true (MasterCard)
        System.out.println(isValidCard("1234567812345678")); // ❌ false
    }
}
