package 第五章_观察者模式_上课铃响_JDK内置实现;

/**
 * @program: Design Patterns
 * @description: 测试类
 * @author: yyc
 * @create: 2019-10-28 20:17
 **/
public class Main {
    public static void main(String[] args) {
        Ring r = new Ring();
        Teacher teacher = new Teacher("张老师");
        Student s1,s2,s3,s4,s5,s6,s7,s8;
        s1 = new Student("同学1");
        s2 = new Student("同学2");
        s3 = new Student("同学3");
        s4 = new Student("同学4");
        s5 = new Student("同学5");
        s6 = new Student("同学6");
        s7 = new Student("同学7");
        s8 = new Student("同学8");

        r.addObserver(s8);
        r.addObserver(s7);
        r.addObserver(s6);
        r.addObserver(s5);
        r.addObserver(s4);
        r.addObserver(s3);
        r.addObserver(s2);
        r.addObserver(s1);

        r.addObserver(teacher);

        r.ring();// 上课铃响了
    }
}
