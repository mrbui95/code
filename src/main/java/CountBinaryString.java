public class CountBinaryString {
    int mod = (int)(1e9) + 7;
    long countStrings(int n) {
        // code here
        Long[][] dp = new Long[n+1][2];
        return solve(n,0,dp)%mod;
    }
    long solve(int n, int prev, Long[][] dp){
        if(n<=0) return 1;

        if(dp[n][prev]!=null) return dp[n][prev];

        long inc = 0;
        long exc = 0;

        if(prev==1){
            inc = solve(n-1,0,dp);
        }else{
            inc = solve(n-1,0,dp);
            exc = solve(n-1,1,dp);
        }

        return dp[n][prev] = (inc+exc)%mod;
    }
}
