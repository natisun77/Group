package homework.homeworks.tenth;

public class AsciiCharSequenceExample implements CharSequence {
    byte[] array;

    public AsciiCharSequenceExample(byte[] array) {
        this.array = array;
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        return (char) array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] subArray = new byte[end - start];
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = array[start];
            start++;
        }
        return new AsciiCharSequenceExample(subArray);
    }

    @Override
    public String toString() {
        return new String(array);
    }
}