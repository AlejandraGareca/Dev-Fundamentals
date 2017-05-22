import java.util.Vector;
/**
 * Write a description of class Project here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Project
{
    private String name;
    private Vector tasks;
    public Project()
    {
        tasks = new Vector();   
    }
    public Project(String name)
    {
        this.name = name;
        tasks = new Vector(); 
    }
    public String getName(){
        return name;
    }
    public void addTask(Task task){
        tasks.add(task);
    }
    public int calculateTimeToDelivery()
    {
        int maxTimeToComplete =  0;
        for(Object element: tasks){
            Task task = (Task)element;
            if(task.getTimeToComplete()>maxTimeToComplete){
                maxTimeToComplete = task.getTimeToComplete();
            }
        }
        return maxTimeToComplete;
    }
}
