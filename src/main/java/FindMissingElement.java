import java.util.ArrayList;
import java.util.HashSet;

public class FindMissingElement {
    ArrayList<Long> findMissing(long a[], long b[], int m, int n)
    {

        ArrayList <Long> res = new ArrayList<>();
        HashSet<Long> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(b[i]);
        }
        for(int i=0;i<m;i++){
            if(!hs.contains(a[i])){
                res.add(a[i]);
            }
        }
        return res;
    }
}
