package CPU_RAM;

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
