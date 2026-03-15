package Assignment4;

public class NumberOfOneBits {
    public static int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {
            count = count + (n & 1);   // check last bit
            n = n >>> 1;               // shift bits to right
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 11;   // binary of 11 = 1011

        int result = hammingWeight(n);

        System.out.println("Number of 1 bits: " + result);
    }
}
