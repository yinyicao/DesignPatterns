package 第一章_多态的理解;


/**
 * 根据 Java 多态机制，继承链中对象方法的调用存在一个优先级:
 * <p>
 * this.method(O) ->
 * super.method(O) ->
 * this.method((super)O) ->
 * super.method((super)O)
 * <p>
 *  https://www.jianshu.com/p/976eec24d9d7
 * 先根据优先级确定目标方法，然后根据下面的规则来决定调用子类还是超类的成员方法。
 * 多态机制遵循的规则：当超类对象引用变量引用子类对象时，被引用对象的类型（而不是引用变量的类型）
 * 决定了调用谁的成员方法，但是这个被调用的方法必须是在超类中定义（子类覆写父类）过的。
 */
class A {
    public String show(D obj) {
        return "A and D";
    }

    public String show(A obj) {
        return "A and A";
    }
}

class B extends A {
    public String show(A obj) {
        return "B and A";
    }

    public String show(B ojb) {
        return "B and B";
    }

}

class C extends B {
}

class D extends B {
}

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println(a1.show(a1)); // A and A
        System.out.println(a1.show(a2)); // A and A
        System.out.println(a1.show(b)); // A and A
        System.out.println(a1.show(c)); // A and A
        System.out.println(a1.show(d)); // A and D
        System.out.println("--------------------------------");

        System.out.println(a2.show(a1)); // B and A
        System.out.println(a2.show(a2)); // B and A

        //这里来个例子说明：a2.show(b)，根据优先级第一级在 A 中找不到 show(B) ,所以进入第二级。
        //因为 A 除了 Object 之外没有父类且 Object 中肯定没有 show 方法，所以进入第三级 。
        //根据第三级在 A 中找到了 show(A) ，然后根据多态机制规则由于子类 B 重写了 show(A) 方法，
        // 所以最终调用的是 B.show(a) ，得到结果是 " B and A "。
        System.out.println(a2.show(b)); // B and A
        System.out.println(a2.show(c)); // B and A
        System.out.println(a2.show(d)); // A and D
        System.out.println("--------------------------------");

        System.out.println(b.show(a1)); // B and A
        System.out.println(b.show(a2)); // B and A
        System.out.println(b.show(b)); // B and B
        System.out.println(b.show(c)); // B and B
        System.out.println(b.show(d)); // A and D
    }
}
