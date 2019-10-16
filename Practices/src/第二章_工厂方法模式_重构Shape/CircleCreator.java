package 第二章_工厂方法模式_重构Shape;

public class CircleCreator implements Creator {
    @Override
    public void init() {

    }

    @Override
    public Shape create() {
        return new Circle();
    }
}
