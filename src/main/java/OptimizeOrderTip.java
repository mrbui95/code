import java.util.Arrays;

public class OptimizeOrderTip {
    long maxTip(int[] a, int[] b, int n, int x, int y) {
        // code here
        int [] dp= new int[n];
        int sum=0, sub=0;
        for(int i=0;i<n;i++){
            dp[i]=a[i]-b[i];
            sum+=a[i];
        }
        Arrays.sort(dp);
        int i=0;
        while(y>0 && dp[i]<=0){
            sub+=dp[i];
            i++;
            y--;
        }
        if(y>=0){
            if(n-x<=i) return sum-sub;
            while(n-x!=i){
                sub+=dp[i];
                i++;
            }
        }
        return sum-sub;
    }
}
