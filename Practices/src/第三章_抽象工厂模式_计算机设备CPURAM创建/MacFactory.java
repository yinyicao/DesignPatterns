package 第三章_抽象工厂模式_计算机设备CPURAM创建;

public class MacFactory extends AbstractFactory {
    @Override
    public CPU getCPU() {
        return new macCPU();
    }

    @Override
    public RAM getRAM() {
        return new macRAM();
    }
}
