package 第四章_桥接模式_鸭子游戏Duck;

public class CottonDuck extends Duck {

    public CottonDuck() {
        quackBehavior = new QuackNoWay();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("棉花鸭");
    }
}
