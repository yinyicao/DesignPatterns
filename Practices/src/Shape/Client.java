package Shape;

public class Client {
    public static void main(String[] args) {
        Creator creator = new CircleCreator();
        creator.init();
        Shape shape = creator.create();

    }
}
