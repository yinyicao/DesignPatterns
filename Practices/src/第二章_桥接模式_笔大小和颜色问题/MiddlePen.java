package 第二章_桥接模式_笔大小和颜色问题;

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
