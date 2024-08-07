//creating classes
public class AssignmentTwo {

//the following code was given in the Assignment to add in here.
    public static void main(String[] args) {
    }
    public void partThree(){
        Employee operator = new Employee("Awais", 30,"West", "12","collector");
        Ride joyRide = new Ride ("joy Ride", "Coaster", operator, 10);

//above ride Constructer has been updates adding max rider in PART 5
// so all the bellow Rides are also updated with max number

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
        Ride bigSlide = new Ride ("Big Slide", "Slide", operator, 10);

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
        Ride pool = new Ride ("Swimming pool", "Pool", operator, 10);

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
        Employee operator = new Employee("Ali", 33,"North", "11","collector");
        Ride roller = new Ride ("Roller Coaster", "roller", operator, 10);

//Reusing visitor from part 3 and 4
        Visitor visitor1 = new Visitor("Ali", 20, "Shah", "abc1",10);
        Visitor visitor2 = new Visitor("Sham", 22, "Bulk", "abc2",20);
        Visitor visitor3 = new Visitor("Sharon", 20, "Jays", "abc3",1);
        Visitor visitor4 = new Visitor("Tom", 20, "n/a", "abc4",13);
        Visitor visitor5 = new Visitor("Justin", 20, "Hoda", "abc5",17);
        Visitor visitor6 = new Visitor("Ali", 20, "Shah", "abc1",10);
        Visitor visitor7 = new Visitor("Sham", 22, "Bulk", "abc2",20);
        Visitor visitor8 = new Visitor("Sharon", 20, "Jays", "abc3",1);
        Visitor visitor9 = new Visitor("Tom", 20, "n/a", "abc4",13);
        Visitor visitor10 = new Visitor("Justin", 20, "Hoda", "abc5",17);

        roller.addVisitorToQueue(visitor1);
        roller.addVisitorToQueue(visitor2);
        roller.addVisitorToQueue(visitor3);
        roller.addVisitorToQueue(visitor4);
        roller.addVisitorToQueue(visitor5);
        roller.addVisitorToQueue(visitor6);
        roller.addVisitorToQueue(visitor7);
        roller.addVisitorToQueue(visitor8);
        roller.addVisitorToQueue(visitor9);
        roller.addVisitorToQueue(visitor10);

        System.out.println("Today's Visitor are: ");
        roller.printQueue();

        roller.runOneCycle();
//print in one run
        System.out.println("All Visitor of first run");
        roller.printQueue();
//print history
        System.out.println("All visitor in Collection/History");
        roller.printRideHistory();
    }
    public static void partSix(){
        Employee operator = new Employee("David", 33,"North", "11","collector");
        Ride wheel = new Ride ("Big Wheel", "Wheel", operator, 20);

        Visitor visitor1 = new Visitor("Ali", 20, "Shah", "abc1",10);
        Visitor visitor2 = new Visitor("Sham", 22, "Bulk", "abc2",20);
        Visitor visitor3 = new Visitor("Sharon", 20, "Jays", "abc3",1);
        Visitor visitor4 = new Visitor("Tom", 20, "n/a", "abc4",13);
        Visitor visitor5 = new Visitor("Justin", 20, "Hoda", "abc5",17);

        wheel.addVisitorToQueue(visitor1);
        wheel.addVisitorToQueue(visitor2);
        wheel.addVisitorToQueue(visitor3);
        wheel.addVisitorToQueue(visitor4);
        wheel.addVisitorToQueue(visitor5);

        wheel.runOneCycle();
        wheel.backupVisitorsFile("visitor_backup.txt");

    }
    public void partSeven(){
    }

}
