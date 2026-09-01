import java.util.Scanner;

public class StaticAndNonStaticMethods {

    void m1(String str) {
        System.out.println("Non-static method: " + str);
    }

    static void m2(int n) {
        System.out.println("Static method: " + n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StaticAndNonStaticMethods obj =
                new StaticAndNonStaticMethods();

        System.out.print("Enter a string: ");
        obj.m1(sc.next());

        System.out.print("Enter an integer: ");
        m2(sc.nextInt());

        sc.close();
    }
}