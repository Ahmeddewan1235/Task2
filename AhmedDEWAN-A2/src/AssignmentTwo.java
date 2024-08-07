//creating classes
public class AssignmentTwo {

//the following code was given in the Assignment to add in here.
    public static void main(String[] args) {
    }
    public void partThree(){
        Employee operator = new Employee("Awais", 30,"West", "12","collector");
        Ride joyRide = new Ride ("joy Ride", "Coaster", operator);

        //Creating Objects
        Visitor visitor1 = new Visitor("Ali", 20, "Shah", "abc1",10);
        Visitor visitor2 = new Visitor("Sham", 22, "Bulk", "abc2",20);
        Visitor visitor3 = new Visitor("Sharon", 20, "Jays", "abc3",1);
        Visitor visitor4 = new Visitor("Tom", 20, "n/a", "abc4",13);
        Visitor visitor5 = new Visitor("Justin", 20, "Hoda", "abc5",17);

        //Adding to queue
        joyRide.addVisitorToQueue(visitor1);
        joyRide.addVisitorToQueue(visitor2);
        joyRide.addVisitorToQueue(visitor3);
        joyRide.addVisitorToQueue(visitor4);
        joyRide.addVisitorToQueue(visitor5);

        joyRide.removeVisitorFromQueue(visitor5);

        joyRide.printQueue();

    }
    public void partFourA(){
    }
    public void partFourB(){
    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }

}
