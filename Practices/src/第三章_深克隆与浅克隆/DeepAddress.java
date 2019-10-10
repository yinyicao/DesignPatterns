package 第三章_深克隆与浅克隆;

import java.io.Serializable;

public class DeepAddress implements Serializable {
    private  String addr;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
