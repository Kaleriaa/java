package prac_11_12;

public class Shirt {
    private String article, name, color, size;

    public Shirt(String s){
        String[] shirts = s.split(",");
        article = shirts[0];
        name = shirts[1];
        color = shirts[2];
        size = shirts[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "article='" + article + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
