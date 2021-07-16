package main.java.tasks.day7.lambdas;

import main.java.tasks.day7.lambdas.IMyInterface;
import main.java.tasks.day7.lambdas.MyClass;

public class Runner {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(ClassX::new);
    }
}
