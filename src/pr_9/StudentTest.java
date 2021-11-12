package pr_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) throws BadName {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Smith", "123456"));
        students.add(new Student("Sarah", "Barney", "563821"));
        students.add(new Student("Mike", "Riley", "903321"));
        students.add(new Student("John", "Getz", "889045"));
        students.add(new Student("Maria", "Grant", "982567"));
        students.add(new Student("Frank", "Smith", "893167"));
        Collections.sort(students);

        new labUI(students);
        /*System.out.println("Sorted by Surname: ");
        for (Student s: students)
            System.out.println(s.toString());

        Student target = new Student("John", "Smith", "");
        Student t = new Student();
        System.out.println("Required Student: ");
        t.search(students, target);
        System.out.println();


        String res = "";
        System.out.println();
        Scanner sc = new Scanner(System.in);
        res = sc.nextLine();
        try(Scanner s = new Scanner(res);){
            if (sc.hasNextLine()) {

            }
            else
                throw new IllegalArgumentException("Non readable");
        }catch (StudentNotFoundException er){
            if (!isInn(res)){
                throw new BadName("Bad name: " + res, er);
            }
            else t.searchByInn(students, res);
        }*/
    }
}
