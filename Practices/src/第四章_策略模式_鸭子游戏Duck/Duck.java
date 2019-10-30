package 第四章_策略模式_鸭子游戏Duck;

public abstract class Duck {
    // 为行为接口类型声明两个引用变量， 所有鸭子子类（在同一个packge）都继承它们。
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void swim(){
        // 假设每个鸭子都会游泳
        System.out.println("游泳~~~~~~~~~~~");
    }
    public abstract  void display();// 假设每个鸭子的外观不一样，由子类去实现

    public void performFly(){
        flyBehavior.fly(); //委托给行为类
    }

    public void performQuack(){
        quackBehavior.quack(); // 委托给行为类
    }
}
