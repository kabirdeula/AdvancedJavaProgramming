interface InterfaceA {
    void method1();

    void method2();
}

public class MyClass implements InterfaceA {
    @Override
    public void method1() {
        System.out.println("Implementing method 1");
    }

    @Override
    public void method2() {
        System.out.println("Implementing method 2");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
    }
}