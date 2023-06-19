import java.util.Arrays;

public class CountNumberSpecial {
    public int countSpecialNumbers(int N, int arr[]) {
        // Code here
        int mx = arr[0];
        for(int i=1;i<N;i++)mx=Math.max(arr[i],mx);
        int special[] = new int[mx+1];
        Arrays.fill(special,0);
        for(int i=0;i<N;i++){
            if(special[arr[i]]<2){
                for(int j=arr[i];j<=mx;j+=arr[i])special[j]++;
            }
        }
        int ans=0;
        for(int x:arr)if(special[x]>1)ans++;
        return ans;
    }
}
