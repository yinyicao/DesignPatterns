package Duck;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        // 实现鸭子呱呱叫
        System.out.println("呱呱呱呱呱呱~~~~");
    }
}
