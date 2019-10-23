/**
 * @program: Design Patterns
 * @description: 饿汉式单例模式
 * @author: yyc
 * @create: 2019-10-23 18:44
 **/
public class EagerSingleton {
    // 一个类型为自身的静态私有成员变量
    private static final EagerSingleton instance = new EagerSingleton();
    // 构造函数私有化
    private EagerSingleton(){

    }
    // 提供一个共有的静态方法工厂
    public static EagerSingleton getInstance(){
        return instance;
    }
}
