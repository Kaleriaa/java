package pr_9;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String errorMessage){
        super("Student " + errorMessage + " is not found");
    }
}
