import java.util.HashMap;

public class SubArraySum0 {
    public static long findSubarray(long[] arr ,int n)
    {
        HashMap<Long,Integer> map = new HashMap<>();
        long count = 0;

        int i=-1;
        long sum=0;

        map.put((long)0,1);

        while(i<arr.length-1){
            i++;
            sum += arr[i];
            if(map.containsKey(sum)){
                count+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }

        return count;
    }
}
