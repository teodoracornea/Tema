package tema7;

import java.util.Comparator;

public class AssignmentComparatorByNrAndTitle implements Comparator<Assignment> {
    @Override
    public int compare(Assignment o1, Assignment o2) {
        int comparisonResultForNumber = o1.getLevel().compareTo(o2.getLevel());
        if(comparisonResultForNumber !=0){
            return comparisonResultForNumber;
        }

        return o1.getTitle().compareTo(o2.getTitle());
    }
}
