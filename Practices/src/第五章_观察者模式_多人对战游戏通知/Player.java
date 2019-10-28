package 第五章_观察者模式_多人对战游戏通知;

/**
 * @program: Design Patterns
 * @description: 具体观察者角色
 * @author: yyc
 * @create: 2019-10-28 18:36
 **/
public class Player implements AbstractObserver {

    private String name; //玩家名称

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void help() {
        System.out.println(name+" 正在支援的路上！");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(name+" 正在被攻击！");
        acc.notifyObservers(name);
    }
}
