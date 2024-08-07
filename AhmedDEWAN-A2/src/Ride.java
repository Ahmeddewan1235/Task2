
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class Ride implements RideInterface{
    private String rideName;
    private String type;
    private Employee operator; //Referance from employee class
//part 2/3
    private Queue<Visitor> queue;
    private LinkedList<Visitor> rideHistory;
//PART 5
    private int maxRiders;
    private int numOfCycles;

    // Default constructor
    public Ride (){
        this.rideName = " ";
        this.type = "";
        this.operator = null;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRiders = 1;
        this.numOfCycles = 0;
    }
    // Constructor with parameters
    public Ride (String rideName, String type, Employee operator, int maxRiders){
        this.rideName = rideName;
        this.type = type;
        this.operator = operator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRiders = maxRiders;
        this.numOfCycles = 0;
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
//PART 5 getters and setters
    public int getMaxRiders(){
        return maxRiders;
    }
    public void setMaxRiders(int maxRiders){
        this.maxRiders = maxRiders;
    }
    public  int getNumOfCycles(){
        return numOfCycles;
    }
    public void setNumOfCycles(int numOfCycles){
        this.numOfCycles = numOfCycles;
    }

//implementing interface;
//the following methods can

@Override
//Part 5
    public void addVisitorToQueue(Visitor visitor){
        queue.add(visitor);
    }
    @Override
    public void removeVisitorFromQueue(Visitor visitor){
        if (queue.contains(visitor)){
            queue.remove(visitor);
            System.out.println(visitor.getName()+ "is removed");
        } else {
            System.out.println(visitor.getName() + "not in queu");
        }
    }
    @Override
    public void printQueue(){
        System.out.println("Queue is: ");
        for (Visitor visitor :queue){
            System.out.println(visitor.getName());
        }
    }
@Override
    public void runOneCycle(){      //here i have added operate == null condition in  if else
        if (operator == null){
            System.out.println("No operator");
            return;
        }
        if(Queue.isEmpty()){
            System.out.println("not enough riders");
            return;
        }
// following is for one run and adding one into cycle
        System.out.println("Running one Run Cycle----");
        int count = 0;
        while (!queue.isEmpty() && count < maxRiders){
            Visitor visitor = queue.remove();
            rideHistory.add(visitor);
            System.out.println(visitor.getName() + "Ride complete");
            count++;
        }
    }
    @Override
    public void printRideHistory(){
        System.out.println("Ride History: ");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName());
        }
//PART 5
        System.out.println("Ride History");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()){
            Visitor visitor = iterator.next();
            System.out.println(visitor.getName());
        }
    }

//Part 4A, ride history
    public void addVisitorToHistory(Visitor visitor){
        rideHistory.add(visitor);
        System.out.println("Visitor "+ Visitor.getName() + "has been added to collection");
}
    public boolean isVisitorInHistory (Visitor visitor){
        return rideHistory.contains(visitor);
    }
    public int getNumberOfVisitorInHistory(){
        int count = rideHistory.size();
        System.out.println("Number of Visitor in History is " + count);
        return count;
    }

//Part 4B
    public void sortRideHistory(){
        Collections.sort(rideHistory,new VisitorComparator();
        System.out.println("Ride history sorted");
    }

//Part 6
    public void backupVisitorsFile(String filename){
        try (PrintWriter writer = new PrintWriter(new File(filename))){
            for (Visitor visitor : rideHistory){
                writer.println(visitor.getName() + "/" + visitor.getAge() + "/" + visitor.getVisits());
            }
            System.out.println("Visitor data " + filename);
        } catch (FileNotFoundException e){
            System.out.println("Error can not write" + e.getMessage());
        }
    }
}
