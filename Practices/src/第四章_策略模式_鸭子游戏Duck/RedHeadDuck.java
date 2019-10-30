package 第四章_策略模式_鸭子游戏Duck;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("红头的鸭子~~~");
    }
}
