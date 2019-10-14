package 第四章_装饰者模式_小猪逃命_吃苹果;

public class GreenAppleDecorator extends AppleDecorator {

    public GreenAppleDecorator(Pig pig) {
        super(pig);
    }

    @Override
    public void perform() {
        super.perform();
        System.out.print("加快速度~~~~~~~~~");// 小猪吃绿苹果可以加快速度
    }
}
