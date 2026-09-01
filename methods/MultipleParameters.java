import java.util.Scanner;

public class MultipleParameters {

    void m1(float f, String s) {
        System.out.println("Float: " + f);
        System.out.println("String: " + s);
    }

    static void m2(boolean b, long l) {
        System.out.println("Boolean: " + b);
        System.out.println("Long: " + l);
    }

    void m3(char c, int n) {
        System.out.println("Character: " + c);
        System.out.println("Integer: " + n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MultipleParameters obj = new MultipleParameters();

        System.out.print("Enter float and string: ");
        obj.m1(sc.nextFloat(), sc.next());

        System.out.print("Enter boolean and long: ");
        m2(sc.nextBoolean(), sc.nextLong());

        System.out.print("Enter character and integer: ");
        obj.m3(sc.next().charAt(0), sc.nextInt());

        sc.close();
    }
}