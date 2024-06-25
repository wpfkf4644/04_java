package main.date.d0625.ch09.sec2.exam01;

public class AExample2 {
    public static void main(String[] args) {
        A2 a2 = new A2();
        A2.B b = a2.field1;
//        A.B b = new A.B();
        System.out.println(b);
        System.out.println(b.getField1());
//        System.out.println(a.field2);
    }
}
