public class SticklerThief {
    //Function to find the maximum money the thief can get.
    public int alternate(int arr[],int n,int dp[]){
        if(n<0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=Math.max(alternate(arr,n-2,dp)+arr[n],alternate(arr,n-1,dp));
        return dp[n];
    }
    public int FindMaxSum(int arr[], int n)
    {
        int dp[]=new int[n];
        return alternate(arr,n-1,dp);
    }
}
