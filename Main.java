import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList method examples
        // Strings
//        ArrayList<String> students = new ArrayList<String>();
//        students.add("Omar");
//        students.add("Sadie");
//        students.add("Gerald");
//        students.add("Nathan");
//
//        System.out.println(students);
//        students.add(2, "Allan");
//        System.out.println(students);
//        String former = students.set(4, "nate-dog");
//        System.out.println(former + " updated successfully.");
//        System.out.println(students);

//        students.set(3, "Sam");
//        System.out.println(students.size());
//        System.out.println(students);

        // Integers
        ArrayList<Integer> myGrades = new ArrayList<Integer>();
        myGrades.add(80); //this uses autoboxing
        myGrades.add(Integer.valueOf(90)); //this doesn’t use autoboxing (not on AP Exam)
        myGrades.add(85);
        myGrades.add(76);
//
        System.out.println(myGrades);
        myGrades.add(1, 93);
        myGrades.add(2, 89);
        System.out.println(myGrades);
        myGrades.add(2, myGrades.get(0));
        System.out.println(myGrades);

        // Let's try different parameters...
//        System.out.println(myGrades.get(93)); //IndexOutOfBoundsException
        System.out.println( myGrades.get(-1)); //IndexOutOfBoundsException


    }
}
