public class Ride {
    private String rideName;
    private String type;
    private Employee operator; //Referance from employee class

    public Ride (){
        this.rideName = " ";
        this.type = "";
        this.operator = null;
    }

    public Ride (String rideName, String type, Employee operator){
        this.rideName = rideName;
        this.type = type;
        this.operator = operator;
    }

//Getters and setters
    public String getRideName(){
        return rideName;
    }
}
