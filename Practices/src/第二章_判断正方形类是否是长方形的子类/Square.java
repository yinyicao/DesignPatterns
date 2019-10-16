package 第二章_判断正方形类是否是长方形的子类;

public class Square extends Rectangle {  //正方形
    public Square(double size) {
        super(size,size);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}
