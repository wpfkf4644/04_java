package main.date.d0625.ch09.sec2.exam01;

public class A {

    static class B {
        int field1 = 1;

        B() {

            System.out.println("B생성자");
        }
        int getField1() {
            return field1;
        }
        int getField2() {
            System.out.println(field2);
            return 0;
        }
    }

    B field1 = new B();

    static B field2 = new B();

    A() {
//        B b = new B();
        System.out.println("A생성자");
    }

    void method1() {
        B b = new B();
    }

    static void method2() {
        B b = new B();
    }
}
