

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProjectTest.
 *
 * @author  Alejandra Paola Gareca Cruz
 * @version (a version number or a date)
 */
public class ProjectTest
{
    /**
     * US 0
     */
    @Test
    public void createAnEmptyProject(){
        Project project = new Project();
        assertTrue(project instanceof Project);
    }
    /**
     * US 0
     */
    @Test
    public void createAProjectWithName(){
        Project project = new Project("My first Project");
        assertTrue(project instanceof Project);
        assertEquals("My first Project", project.getName());
    }
    /**
     * US 1
     */
    @Test
    public void calculateTimeToDeliverOfASingleTask(){
        Project project = new Project("sample");
        Task singleTask = new Task ();
        singleTask.setTimeToComplete(5);
        project.addTask(singleTask);
        assertEquals(5, project.calculateTimeToDelivery());
    }
    /**
     * US 1
     */
    @Test
    public void calculateTimeToDeliverOfTwoNonDependentTasks(){
        Project project = new Project("sample");
        Task firstTask = new Task ("t1",5);
        Task secondTask = new Task ("t2",3);
        project.addTask(firstTask);
        project.addTask(secondTask);
        assertEquals(5, project.calculateTimeToDelivery());
    }
    /**
     * US 1
     */
    @Test
    public void calculateTimeToDeliveryOfTwoDependentTasks(){
        Project project = new Project("sample");
        Task firstTask = new Task ("t1",5);
        Task secondTask = new Task ("t2",3);
        secondTask.dependsOn(firstTask);
        project.addTask(firstTask);
        project.addTask(secondTask);
        assertEquals(8, project.calculateTimeToDelivery());
    }
    /**
     * US 1
     */
    @Test
    public void calculateTimeToDeliveryOfThreeDependentTasks(){
        Project project = new Project("sample");
        Task firstTask = new Task ("t1",5);
        Task secondTask = new Task ("t2",3);
        Task thirdTask = new Task ("t3",2);
        thirdTask.dependsOn(firstTask);
        thirdTask.dependsOn(secondTask);
        project.addTask(firstTask);
        project.addTask(secondTask);
        project.addTask(thirdTask);
        assertEquals(7, project.calculateTimeToDelivery());
    }  
    /**
     * US 1
     */
    @Test
    public void calculateTimeToDeliveryOfFourDependentTasks(){
        Project project = new Project("sample");
        Task firstTask = new Task ("t1",5);
        Task secondTask = new Task ("t2",2);
        Task thirdTask = new Task ("t3",6);
        Task fourthTask = new Task ("t4",1);
        secondTask.dependsOn(firstTask);
        thirdTask.dependsOn(firstTask);
        fourthTask.dependsOn(secondTask);
        fourthTask.dependsOn(thirdTask);
        project.addTask(firstTask);
        project.addTask(secondTask);
        project.addTask(thirdTask);
        project.addTask(fourthTask);
        assertEquals(12, project.calculateTimeToDelivery());
    } 
    /**
     * US 1
     */
    @Test
    public void calculateTimeToDeliveryOfSixDependentTasks(){
        Project project = new Project("sample");
        Task firstTask = new Task ("t1",10);
        Task secondTask = new Task ("t2",5);
        Task thirdTask = new Task ("t3",2);
        Task fourthTask = new Task ("t4",6);
        Task fifthTask = new Task ("t5",1);
        Task sixthTask = new Task ("t6",35);
        secondTask.dependsOn(firstTask);
        thirdTask.dependsOn(secondTask);
        fourthTask.dependsOn(secondTask);
        fifthTask.dependsOn(thirdTask);
        fifthTask.dependsOn(fourthTask);
        project.addTask(firstTask);
        project.addTask(secondTask);
        project.addTask(thirdTask);
        project.addTask(fourthTask);
        project.addTask(fifthTask);
        project.addTask(sixthTask);
        assertEquals(35, project.calculateTimeToDelivery());
    } 
     /**
     * US 3
     */
    @Test
    public void modifyTaskTimeToCompleteShouldChangeTimeToDelivery(){
        Project project = new Project("sample");
        Task firstTask = new Task ("t1",5);
        Task secondTask = new Task ("t2",2);
        Task thirdTask = new Task ("t3",6);
        Task fourthTask = new Task ("t4",1);
        secondTask.dependsOn(firstTask);
        thirdTask.dependsOn(firstTask);
        fourthTask.dependsOn(secondTask);
        fourthTask.dependsOn(thirdTask);
        project.addTask(firstTask);
        project.addTask(secondTask);
        project.addTask(thirdTask);
        project.addTask(fourthTask);
        assertEquals(12, project.calculateTimeToDelivery());
        
        thirdTask.setTimeToComplete(10);
        assertEquals(16, project.calculateTimeToDelivery());
    }
}
