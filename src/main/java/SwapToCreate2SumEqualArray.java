import java.util.Arrays;

public class SwapToCreate2SumEqualArray {
    boolean binarysearch(long[] arr, long t){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if(arr[mid]==t){
                return true;
            }
            else if(arr[mid]<t){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return false;
    }
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        // Your code goes here
        Arrays.sort(A);
        Arrays.sort(B);
        long s1 = 0;
        long s2= 0;
        for(int i=0; i<n; i++){
            s1 = s1+A[i];
        }
        for(int i=0; i<m; i++){
            s2 +=B[i];
        }
        if((s1+s2)%2!=0){
            return -1;
        }
        for(int i=0; i<n; i++){
            if((s2-s1)%2!=0){
                return -1;
            }
            else{
                long b = (s2-s1)/2+A[i];
                if(binarysearch(B,b)){
                    return 1;
                }
            }
        }
        return -1;

    }

}
