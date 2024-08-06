
import java.util.Queue;
import java.util.LinkedList;


public class Ride implements RideInterface{
    private String rideName;
    private String type;
    private Employee operator; //Referance from employee class
//part 2/3
    private Queue<Visitor> queue;
    private LinkedList<Visitor> rideHistory;

    // Default constructor
    public Ride (){
        this.rideName = " ";
        this.type = "";
        this.operator = null;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }
    // Constructor with parameters
    public Ride (String rideName, String type, Employee operator){
        this.rideName = rideName;
        this.type = type;
        this.operator = operator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

//Getters and setters
    public String getRideName(){
        return rideName;
    }
    public void  setRideName(String rideName){
        this.rideName = rideName;
    }
    public String getType (){
        return type;
    }
    public void setType (String type){
        this.type = type;
    }
    public Employee getOperator(){
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }
//following method will help us to assign the operator
    public void assignOperator(Employee operator){
        this.operator = operator;
    }

//implementing interface;
//the following methods can
@Override
    public void addVisitorToQueue(Visitor visitor){
        queue.add(visitor);
    }

    @Override
    public void removeVisitorToQueue(Visitor visitor) {

    }

    public void removeVisitorFromQueue(Visitor visitor){
        queue.remove(visitor);
    }
    public void printQueue(){
        System.out.println("Queue is: ");
        for (Visitor visitor :queue){
            System.out.println(visitor.getName());
        }
}
    public void runOneCycle(){
        if (!queue.isEmpty()){
            Visitor visitor = queue.poll();
            rideHistory.add(Visitor);
            System.out.println("Ride for : " + visitor.getName());
        } else {
            System.out.println("No in the queue: ");
        }
    }
    public void printRideHistory(){
        System.out.println("Ride History: ");
        for (Visitor vistor : rideHistory);
        {
            System.out.println(visitor.getName());
        }
    }
}
