package Assignment;

public class DifferenceArray {
        public static void main(String[] args) {
            int[] arr = {10,5,20,40};
            int[] diff = new int[arr.length];

            diff[0] = arr[0];

            for(int i=1;i<arr.length;i++){
                diff[i] = arr[i] - arr[i-1];
            }

            for(int i: diff)
                System.out.print(i + " ");
        }
    }

