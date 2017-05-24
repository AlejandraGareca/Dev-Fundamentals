import java.util.Vector;
/**
 * Write a description of class Task here.
 *
 * @author Alejandra Paola Gareca Cruz
 * @version (a version number or a date)
 */
public class Task
{
    private String description;
    private String name;
    private String owner;
    private int timeToComplete;
    private Vector<Task> dependantTasks;
    public Task(){
        description = "";
        name = "";
        owner = "";
        timeToComplete = 0;
        dependantTasks = new Vector<Task>(); 
    }
    public Task(String name, int time){
        this.name = name;
        this.timeToComplete = time;
        dependantTasks = new Vector<Task>(); 
    }
    public void setDescription(String description){
        this.description = description;        
    }
    public String getDescription(){
        return description;
    }
    public void setName(String name){
        this.name = name;        
    }
    public String getName(){
        return name;
    }
    public void setOwner(String owner){
        this.owner = owner;        
    }
    public String getOwner(){
        return owner;
    }
     public void setTimeToComplete(int time){
        this.timeToComplete = time;        
    }
    public int getTimeToComplete(){
        return timeToComplete;
    }
    public void dependsOn(Task otherTask){
        dependantTasks.add(otherTask);
    }
    public  Vector<Task> getDependantTaks(){
        return dependantTasks;
    }
    public int calculateTimeToComplete(){
        int time = getTimeToComplete();
        if(getDependantTaks()!= null)
        {
            time += getHighestTimeOfDependantTasks();
        }
        return time;
    }
    public int getHighestTimeOfDependantTasks(){
        int highestTime =  0;
        for(Task task: dependantTasks){
           int time = task.getTimeToComplete();
            if(time>highestTime){
                highestTime = time;
            }
        }
        return highestTime;
    }
}
