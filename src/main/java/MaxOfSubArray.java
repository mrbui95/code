import java.util.ArrayList;

public class MaxOfSubArray {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        int max;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n-k+1;i++)
        {
            max=arr[i];
            for(int j=i;j<i+k;j++){
                if(max<arr[j] )
                    max=arr[j];
            }
            list.add(max);
        }
        return list;
    }
}
