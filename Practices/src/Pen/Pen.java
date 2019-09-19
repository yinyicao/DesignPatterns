package Pen;

public abstract class Pen {
    public Color color;
    public Size  size;
    public void print(){
        color.printColor();
        size.printSize();
    }
}
