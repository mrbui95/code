import java.util.ArrayList;

public class ReverseInGroup {
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int size=n,z=0,j=0,i=0,temp=0;
        while(size>k)
        {
            j=k*z;
            i=(k*(++z))-1;
            while(i>j)
            {
                temp=arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
                i--;
                j++;
            }
            size=size-k;
        }
        j=k*z;i=n-1;
        if(n<k)
            j=0;i=n-1;
        while(i>j)
        {
            temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            j++;
            i--;
        }
    }
}
