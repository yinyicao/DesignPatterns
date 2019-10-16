package 第二章_工厂方法模式_银行业务处理;

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
