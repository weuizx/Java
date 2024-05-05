public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1.123432, 2);
        ComplexNumber b = new ComplexNumber(1.123432, 2);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}