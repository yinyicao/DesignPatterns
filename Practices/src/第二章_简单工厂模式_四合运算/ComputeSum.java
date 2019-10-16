package 第二章_简单工厂模式_四合运算;

public class ComputeSum implements Calculate {
    @Override
    public int getResult(int num1, int num2) {
        return num1 + num2;
    }
}
