package 第三章_抽象工厂模式_计算机设备CPURAM创建;

public class PcFactory extends AbstractFactory {
    @Override
    public CPU getCPU() {
        return new pcCPU();
    }

    @Override
    public RAM getRAM() {
        return new pcRAM();
    }
}
