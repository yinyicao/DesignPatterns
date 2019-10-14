package 第四章_装饰者模式_小猪逃命_吃苹果;

public class Main {
    public static void main(String[] args) {
        Pig pig = new RedAppleDecorator(new GreenAppleDecorator(new YellowAppleDecorator(new SmallPig())));
        pig.perform();
    }
}
