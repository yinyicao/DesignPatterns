package 第二章_工厂方法模式_银行业务处理;

public class DrawMoney implements  Process {
    @Override
    public void process() {
        System.out.println("取钱...");
    }
}
