package pr_10_2;

public class VictorianChair implements Chair{
    private int age;

    public int getAge() {
        return age;
    }
    public VictorianChair(int age){
        this.age = age;
    }

    @Override
    public void sit() {
        System.out.println("You're sitting on the Victorian Chair! " + "The age is " + getAge());
    }
}
