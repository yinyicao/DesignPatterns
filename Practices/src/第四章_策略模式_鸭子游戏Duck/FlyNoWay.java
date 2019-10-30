package 第四章_策略模式_鸭子游戏Duck;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        // 鸭子不会飞
        System.out.println("鸭子不会飞");
    }
}
