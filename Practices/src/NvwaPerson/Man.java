package NvwaPerson;

public class Man implements Person {
    @Override
    public void eat() {
        System.out.println("Man:eat");
    }

    @Override
    public void doSomething() {
        System.out.println("Man:doSomething");
    }
}
