import java.util.Arrays;

public class Find2NumberMinSum {
    String solve(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer();
        int count =0;
        int i =n-1;
        int j = n-2;
        while(i>=0)
        {
            int temp =0;
            if(i==0)
            {
                temp = arr[i]+count;
            }
            else
                temp = arr[i]+arr[j]+count;
            sb.append(temp%10);
            count = temp/10;
            i=i-2;
            j=j-2;
        }
        int index =sb.length()-1;
        while(index >=0 &&sb.charAt(index)=='0')
        {
            sb.delete(index, index+1);
            index--;
        }
        if(count !=0)
            sb.append(count);
        sb.reverse();
        if(sb.length()==0)
            sb.append(0);
        return sb.toString();


    }
}
