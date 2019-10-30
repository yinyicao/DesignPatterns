package 第二章_桥接模式_笔大小和颜色问题;

public abstract class Pen {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void print();
}
