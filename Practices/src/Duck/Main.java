package Duck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        //这会调用MallardDuck继承来的performFly() ，进而委托给该对象的QuackBehavior对象处理。
        duck.performFly();
        duck.performQuack();

        //
        duck.display();

        duck.swim();

    }
}
