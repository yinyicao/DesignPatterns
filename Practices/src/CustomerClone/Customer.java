package CustomerClone;

public class Customer implements Cloneable {
    private Address address = null;
    public Customer(){
        this.address = new Address();
    }

    //覆盖Object中的方法，实现浅拷贝
    @Override
    public Object clone(){
        Object objc= null;
        try {
            objc = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return objc;
    }

    public  Address getAddress(){
        return address;
    }
}
