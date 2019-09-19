package Pen;

public class Main {
    public static void main(String[] args) {
        BlackColor blackColor = new BlackColor();
        RedColor  redColor= new RedColor();
        SmallSize smallSize = new SmallSize();
        LargeSize largeSize = new LargeSize();
        MiddleSize middleSize = new MiddleSize();

        Pen pen = new BlackSmallPen(blackColor,smallSize);
        pen.print();
        System.out.println("----------------------------");

        pen = new RedSmallPen(redColor,smallSize);
        pen.print();

        System.out.println("----------------------------");
        pen = new BlackMiddlePen(blackColor,middleSize);
        pen.print();

        System.out.println("----------------------------");
        pen = new RedMiddlePen(redColor,middleSize);
        pen.print();

        System.out.println("----------------------------");
        pen = new BlackLargePen(blackColor,largeSize);
        pen.print();

        System.out.println("----------------------------");
        pen = new RedLargePen(redColor,largeSize);
        pen.print();

    }
}
