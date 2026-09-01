public class MethodToMethodCalling {

    void m1() {
        System.out.println("Inside m1()");
    }

    void m2() {
        System.out.println("Inside m2()");
        m1();
    }

    void m3() {
        System.out.println("Inside m3()");
        m2();
    }

    void m4() {
        System.out.println("Inside m4()");
        m3();
    }

    void m5() {
        System.out.println("Inside m5()");
        m4();
    }

    public static void main(String[] args) {

        MethodToMethodCalling obj =
                new MethodToMethodCalling();

        obj.m5();
    }
}