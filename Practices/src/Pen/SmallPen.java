package Pen;

/**
 * @program: Design Patterns
 * @description: SmallPen
 * @author: yyc
 * @create: 2019-10-30 14:52
 **/
public class SmallPen extends  Pen{
    @Override
    public void print() {
        System.out.print("小型号的笔：");
        color.printColor();
    }
}
