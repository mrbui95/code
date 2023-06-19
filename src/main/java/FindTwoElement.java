import java.util.Arrays;

public class FindTwoElement {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int repeat=0;
        int missing=0;

        //sort the array
        Arrays.sort(arr);
        int x=arr.length;

        for(int i=0;i<x;i++){
            //in sorted array 2 equal no comes one after another
            if(arr[i]==arr[i+1]){
                repeat=arr[i];
                break;
            }
        }
        int helper=0;
        //use xor property
        for(int i=0;i<x;i++){
            //xor helper, arr[i] with i+1 then 2 numbers are left one is repeat number and another is missing number
            helper^=arr[i]^(i+1);
            //helper=missing^repeat
            missing=helper^repeat;
        }

        int newArr[]=new int[2];
        newArr[0]=repeat;
        newArr[1]=missing;
        return newArr;
    }
}
