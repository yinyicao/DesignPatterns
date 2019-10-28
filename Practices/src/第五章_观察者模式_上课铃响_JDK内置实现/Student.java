package 第五章_观察者模式_上课铃响_JDK内置实现;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: Design Patterns
 * @description: 学生类，充当具体的观察者
 * @author: yyc
 * @create: 2019-10-28 20:14
 **/
public class Student implements Observer {
    private String name; // 学生的姓名...其它属性

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("学生 "+name+" 跑进教室!😀");
    }
}
