import java.util.HashMap;

public class FindSum3 {
    public static boolean find3Numbers(int A[], int n, int X) {
        for(int i=0;i<n-2;i++){
            int remSum = X-A[i];
            boolean ans = twoSum(remSum,i+1,n-1,A);
            if(ans)return true;
        }
        return false;

    }
    static boolean twoSum(int remSum,int start,int end,int[] A){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=start;i<end;i++){
            h.put(A[i],i);
        }
        for(int i=start;i<=end;i++){
            int r = remSum-A[i];
            if(h.containsKey(r) && h.get(r)!=i) return true;
        }
        return false;
    }
}
