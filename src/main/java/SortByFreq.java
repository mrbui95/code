import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class SortByFreq {
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int m=0;
        for (int i=0;i<n;i++)
            if (map.containsKey(arr[i]))map.put(arr[i],map.get(arr[i])+1);
            else {
                map.put(arr[i], 1);
                arr[m]=arr[i];m++;
            }
        int h=0;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i=0;i<m;i++){
            ans.add(new ArrayList<>());
            int z=map.get(arr[i]);
            for (int j=0;j<z;j++){
                ans.get(h).add(arr[i]);
            }h++;
        }
        Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
                if (list1.size() != list2.size()) {
                    return list2.size() - list1.size();
                } else {
                    for (int i = 0; i < list1.size(); i++) {
                        if (list1.get(i) != list2.get(i)) {
                            return list1.get(i) - list2.get(i);
                        }
                    }
                    return 0;
                }
            }
        });
        ArrayList<Integer> fin = new ArrayList<>();
        for (int i=0;i<h;i++){int k=ans.get(i).size();
            for (int j=0;j<k;j++){
                fin.add(ans.get(i).get(j));
            }
        }
        return fin;


    }
}
