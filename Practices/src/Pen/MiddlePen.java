package Pen;

/**
 * @program: Design Patterns
 * @description: MiddlePen
 * @author: yyc
 * @create: 2019-10-30 15:18
 **/
public class MiddlePen extends Pen {
    @Override
    public void print() {
        System.out.print("中型号的笔：");
        color.printColor();
    }
}
