package two_two;

public class Client {
    public static void main(String[] args) {
        Rectangle r;
        r = new Square(0.0);

        r.setWidth(5.00);
        r.setHeight(10.00);
        double area = calculateArea(r);
        System.out.println(area);
        if (50.00 == area)
        {
            System.out.println("这是长方形或长方形的子类");

        }else{
            System.out.println("这不是长方形");
        }
    }

    public static double calculateArea(Rectangle r){
        return r.getHeight() * r.getWidth();
    }
}
