package Assignment;
import java.util.Arrays;
public class MergeSort {

        static void mergeSort(int[] arr){
            Arrays.sort(arr);
        }

        public static void main(String[] args){
            int[] arr={38,27,43,3,9,82,10};

            mergeSort(arr);

            for(int i:arr)
                System.out.print(i+" ");
        }
    }
