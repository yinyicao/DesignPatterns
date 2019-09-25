package Shape;

public class RectangleCreator implements Creator {
    @Override
    public void init() {

    }

    @Override
    public Shape create() {
        return new Rectangle();
    }
}
