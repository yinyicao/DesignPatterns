package bankProcess;

public class Deposit implements Process{
    @Override
    public void process() {
        System.out.println("存钱...");
    }
}
