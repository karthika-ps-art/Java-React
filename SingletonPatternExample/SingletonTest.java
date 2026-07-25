package SingletonPatternExample;

public class SingletonTest {
    public static void main(String[] args)
    {
        Logger l1=Logger.getInstance();
        l1.log("Application start");
        Logger l2=Logger.getInstance();
        l2.log("User Logged in");
        System.out.println(l1==l2);
        Logger l3=Logger.getInstance();
        System.out.println(l1 == l3);
    }
}
