package 第四章_桥接模式_鸭子游戏Duck;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        // 发出橡皮与空气摩擦的声音
        System.out.println("发出橡皮与空气摩擦的声音~~~~~~~~~");
    }
}
