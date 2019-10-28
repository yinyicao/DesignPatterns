package 第五章_观察者模式_多人对战游戏通知;


/**
 * @program: Design Patterns
 * @description: 抽象观察者类
 * @author: yyc
 * @create: 2019-10-28 19:09
 **/
public  interface AbstractObserver{

     String getName();

     void help(); // 声明支援队友的方法

    void beAttacked(AllyControlCenter acc); // 声明遭受攻击的方法
}
