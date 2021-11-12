package pr_10_2;

public interface AbstractChairFactory {
    VictorianChair createVictorian();
    MagicChair createMagic();
    FunctionalChair createFunctional();
}
