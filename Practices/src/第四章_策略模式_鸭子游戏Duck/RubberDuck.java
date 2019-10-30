package 第四章_策略模式_鸭子游戏Duck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }
}
