package main.date.d0625.ch09.sec2.exam01;

public class A2 {

    class B {
        int field1 = 1;

        B() {

            System.out.println("B생성자2");
        }
        int getField1() {
            return field1;
        }
    }

    B field1 = new B();

    A2() {
//        B b = new B();
        System.out.println("A생성자2");
    }

    void method1() {
        B b = new B();
    }

}
