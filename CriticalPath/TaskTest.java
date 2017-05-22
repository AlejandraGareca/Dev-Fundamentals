

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TaskTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TaskTest
{
   /**
    * US1
    */
   @Test
   public void createdInstanceOfTask(){
       Task emptyTask = new Task ();
       assertTrue(emptyTask instanceof Task);
       assertTrue(emptyTask instanceof Object);
   }
    /**
    * US1
    */
   @Test
   public void readDescriptionProperty(){
       Task emptyTask = new Task();
       assertEquals("", emptyTask.getDescription());
   }
    /**
    * US1
    */
      @Test
   public void writeDescriptionProperty(){
       Task task = new Task();
       task.setDescription("This is a task");
       assertEquals("This is a task", task.getDescription());
   }
    /**
    * US1
    */
      @Test
   public void writeNameProperty(){
       Task task = new Task();
       task.setName("Task Name");
       assertEquals("Task Name", task.getName());
   }
    /**
    * US1
    */
      @Test
   public void writeOwnerProperty(){
       Task task = new Task();
       task.setOwner("Task Owner");
       assertEquals("Task Owner", task.getOwner());
   }
    /**
    * US1
    */
      @Test
   public void writeTimeToCompleteProperty(){
       Task task = new Task();
       task.setTimeToComplete(1);
       assertEquals(1, task.getTimeToComplete());
   }
    /**
    * US1
    */
   @Test
   public void createTaskWithNameAndTimeToComplete(){
       Task task = new Task("t1",4);
       assertEquals("t1", task.getName());
       assertEquals(4, task.getTimeToComplete());
   }
}
