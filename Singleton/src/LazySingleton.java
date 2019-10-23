/**
 * @program: Design Patterns
 * @description: 懒汉式单例模式-双重检查锁定
 * @author: yyc
 * @create: 2019-10-23 18:47
 **/
public class LazySingleton {
    private volatile static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        // 第一重判断
        if (instance == null){
            // 锁定代码块
            synchronized (LazySingleton.class){
                // 第二重判断
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }
}
