
/**
 * Write a description of class Task here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task
{
    private String description;
    private String name;
    private String owner;
    private int timeToComplete;
    private Task preRequisite;
    public Task(){
        description = "";
        name = "";
        owner = "";
        timeToComplete = 0;
    }
    public Task(String name, int time){
        this.name = name;
        this.timeToComplete = time;
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
        preRequisite = otherTask;
    }
    public Task getPreRequisite(){
        return preRequisite;
    }
    public int calculateTimeToComplete(){
        int time = getTimeToComplete();
        if(getPreRequisite()!= null)
        {
            time += getPreRequisite().getTimeToComplete();
        }
        return time;
    }
}
