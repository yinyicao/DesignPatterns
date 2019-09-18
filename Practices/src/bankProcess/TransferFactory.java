package bankProcess;

public class TransferFactory implements ProcessFactory {
    @Override
    public Process createProcess() {
        return new Transfer();
    }
}
