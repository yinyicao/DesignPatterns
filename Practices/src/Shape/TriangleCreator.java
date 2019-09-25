package Shape;

public class TriangleCreator implements Creator {
    @Override
    public void init() {

    }

    @Override
    public Shape create() {
        return new Triangle();
    }
}
