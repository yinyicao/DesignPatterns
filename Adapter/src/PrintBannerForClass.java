public class PrintBannerForClass extends  Banner implements PrintForClass{


    public PrintBannerForClass(String string) {
        super(string);
    }

    //实现PrintForClass中的方法
    @Override
    public void printWeak() {
        super.showWithParen();
    }

    @Override
    public void printStrong() {
        super.showWithAster();
    }
}
