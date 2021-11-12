package pr_10_2;
import pr_10_2.Chair;

public class Client {
    public Chair chair;

    public void sit(){
        chair.sit();
    }
    public Client(Chair chair){
        this.chair = chair;
    }
}
