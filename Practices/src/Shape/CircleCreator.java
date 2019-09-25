package Shape;

public class CircleCreator implements Creator {
    @Override
    public void init() {

    }

    @Override
    public Shape create() {
        return new Circle();
    }
}
