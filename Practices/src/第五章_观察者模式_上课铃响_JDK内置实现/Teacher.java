package 第五章_观察者模式_上课铃响_JDK内置实现;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: Design Patterns
 * @description: 老师类，充当具体的观察者
 * @author: yyc
 * @create: 2019-10-28 20:12
 **/
public class Teacher implements Observer {
    private String name; // 老师的姓名...其它属性

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("老师 "+name+" 走进了教室！😊");
    }
}
