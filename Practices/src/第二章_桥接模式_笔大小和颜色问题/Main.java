package 第二章_桥接模式_笔大小和颜色问题;

public class Main {
    public static void main(String[] args) {
        Color blackColor,redColor;
        blackColor= new BlackColor();
        redColor= new RedColor();

        Pen p1,p2,p3;
        p1= new SmallPen();
        p1.setColor(blackColor);
        p1.print();

        p2= new MiddlePen();
        p2.setColor(redColor);
        p2.print();

        p3= new LargePen();
        p3.setColor(blackColor);
        p3.print();


    }
}
