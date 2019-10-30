package 第二章_桥接模式_笔大小和颜色问题;

/**
 * @program: Design Patterns
 * @description: LargePen
 * @author: yyc
 * @create: 2019-10-30 15:19
 **/
public class LargePen extends Pen {
    @Override
    public void print() {
        System.out.print("大型号的笔：");
        color.printColor();
    }
}
