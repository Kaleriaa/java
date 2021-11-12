package prac_11_12;

public class Number {
    private String code, city, triplet, quadruple;

    public Number(String phone){
        if(phone.startsWith("8")){
            code = "+7";
        }else{
            code = phone.substring(0, phone.length()-10);
        }
        city = phone.substring(phone.length()-10, phone.length()-7);
        triplet = phone.substring(phone.length()-7, phone.length()-4);
        quadruple = phone.substring(phone.length()-4);
    }

    @Override
    public String toString() {
        return "Number{" +
                "code='" + code + '\'' +
                ", city='" + city + '\'' +
                ", triplet='" + triplet + '\'' +
                ", quadruple='" + quadruple + '\'' +
                '}';
    }
}
