import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    String printLargest(String[] arr) {
        Arrays.sort(arr,new Comparator<String>(){

            public int compare(String x, String y){
                String xy = x+y;
                String yx = y+x;
                return yx.compareTo(xy);
            }
        });
        String ans = "";
        for(int i=0; i<arr.length; i++)
            ans += arr[i];
        return ans;
    }
}
