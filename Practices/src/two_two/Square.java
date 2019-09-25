package two_two;

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
