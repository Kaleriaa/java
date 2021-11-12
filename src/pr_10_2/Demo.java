package pr_10_2;

public class Demo {
    public static Client config() {
        Client client = null;
        Chair ch;
        String chairName = "Victorian";
        if (chairName == "Magic") {
            ch = new ChairFactory().createMagic();
            client = new Client(ch);
        }
        else if (chairName == "Victorian"){
            ch = new ChairFactory().createVictorian();
            client = new Client(ch);
        }
        else {
            ch = new ChairFactory().createFunctional();
            client = new Client(ch);
        }
        return client;
    }

    public static void main(String[] args) {
       Client cl = config();
       cl.sit();
    }
}
