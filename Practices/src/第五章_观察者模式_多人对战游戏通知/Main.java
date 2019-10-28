package 第五章_观察者模式_多人对战游戏通知;

/**
 * @program: Design Patterns
 * @description: 测试类
 * @author: yyc
 * @create: 2019-10-28 18:58
 **/
public class Main {
    public static void main(String[] args) {
        AllyControlCenter acc = new ConcreteAllyControlCenter("RNG");
        Player player1,player2,player3;
        player1 = new Player("队员1");
        player2 = new Player("队员2");
        player3 = new Player("队员3");

        acc.join(player1);
        acc.join(player2);
        acc.join(player3);

        player1.beAttacked(acc);
    }
}
