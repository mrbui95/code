import java.util.Arrays;

public class Sum2ElementClosetTo0 {
    public static int closestToZero (int arr[], int n)
    {
        Arrays.sort(arr);
        int ans=-1;
        int i=0;int j=n-1;
        int d=Integer.MAX_VALUE;
        while(i<j){
            if(arr[i]+arr[j]>=0){
                if(d>=Math.abs(arr[i]+arr[j]-0)){ans=(arr[i]+arr[j]-0);
                    d=Math.abs(ans-0);
                }
                j--;
            }
            else{
                if(d>Math.abs(arr[i]+arr[j]-0)){ans=(arr[i]+arr[j]-0);
                    d=Math.abs(ans-0);
                }
                i++;
            }
        }
        return ans;
    }
}
