package pr_10_2;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("Do Magic!");
    }

    @Override
    public void sit() {
        System.out.println("You're sitting on the Magic Chair!");
        doMagic();
    }
}
