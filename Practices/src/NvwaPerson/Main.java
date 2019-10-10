package NvwaPerson;

public class Main {
    public static void main(String[] args) {
        Person m = Nvwa.createPerson("M");
        m.eat();
        m.doSomething();

        Person w = Nvwa.createPerson("W");
        w.eat();
        w.doSomething();

        Person r = Nvwa.createPerson("R");
        r.eat();
        r.doSomething();
    }
}
