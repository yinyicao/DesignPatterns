package 第四章_策略模式_鸭子游戏Duck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        //这会调用MallardDuck继承来的performFly() ，进而委托给该对象的QuackBehavior对象处理。
        duck.performFly();
        duck.performQuack();
        duck.display();
        duck.swim();
        System.out.println("___________________");
        Duck duck2 = new RedHeadDuck();

        duck2.performFly();
        duck2.performQuack();
        duck2.display();
        duck2.swim();
        System.out.println("___________________");
        Duck duck3 = new CottonDuck();

        duck3.performFly();
        duck3.performQuack();
        duck3.display();
        duck3.swim();
        System.out.println("___________________");
        Duck duck4 = new RubberDuck();

        duck4.performFly();
        duck4.performQuack();
        duck4.display();
        duck4.swim();
        System.out.println("___________________");

    }
}
