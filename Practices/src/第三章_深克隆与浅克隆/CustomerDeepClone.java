package 第三章_深克隆与浅克隆;

import java.io.*;
import java.util.Objects;

public class CustomerDeepClone  implements Serializable {
    private DeepAddress address = null;

    public CustomerDeepClone() {
        this.address = new DeepAddress();
    }

    //覆盖Object中的方法，实现深拷贝
    @Override
    protected Object clone() {

        Object obj = null;

        try {
            //将对象写入流中，本对象和对象中的所有成员对象都必须实现Serializable
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            //将对象从流中取出
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois =  new ObjectInputStream(bis);
            obj =   Objects.requireNonNull(ois).readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }


    public DeepAddress getAddress() {
        return address;
    }
}
