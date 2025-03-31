package annotation.role_allowed;

public class AdminService {

    @RoleAllowed({"ADMIN"})
    public void performAdminTask() {
        System.out.println("Performing admin task...");
    }

    @RoleAllowed({"USER", "ADMIN"})
    public void performUserTask() {
        System.out.println("Performing user task...");
    }

    public void publicTask() {
        System.out.println("Performing a public task...");
    }
}
