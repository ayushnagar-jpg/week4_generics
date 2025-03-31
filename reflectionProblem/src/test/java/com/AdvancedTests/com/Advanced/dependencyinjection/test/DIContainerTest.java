package com.AdvancedTests.com.Advanced.dependencyinjection.test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.Advanced.dependencyinjection.DIContainer;
import com.Advanced.dependencyinjection.EmailService;
import com.Advanced.dependencyinjection.MessageService;
import com.Advanced.dependencyinjection.NotificationService;
import com.Advanced.dependencyinjection.SystemOutCapture;

public class DIContainerTest {

    private DIContainer container;

    @Before
    public void setUp() {
        // ✅ Initialize the DI Container before each test
        container = new DIContainer();
    }

    @Test
    public void testDependencyInjection() {
        // ✅ Step 1: Register Dependencies
        container.register(MessageService.class, new EmailService());

        // ✅ Step 2: Create Object That Needs Dependencies
        NotificationService notificationService = new NotificationService();

        // ✅ Step 3: Inject Dependencies
        container.injectDependencies(notificationService);

        // ✅ Step 4: Check if the dependency was injected (should not be null)
        assertNotNull("Dependency should be injected", notificationService.messageService);
    }

    @Test
    public void testInjectedMethodExecution() {
        
    	// ✅ Step 1: Register Dependencies
        container.register(MessageService.class, new EmailService());

        // ✅ Step 2: Create Object That Needs Dependencies
        NotificationService notificationService = new NotificationService();

        // ✅ Step 3: Inject Dependencies
        container.injectDependencies(notificationService);

        // ✅ Step 4: Capture System Output
        String expectedOutput = "📧 Email Sent: Test Message";
        SystemOutCapture outputCapture = new SystemOutCapture(); // ✅ Ensure object is initialized
        outputCapture.start(); // ✅ Start capturing output

        // ✅ Step 5: Execute Injected Method
        notificationService.notifyUser("Test Message");

        // ✅ Step 6: Stop capturing and verify output
        String actualOutput = outputCapture.stop().trim(); // ✅ Corrected line
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testNoInjectionIfDependencyNotRegistered() {
        // ✅ Step 1: Create Object That Needs Dependencies
        NotificationService notificationService = new NotificationService();

        // ✅ Step 2: Inject Dependencies (without registering)
        container.injectDependencies(notificationService);

        // ✅ Step 3: Check if dependency is still null
        assertNull("Dependency should not be injected as it wasn't registered", notificationService.messageService);
    }
}

