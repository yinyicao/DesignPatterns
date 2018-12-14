public class Main {
    public static void main(String[] args) {
        //使用类适配器模式（继承）
        PrintForClass p = new PrintBannerForClass("Hello World!");
        p.printWeak();
        p.printStrong();
        System.out.println("-------------------split line----------------------");

        //使用对象适配器模式（委托）——推荐使用
        PrintForObject p1 = new PrintBannerForObject("Hello World!");
        p1.printWeak();
        p1.printStrong();
    }
}
