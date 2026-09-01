public class PassingObjectAsParameter {

    static void display(PassingObjectAsParameter obj) {
        System.out.println("Object received as parameter.");
    }

    public static void main(String[] args) {

        PassingObjectAsParameter obj =
                new PassingObjectAsParameter();

        display(obj);
    }
}