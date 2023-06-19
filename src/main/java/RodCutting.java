import java.util.Arrays;

public class RodCutting {
    public int cutRod(int price[], int n) {
        //code here
        int weight=n;
        int[][] dp = new int[n+1][n+1];
        for(int[] it:dp)
        {
            Arrays.fill(it,-1);
        }
        return solve(n-1,price,weight,dp);
    }
    public int solve(int idx,int[] a,int w,int[][] dp)
    {
        if(idx==0)return a[0]*w;
        if(dp[idx][w]!=-1)return dp[idx][w];
        int take=0;
        int not=0+solve(idx-1,a,w,dp);
        if(w>=idx+1){
            take=a[idx]+solve(idx,a,w-(idx+1),dp);
        }

        return dp[idx][w]=Math.max(not,take);
    }
}
