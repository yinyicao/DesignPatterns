package 第二章_桥接模式_笔大小和颜色问题;

public class RedColor implements  Color {
    @Override
    public void printColor() {
        System.out.println("This pen is red");
    }
}
