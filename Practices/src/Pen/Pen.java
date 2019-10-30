package Pen;

public abstract class Pen {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void print();
}
