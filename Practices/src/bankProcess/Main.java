package bankProcess;

/**
 * 工厂模式的应用
 */
public class Main {
    public static void main(String[] args) {
        ProcessFactory processFactory = new DepositFactory();
        Process pr = processFactory.createProcess();
        pr.process();
    }
}
