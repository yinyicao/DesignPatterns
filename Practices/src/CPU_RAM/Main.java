package CPU_RAM;

public class Main {
    public static void main(String[] args) {
        AbstractFactory mac = new MacFactory();
        CPU cpu = mac.getCPU();
        RAM ram = mac.getRAM();
        cpu.doSomething();
        ram.doSomeThing();
    }
}
