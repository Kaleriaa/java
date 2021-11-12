package pr_10_2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorian() {
        return new VictorianChair(10);
    }

    @Override
    public MagicChair createMagic() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctional() {
        return new FunctionalChair();
    }
}
