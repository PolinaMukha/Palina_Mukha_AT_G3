package main.java.tasks.day4;

public class B extends A {
    public static void main(String[] args) {
        A a = new C();
        a.foo(5);

        A a1 = new A() {
            public int foo(int x) {
                super.foo(x);
                int y = x * 5;
                System.out.println(y);
                return y;
            }
        };
        a1.foo(5);
    }
}
