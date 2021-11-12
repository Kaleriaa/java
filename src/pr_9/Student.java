package pr_9;

import java.util.List;
import java.util.stream.Collectors;

public class Student implements Comparable{
    private String firstname, surname, inn;
    public Student (String firstname, String surname, String inn){
        this.firstname = firstname;
        this.surname = surname;
        this.inn = inn;
    }
    public Student(){}

    public String getFirstname() {
        return firstname;
    }
    public String getSurname() {
        return surname;
    }
    public String getInn(){ return inn; }
    public boolean equals(Object o){
        return (firstname.equals(((Student)o).getFirstname()) && surname.equals(((Student)o).getSurname()));
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }

    /*public void search(List<Student> list, Student target){
        List<Student> find = list
                .stream()
                .filter(test -> ((test.getFirstname() == target.getFirstname()) && (test.getSurname() == target.getSurname())))
                .collect(Collectors.toList());
        System.out.println(find);
    }

    public void searchByInn(List<Student> list, String target){
        List<Student> find = list
                .stream()
                .filter(test -> ((test.inn.equals(target)) && (test.inn.equals(target))))
                .collect(Collectors.toList());
        //System.out.println(find);
    }*/

    @Override
    public int compareTo(Object o) {
        int res;
        String oFirst = ((Student)o).getFirstname();
        String oSur = ((Student)o).getSurname();
        if (surname.equals(oSur))
            res = firstname.compareTo(oFirst);
        else res = surname.compareTo(oSur);
        return res;
    }
}
