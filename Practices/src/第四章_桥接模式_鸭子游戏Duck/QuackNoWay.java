package 第四章_桥接模式_鸭子游戏Duck;

public class QuackNoWay implements QuackBehavior {
    @Override
    public void quack() {
        // 不会叫
        System.out.println("不会叫...");
    }
}
