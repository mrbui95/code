import java.util.Arrays;

public class CountTriangle {
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        Arrays.sort(arr);
        int count = 0;

        for(int i=n-1;i>=2;i--)
        {
            int j = i-1;
            int k = 0;
            while(k<j)
            {
                if(arr[k]+arr[j]>arr[i])
                {
                    count+=(j-k);
                    j--;
                }
                else
                    k++;
            }
        }
        return count;
    }
}
