package prac_15_16;

public final class Drink implements Item{
    private final int cost;
    private  final String name, description;
    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
        cost = 0;
    }
    public Drink(String name, String description, int cost) throws IllegalArgumentException{
        if (cost == 0 || name == "" || description == "")
            throw new IllegalArgumentException();
        else {
            this.name = name;
            this.description = description;
            this.cost = cost;
        }
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
