package pr_9;

public class BadName extends Exception{
    public BadName(String errorMessage){
        super("Bad name of INN " + errorMessage);
    }
}