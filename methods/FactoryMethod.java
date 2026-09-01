public class FactoryMethod {

    static FactoryMethod createObject() {
        return new FactoryMethod();
    }

    void display() {
        System.out.println("Object created using factory method.");
    }

    public static void main(String[] args) {

        FactoryMethod obj = createObject();

        obj.display();
    }
}