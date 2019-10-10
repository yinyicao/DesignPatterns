package 第三章_简单工厂模式_女娲造人;

public class Robot implements Person {
    @Override
    public void eat() {
        System.out.println("Robot:eat");
    }

    @Override
    public void doSomething() {
        System.out.println("Robot:doSomething");
    }
}
