package pr_10_2;

public class FunctionalChair implements Chair{
    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("You're sitting on the Functional Chair! " + "The sum is " + sum(10, 15));
    }
}
