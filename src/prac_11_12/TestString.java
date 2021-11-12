package prac_11_12;

public class TestString {
    public static void main(String[] args) {
        String[] shirt = new String[11];
        shirt[0] = "S001,Black Polo Shirt,Black,XL";
        shirt[1] = "S002,Black Polo Shirt,Black,L";
        shirt[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirt[3] = "S004,Blue Polo Shirt,Blue,M";
        shirt[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirt[5] = "S006,Black T-Shirt,Black,XL";
        shirt[6] = "S007,White TShirt,White,XL";
        shirt[7] = "S008,White T-Shirt,White,L";
        shirt[8] = "S009,Green T-Shirt,Green,S";
        shirt[9] = "S010,Orange T-Shirt,Orange,S";
        shirt[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirts = new Shirt[shirt.length];
        for(int i = 0; i < shirt.length; i++){
            shirts[i] = new Shirt(shirt[i]);
            System.out.println(shirts[i]);
        }
        System.out.println();
        System.out.println(new Number("88005553535"));
        System.out.println(new Number("+78005553535"));
        System.out.println(new Number("+1238005553535"));
        System.out.println(new Number("+118005553535"));
    }
}
