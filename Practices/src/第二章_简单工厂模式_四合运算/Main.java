package 第二章_简单工厂模式_四合运算;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = SimpleFactory.calculate("+");
        int result = calculate.getResult(10, 20);
        System.out.println("和为："+result);
        Calculate calculate1 = SimpleFactory.calculate("-");
        int result1 = calculate1.getResult(10, 20);
        System.out.println("差为："+result1);
    }
}
