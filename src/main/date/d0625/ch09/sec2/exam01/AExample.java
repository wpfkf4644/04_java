package main.date.d0625.ch09.sec2.exam01;

public class AExample {
    public static void main(String[] args) {
        A a = new A();
//        A.B b = new A.B();
//        System.out.println(a.field1);
//        System.out.println(a.field2);
        System.out.println(a.field2.getField1());
        System.out.println(a.field2.getField2());
    }
}
