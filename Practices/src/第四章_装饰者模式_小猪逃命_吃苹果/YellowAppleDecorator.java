package 第四章_装饰者模式_小猪逃命_吃苹果;

public class YellowAppleDecorator extends AppleDecorator {
    public YellowAppleDecorator(Pig pig) {
        super(pig);
    }

    @Override
    public void perform() {
        super.perform();
        System.out.print("小猪趟水跑~~~~~~~~~");// 小猪吃黄苹果可以趟水跑
    }
}
