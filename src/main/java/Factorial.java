public class Factorial {
    public long[] factorial(long a[], int n) {
        // code here
        int mod = (int)1e9 + 7;
        int max = 0;

        for(long i : a) max = Math.max(max, (int)i);

        long dp[] = new long[max+1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= max; i++) dp[i]= (i*dp[i-1])%mod;

        long ans[] = new long[n];
        for(int i =0; i < n; i++){
            ans[i] = dp[(int)a[i]];
        }
        return ans;
    }
}
