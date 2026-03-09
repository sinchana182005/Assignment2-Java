package Assignment;

public class FirstLastccurance {
        public static void main(String[] args) {
            int[] arr = {1,2,2,2,3,4};
            int x = 2;

            int first=-1,last=-1;

            for(int i=0;i<arr.length;i++){
                if(arr[i]==x){
                    if(first==-1)
                        first=i;
                    last=i;
                }
            }

            System.out.println("First: "+first);
            System.out.println("Last: "+last);
        }
    }
