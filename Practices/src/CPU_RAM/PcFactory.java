package CPU_RAM;

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
