
import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
// we used campare method to compare the name and the number of visits asa these both can be find in the original class
    @Override
    public int compare(Visitor visitor1, Visitor visitor3){
        int nameComparison = visitor1.getName().compareTo(visitor3.getName());
        if (nameComparison != 0){
            return nameComparison;
        } else {
            return Integer.compare(visitor1.getVisits(), visitor3.getVisits());
        }
    }
}
