/**
 * 注意：两种实现方式都是用的这个Banner类
 * 推荐使用对象适配器方式
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    /**
     * 用括号将字符串括起来
     */
    public void showWithParen(){
        System.out.println("("+string+")");
    }

    /**
     * 用星号将字符串括起来
     */
    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
