package regex.ipaddressvalidation;

public class IPAddressValidator {
    public static boolean isValidIP(String ip) {
        String regex = "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        return ip.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(isValidIP("192.168.1.1"));  // ✅ true
        System.out.println(isValidIP("300.168.1.1"));  // ❌ false
    }
}
