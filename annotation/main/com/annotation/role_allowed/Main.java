package annotation.role_allowed;


public class Main {
    public static void main(String[] args) {
        User adminUser = new User("ADMIN");
        User normalUser = new User("USER");

        AdminService service = new AdminService();

        System.out.println("Admin trying to perform admin task:");
        AccessManager.executeMethod(adminUser, service, "performAdminTask");

        System.out.println("\nUser trying to perform admin task:");
        AccessManager.executeMethod(normalUser, service, "performAdminTask");

        System.out.println("\nUser trying to perform user task:");
        AccessManager.executeMethod(normalUser, service, "performUserTask");

        System.out.println("\nUser trying to perform public task:");
        AccessManager.executeMethod(normalUser, service, "publicTask");
    }
}

