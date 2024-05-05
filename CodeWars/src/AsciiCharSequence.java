
public class AsciiCharSequence implements CharSequence {
    byte[] byteArray;
    AsciiCharSequence(byte[] arg) {
        int i = 0;
        for (byte b : arg) {
            i++;
        }
        byteArray = new byte[i];
        i = 0;
        for (byte b : arg) {
            byteArray[i] = b;
            i++;
        }
    }
    public int length() {
        int i =0;
        for(byte b : byteArray) {
            i++;
        }
        return i;
    }
    public char charAt(int i) {
        return (char) byteArray[i];
    }

    public String toString() {
        return new String(byteArray);
    }

    public CharSequence subSequence(int start, int end) {
        byte[] subSequence = new byte[end - start];
        int j = 0;
        for(int i = start; i < end; i++) {
            subSequence[j] = byteArray[i];
            j++;
        }
        return new AsciiCharSequence(subSequence);
    }
}