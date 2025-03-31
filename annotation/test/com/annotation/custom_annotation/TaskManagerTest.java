package annotation.custom_annotation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;

import org.junit.Test;

public class TaskManagerTest {
	@Test
	public void testAnnotationPresent() {
		try {
			//accessing method from task Manager
			Method completion = TaskManager.class.getMethod("completeTask");
			Method schedule   = TaskManager.class.getMethod("scheduleTask");
			
			//checking the method that it exist in any of the method
			assertTrue(completion.isAnnotationPresent(TaskInfo.class));
			assertTrue(schedule.isAnnotationPresent(TaskInfo.class));
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	
	@Test
	public void testAnnotationValue() {
		try {
			Method completion = TaskManager.class.getMethod("completeTask");
			Method schedule   = TaskManager.class.getMethod("scheduleTask");
			
			TaskInfo comp = completion.getAnnotation(TaskInfo.class);
			TaskInfo sch   = schedule.getAnnotation(TaskInfo.class);
			
			//for completing the task
			assertEquals("High",comp.priority());
			assertEquals("Alice",comp.assignTo());
			
			//for scheduling the task
			assertEquals("Low",sch.priority());
			assertEquals("Bob",sch.assignTo());
					
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	
	
}
