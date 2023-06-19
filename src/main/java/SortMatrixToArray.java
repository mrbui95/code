import java.util.ArrayList;
import java.util.PriorityQueue;

public class SortMatrixToArray {
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K)
    {
        // Write your code here.
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i=0;i<K;i++)
            for(int j=0;j<K;j++)
                q.add(arr[i][j]);

        ArrayList<Integer> res = new ArrayList<>();
        int n = q.size();
        for(int i=0;i<n;i++)
            res.add(q.poll());

        return res;
    }
}
