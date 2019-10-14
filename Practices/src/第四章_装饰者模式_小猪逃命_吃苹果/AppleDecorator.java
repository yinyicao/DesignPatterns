package 第四章_装饰者模式_小猪逃命_吃苹果;

public class AppleDecorator extends Pig {
    private Pig pig;

    public AppleDecorator(Pig pig) {
        this.pig = pig;
    }

    @Override
    public void perform() {
        pig.perform();//实现“猪”本有的行为
    }
}
