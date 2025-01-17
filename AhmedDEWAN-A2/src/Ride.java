
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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
//Part 8
    private final Lock lock = new ReentrantLock();


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
        lock.lock();
        try {
            queue.add(visitor);
        } finally {
            lock.unlock();
        }
    }
    @Override
    public void removeVisitorFromQueue(Visitor visitor){
        lock.lock();
        try {
        if (queue.contains(visitor)){
            queue.remove(visitor);
            System.out.println(visitor.getName()+ "is removed");
        } else {
            System.out.println(visitor.getName() + "not in queu");
        }} finally {
            lock.unlock();
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
        lock.lock();
        try{
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
    }   finally {
            lock.unlock();
        }
        }
//PART 8 is implemented here lock Unlock
    @Override
    public void printRideHistory(){
        lock.lock();
        try{
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
    } finally {
            lock.unlock();
        }
        }

//Part 4A, ride history
    public void addVisitorToHistory(Visitor visitor){
        lock.lock();
        try{
        rideHistory.add(visitor);
        System.out.println("Visitor "+ Visitor.getName() + "has been added to collection");
} finally {
        lock.unlock();
    public boolean isVisitorInHistory(Visitor visitor){
        lock.lock();
        try{
            return rideHistory.contains(visitor);
    } finally {
            lock.unlock();
        }
        }
    public int getNumberOfVisitorInHistory(){
        int count = rideHistory.size();
        System.out.println("Number of Visitor in History is " + count);
        return count;
    }

//Part 4B
    public void sortRideHistory(){
        Collections.sort(rideHistory,new VisitorComparator());
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
//PART 7
    public void restoreVisitorsFile(String filename){
       lock.lock();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){;
        String line;
        while ((line = reader.readLine()) != null){
            String[] details = line.split(" / ");
            if(details.length == 5){
                String name = details[0];
                int age = Integer.parseInt(details[1]);
                String suburb = details[2];
                String ticket = details[3];
                int visits = Integer.parseInt(details[4]);

                Visitor visitor = new Visitor(name, age, suburb, ticket, visits);
                rideHistory.add(visitor);
            }
        }
        System.out.println("Visitors restotred from file name: " + filename);
    } catch (IOException e) {
        System.out.println("Error reading file " + e.getMessage());
    } finally {
            lock.unlock();
    }
}
}
