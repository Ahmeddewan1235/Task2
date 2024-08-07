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
        Employee operator = new Employee("Awais", 30,"West", "12","collector");
        Ride bigSlide = new Ride ("Big Slide", "Slide", operator);

//here i am using the same visitor details BUT change the ride and visitor Number
//To differentiate and understanding

        Visitor visitor6 = new Visitor("Ali", 20, "Shah", "abc1",10);
        Visitor visitor7 = new Visitor("Sham", 22, "Bulk", "abc2",20);
        Visitor visitor8 = new Visitor("Sharon", 20, "Jays", "abc3",1);
        Visitor visitor9 = new Visitor("Tom", 20, "n/a", "abc4",13);
        Visitor visitor10 = new Visitor("Justin", 20, "Hoda", "abc5",17);

        bigSlide.addVisitorToHistory(visitor6);
        bigSlide.addVisitorToHistory(visitor7);
        bigSlide.addVisitorToHistory(visitor8);
        bigSlide.addVisitorToHistory(visitor9);
        bigSlide.addVisitorToHistory(visitor10);
//Check for history
        bigSlide.isVisitorInHistory(visitor7);
//check for number
        bigSlide.getNumberOfVisitorInHistory();
//print all
        bigSlide.printRideHistory();
    }
    public void partFourB(){
        Employee operator = new Employee("Ali", 33,"North", "11","collector");
        Ride pool = new Ride ("Swimming pool", "Pool", operator);

        Visitor visitor11 = new Visitor("Ali", 20, "AD", "abc1",14);
        Visitor visitor12 = new Visitor("Noreen", 25, "SCU", "abc4",15);
        Visitor visitor13 = new Visitor("Jess", 28, "DS", "abc5",21);
        Visitor visitor14 = new Visitor("kol", 18, "MLA", "abc13",12);
        Visitor visitor15 = new Visitor("Dis", 29, "MPA", "abc12",12);

        pool.addVisitorToHistory(visitor11);
        pool.addVisitorToHistory(visitor12);
        pool.addVisitorToHistory(visitor14);
        pool.addVisitorToHistory(visitor15);
        pool.addVisitorToHistory(visitor13);
//output before sorting
        System.out.println("Before sort is performed ");
        pool.printRideHistory();
//Sorting command
        pool.sortRideHistory();
//Output after sorting
        System.out.println("After sorting it is: ");
        pool.printRideHistory();

    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }

}
