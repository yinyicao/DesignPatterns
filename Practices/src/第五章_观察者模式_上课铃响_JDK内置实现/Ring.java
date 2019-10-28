package 第五章_观察者模式_上课铃响_JDK内置实现;

import java.util.Observable;

/**
 * @program: Design Patterns
 * @description: 铃声类，充当具体的目标者
 * @author: yyc
 * @create: 2019-10-28 20:10
 **/
public class Ring extends Observable {


    public void ring(){
        System.out.println("🕑上课啦，铃声响了！大家准备教室了！");
        super.setChanged(); //使用java内置观察者，必须要setChanged();
        super.notifyObservers();
    }
}
