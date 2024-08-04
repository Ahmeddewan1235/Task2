


public class Person {

    // 3 instance variables
    private String name;
    private int age;
    private String suburb;

    //Default Constructor
    public Person(){
        this.name = " ";
        this.age = 0;
        this.suburb = " ";
    }
    public Person(String name, int age, String suburb) {
        this.name = name;
        this.age = age;
        this.suburb = suburb;
    }

//getter and setter methods
//name
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
//age
    public int getAge (){
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }
//suburb
    public String getSuburb(){
        return suburb;
    }
    public void getSuburb (String suburb){
        this.suburb = suburb;
    }



}

