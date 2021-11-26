package lab_15_16;

public class OrderAlreadyException extends Exception{
    public OrderAlreadyException(int num){
        super("The table " + num + " is added!");
    }
}
