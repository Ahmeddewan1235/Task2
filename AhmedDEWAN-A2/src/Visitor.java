public class Visitor extends Person {
    private String ticket;
    private int visits;

    public Visitor(){
        super();
        this.ticket = " ";      //Ticket Number
        this.visits = 0;        //How many times Visitor has visited, for Reward purpose.
    }

    public Visitor (String name, int age, String suburb, String ticket, int visits){
        super();
        this.ticket = ticket;
        this.visits = visits;
    }

    //getters and setters
    public String getTicket(){
        return ticket;
    }
    public void setTicket(String ticket){
        this.ticket = ticket;
    }
    public int getVisits(){
        return visits;
    }
    public void setVisits(int visits){
        this.visits = visits;
    }

}
