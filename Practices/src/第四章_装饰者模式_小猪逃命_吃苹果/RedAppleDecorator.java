package 第四章_装饰者模式_小猪逃命_吃苹果;

public class RedAppleDecorator extends AppleDecorator {
    public RedAppleDecorator(Pig pig) {
        super(pig);
    }

    @Override
    public void perform() {
        super.perform();
        System.out.print("加保护罩~~~~~~~"); //小猪吃绿苹果可以加保护罩
    }
}
