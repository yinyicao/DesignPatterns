package 第二章_桥接模式_笔大小和颜色问题;

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
