
//this will be used to track the staff of the theme park.

public class Employee extends Person {
    private String id;      //Employee ID
    private String position;        //Employee Rank

//Default
    public Employee() {
        super();        //recalling Person class
        this.id = " ";
        this.position = " ";
    }
//Parameters Constructor
    public Employee (String name, int age, String suburb,String id, String position){
        super(name, age, suburb); //recall super class for values
        this.id = id;
        this.position = position;
    }


    //getter and setter method for the values in Employee class
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
}

