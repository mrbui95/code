import java.util.HashMap;

public class LongSubArrWithSumDivK {
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function



        HashMap<Integer, Integer> map  =  new HashMap<>();
        int sum = 0;
        int rem  = 0;
        int ans  = 0;
        // map.put(0, -1);
        for(int i=0;i<a.length; i++)
        {
            sum+=a[i];
            rem = sum%k;

            if(rem<0)
            {
                rem = k + rem;
            }

            if(rem==0)
            {
                ans=Math.max(ans,i+1);
            }

            if(map.containsKey(rem))
            {
                int length = i - map.get(rem);
                ans=Math.max(ans,length);
            }
            else{
                map.put(rem, i);
            }

        }

        return ans;

    }
}
