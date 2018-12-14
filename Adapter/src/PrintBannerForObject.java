public class PrintBannerForObject extends PrintForObject {
    private Banner banner;

    public PrintBannerForObject(String string) {
        this.banner = new Banner(string);
    }

    //实现PrintForObject中的方法
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
