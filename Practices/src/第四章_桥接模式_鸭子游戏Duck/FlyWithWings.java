package 第四章_桥接模式_鸭子游戏Duck;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        // 实现鸭子飞行
        System.out.println("用翅膀飞~~~");
    }
}
