package pr_9;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class labUI extends JFrame {

    List<Student> students = new ArrayList<>();
    JTextField bigField, field, fieldInn;

    public labUI(List<Student> students){
        super("Студенты");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
//        pack();
//        setLocationRelativeTo(null);

        this.students = students;
        JPanel pn = new JPanel(new GridLayout(2,3));//new FlowLayout());
        JButton findStudentBtn = new JButton("Найти студента по ФИО");
        JButton findByInn = new JButton("Найти студента по ИНН");

        findStudentBtn.addActionListener(e->{
            try{
                findBtnClicked();
            }catch (StudentNotFoundException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });
        findByInn.addActionListener(e->{
            try{
                findByInn();
            }catch (StudentNotFoundException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }catch (BadName ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        pn.add(findStudentBtn);
        pn.add(findByInn);
        //test();
        getContentPane().add(pn, BorderLayout.CENTER);

        setVisible(true);
    }

    private void findBtnClicked() throws StudentNotFoundException {
        String s = JOptionPane.showInputDialog("Введите ФИО");
        String[] word = s.split(" ");

        for (int i = 0; i < students.size(); i++) {
            if ((students.get(i).getFirstname().equals(word[0])) && (students.get(i).getSurname().equals(word[1]))) {
                JOptionPane.showMessageDialog(this, "Найден студент: " + students.get(i));
                return;
            }
        }
        throw new StudentNotFoundException(s);
    }
    private void findByInn() throws StudentNotFoundException, BadName {
        String s = JOptionPane.showInputDialog("Введите ИНН");
        if (isInn(s) == false){
            throw new BadName(s);
        }
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getInn().equals(s)) {
                    JOptionPane.showMessageDialog(this, "Найден студент: " +
                            students.get(i));
                    return;
                }
            }
            throw new StudentNotFoundException(s);
    }
    /*public List<Student> searchByInn(List<Student> list, String target){
        List<Student> find = list
                .stream()
                .filter(test -> ((test.getInn() == target))
                .collect(Collectors.toList());
        return find;
    }*/
    public static boolean isInn(String in){
        if (in.length() == 6)
            return true;
        else
            return false;
    }
    public static boolean isSpace(String a){
        String[] space = a.split(" ");
        if (space[0] == a)
            return false;
        else return true;
    }

    public void test () {
        String str = "John Smith";
        String[] s = str.split(" ");
        for (int i = 0; i < students.size(); i++) {
            if ((students.get(i).getFirstname().equals(s[0])) && (students.get(i).getSurname().equals(s[1]))) {
                System.out.println(students.get(i));
            }
        }
    }

    public List<Student> search(List<Student> list, String name, String sur){
        List<Student> find = list
                .stream()
                .filter(test -> ((test.getFirstname() == name) && (test.getSurname() == sur)))
                .collect(Collectors.toList());
        System.out.println(find);
        return find;
        /*StringBuilder strbul=new StringBuilder();
        for( String str : find){
            strbul.append(str);
            strbul.append(" ");
        }
        String str=strbul.toString();*/
    }
}
