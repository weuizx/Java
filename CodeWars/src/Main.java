public class Main {
    public static void main(String[] args) {
        byte[] arr = {101, 102, 103, 104, 105};
        AsciiCharSequence str = new AsciiCharSequence(arr);
        System.out.println(str);
        System.out.println(str.charAt(1));
        System.out.println(str.length());
        System.out.println(str.toString());
        System.out.println(str.subSequence(1,3));
    }
}