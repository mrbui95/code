import java.util.Arrays;

public class KLargestElement {
    int[] kLargest(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int[] arr2 = new int[k];
        int j=0;
        for(int i=n-1;i>=n-k;i--){
            arr2[j]=arr[i];
            j++;
        }
        return arr2;
    }
}
