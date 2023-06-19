public class FindElementSplitArrToSumEqual {
    String equilibrium(int a[], int n) {
        // code here
        String y="YES";
        String N="NO";
        if(n==1) return y;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        int left=0;
        for(int i=0;i<n;i++){
            if(left==(sum-left-a[i]))
                return y;
            left+=a[i];
        }
        return N;

    }
}
