package 第二章_工厂方法模式_重构Shape;

public class Client {
    public static void main(String[] args) {
        Creator creator = new CircleCreator();
        creator.init();
        Shape shape = creator.create();

    }
}
