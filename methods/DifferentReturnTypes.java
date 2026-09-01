public class DifferentReturnTypes {

    int getNumber() {
        return 10;
    }

    boolean getStatus() {
        return true;
    }

    char getCharacter() {
        return 'A';
    }

    String getMessage() {
        return "Hello Java";
    }

    public static void main(String[] args) {

        DifferentReturnTypes obj =
                new DifferentReturnTypes();

        System.out.println(obj.getNumber());
        System.out.println(obj.getStatus());
        System.out.println(obj.getCharacter());
        System.out.println(obj.getMessage());
    }
}