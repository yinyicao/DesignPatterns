package 第五章_观察者模式_多人对战游戏通知;

import java.util.ArrayList;

/**
 * @program: Design Patterns
 * @description: 抽象目标类
 * @author: yyc
 * @create: 2019-10-28 19:16
 **/
public abstract class AllyControlCenter {
    private  String allyName;// 战队名称
    private ArrayList<AbstractObserver> players = new ArrayList<>(); //存储战队成员

    public AllyControlCenter(String allyName) {
        System.out.println(allyName+" 战队组建成功！");
        this.allyName = allyName;
    }

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public void join(AbstractObserver observer){
        System.out.println(observer.getName() +" 加入战队！");
        players.add(observer);
    }

    public void quit(AbstractObserver observer){
        System.out.println(observer.getName() +" 退出战队！");
        players.remove(observer);
    }

    /**
     * 实现通知方法
     * @param name 正在被攻击的队员名
     */
    public void notifyObservers(String name){
        System.out.println(this.allyName+"战队通知："+name+" 正在被攻击，请求支援！");
        // 遍历观察者集合，调用每一个队友（除自己）的支援方法
        players.forEach(player ->{
            if (! player.getName().equalsIgnoreCase(name)){
                player.help();
            }
        });
    }
}
