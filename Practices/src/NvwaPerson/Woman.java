package NvwaPerson;

public class Woman implements Person {


    @Override
    public void eat() {
        System.out.println("Woman:eat");
    }

    @Override
    public void doSomething() {
        System.out.println("Woman:doSomething");
    }
}
