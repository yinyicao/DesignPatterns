package 第二章_工厂方法模式_银行业务处理;

public class DepositFactory implements ProcessFactory {
    @Override
    public Process createProcess() {
        return new Deposit();
    }
}
