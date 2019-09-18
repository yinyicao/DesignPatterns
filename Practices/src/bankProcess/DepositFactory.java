package bankProcess;

public class DepositFactory implements ProcessFactory {
    @Override
    public Process createProcess() {
        return new Deposit();
    }
}
