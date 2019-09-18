package bankProcess;

public class DrawFactory implements ProcessFactory {
    @Override
    public Process createProcess() {
        return new DrawMoney();
    }
}
