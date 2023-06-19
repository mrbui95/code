import java.util.Arrays;

public class FindPlatform {
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=1,j=0,result=1,minPlatform=1;

        while(i<n && j< n)
        {
            if(arr[i]<=dep[j])
            {
                minPlatform++;
                i++;
            }
            else if(arr[i]> dep[j])
            {
                j++;
                minPlatform--;
            }
            result= Math.max(result,minPlatform);
        }

        return result;
    }
}
