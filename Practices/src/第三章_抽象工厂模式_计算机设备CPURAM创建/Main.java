package 第三章_抽象工厂模式_计算机设备CPURAM创建;

public class Main {
    public static void main(String[] args) {
        AbstractFactory mac = new MacFactory();
        CPU cpu = mac.getCPU();
        RAM ram = mac.getRAM();
        cpu.doSomething();
        ram.doSomeThing();
    }
}
