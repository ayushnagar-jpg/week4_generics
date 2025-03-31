package annotation.role_allowed;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoleAllowedTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testAdminAccessToAdminTask() {
        User adminUser = new User("ADMIN");
        AdminService service = new AdminService();
        AccessManager.executeMethod(adminUser, service, "performAdminTask");
        assertTrue(outputStream.toString().contains("Performing admin task"));
    }

    @Test
    public void testUserAccessToAdminTask() {
        User normalUser = new User("USER");
        AdminService service = new AdminService();
        AccessManager.executeMethod(normalUser, service, "performAdminTask");
        assertTrue(outputStream.toString().contains("Access Denied!"));
    }

    @Test
    public void testUserAccessToUserTask() {
        User normalUser = new User("USER");
        AdminService service = new AdminService();
        AccessManager.executeMethod(normalUser, service, "performUserTask");
        assertTrue(outputStream.toString().contains("Performing user task"));
    }

    @Test
    public void testAdminAccessToUserTask() {
        User adminUser = new User("ADMIN");
        AdminService service = new AdminService();
        AccessManager.executeMethod(adminUser, service, "performUserTask");
        assertTrue(outputStream.toString().contains("Performing user task"));
    }

    @Test
    public void testPublicTaskAccess() {
        User normalUser = new User("USER");
        AdminService service = new AdminService();
        AccessManager.executeMethod(normalUser, service, "publicTask");
        assertTrue(outputStream.toString().contains("Performing a public task"));
    }
}

