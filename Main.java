import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList method examples
        // Strings
        ArrayList<String> students = new ArrayList<String>();
        students.add("Omar");
        students.add("Sadie");
        students.add("Gerald");
        students.add("Nathan");

        System.out.println(students);
        System.out.println(students.get(1));
        students.add(2, "Allan");
        students.set(3, "Sam");
        System.out.println(students.size());
        System.out.println(students);

        // Integers
        ArrayList<Integer> myGrades = new ArrayList<Integer>();
        myGrades.add(80); //this uses autoboxing
        myGrades.add(Integer.valueOf(90)); //this doesn’t use autoboxing (not on AP Exam)  myGrades.add(85);
        myGrades.add(76);

        System.out.println(myGrades);
        myGrades.add(1, 93);
        myGrades.add(2, 89);
        myGrades.add(2, myGrades.get(0));
        myGrades.set(4, 97);
        System.out.println(myGrades);


    }
}
