package 第四章_桥接模式_鸭子游戏Duck;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        // 实现鸭子嘎嘎叫
        System.out.println("嘎嘎嘎嘎嘎~~~~");
    }
}
