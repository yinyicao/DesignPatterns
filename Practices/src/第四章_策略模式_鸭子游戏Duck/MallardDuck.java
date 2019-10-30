package 第四章_策略模式_鸭子游戏Duck;


public class MallardDuck extends Duck{
    // 因为MallardDuck继承Duck类，所以MallardDuck类具有quackBehavior和flyBehavior实例变量。
    public MallardDuck(){
        // 绿头鸭使用Quack类处理嘎嘎叫，所以当performQuack() 被调用，就把责任委托给Quack对象进行真正的嘎嘎叫。
        quackBehavior = new Quack();
        //使用FlyWithWings作为其FlyBehavior类型。
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("绿头的鸭子~~~");
    }
}
