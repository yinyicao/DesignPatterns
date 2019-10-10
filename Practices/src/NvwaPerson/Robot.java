package NvwaPerson;

public class Robot implements Person {
    @Override
    public void eat() {
        System.out.println("Robot:eat");
    }

    @Override
    public void doSomething() {
        System.out.println("Robot:doSomething");
    }
}
