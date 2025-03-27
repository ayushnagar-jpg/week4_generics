package com.performancetesting;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

class TaskManagerTest {

   
    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    void testLongRunningTaskPerformance() {
        assertEquals("Task Completed", TaskManager.longRunningTask());
    }
}
