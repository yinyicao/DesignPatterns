package 第二章_工厂方法模式_银行业务处理;

public class Deposit implements Process{
    @Override
    public void process() {
        System.out.println("存钱...");
    }
}
