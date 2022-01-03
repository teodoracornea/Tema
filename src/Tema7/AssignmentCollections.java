package Tema7;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AssignmentCollections {
    public static void main(String[] args) {
        //homework point 2
        Assignment as1 = new Assignment(1, 3,"Romana", "tema la romana", DifficultyLevel.HARD);
        Assignment as2 = new Assignment(6,2, "Engleza", "tema la engleza", DifficultyLevel.EASY);
        Assignment as3 = new Assignment(4,3, "Franceza", "tema la franceza", DifficultyLevel.MEDIUM);
        HashSet<Assignment> assignments = new HashSet<>();
        assignments.add(as1);
        assignments.add(as2);
        assignments.add(as3);
        System.out.println("2.collection with unique elments");
        System.out.println(assignments);

        //Sortare cu comparable
        List<Assignment> assignmentList = new ArrayList<>(assignments);
        Collections.sort(assignmentList);
        System.out.println("Sortare cu comparable dupa id, titlu,level ");
        System.out.println(assignmentList);

        //homework point 3. Sorted collection using a custom comparator by the
        //course number and difficulty level
        System.out.println("3.Afiseaza elementele in ordinea numarului cursului si a dificultatii");
        TreeSet<Assignment> assignmentTreeSet = new TreeSet<>(new AssignmentComparatorByCourseNumber());
        assignmentTreeSet.add(as1);
        assignmentTreeSet.add(as2);
        assignmentTreeSet.add(as3);
        System.out.println(assignmentTreeSet);

        //homework point 4. Sorted collection using a custom comparator by the
        //course number and difficulty level
        System.out.println("4.Afiseaza elem in ordinea nr cursului si a titlului");
        TreeSet<Assignment> assignmentTreeSet1 = new TreeSet<>(new AssignmentComparatorByNrAndTitle());
        assignmentTreeSet1.add(as1);
        assignmentTreeSet1.add(as2);
        assignmentTreeSet1.add(as3);
        System.out.println(assignmentTreeSet1);

        //homework point 5. Map with a key that is a concatenated string...
        Integer key = as1.getId();
        String keyString = key.toString();
        String level = as1.getLevel().name();
        String keyS = keyString.concat(level);

        HashMap<String, Assignment> assignmentHashMap =new HashMap<>();
        assignmentHashMap.put(keyS, as1);
        System.out.println("5.Map");
        System.out.println(assignmentHashMap);

        //tema8 pct1
        final Set<String> uniqueIds = assignments.stream()
                .map(single -> single.getId())
                .map(n -> String.valueOf(n))
                .collect(Collectors.toSet());
        System.out.println("De aici incepe tema 8 ");
        System.out.println("1. unique ids");
        System.out.println(uniqueIds);

        //tema8 pct2 si 3
        System.out.println("2. Filtred to difficulty levels");
        final List<Assignment> assignments11 = assignments.stream()
                .peek(n -> System.out.println("stream 1:"+ n))
                .filter(dLevel -> dLevel.getLevel().equals(DifficultyLevel.EASY)||dLevel.getLevel().equals(DifficultyLevel.MEDIUM))
                .collect(Collectors.toList());
        System.out.println(assignments11);

        System.out.println("3. HashMap");
        HashMap<Integer,Assignment> assignmentHashMap1 = (HashMap<Integer, Assignment>) assignments.stream()
                .collect( Collectors.toMap(Assignment::getId,
                        Function.identity()) );
        System.out.println(assignmentHashMap1);














    }




}
