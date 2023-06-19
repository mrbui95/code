import java.util.Arrays;
import java.util.HashMap;

public class MinSwapToSort {
    public void swap(int [] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int[] a=nums.clone();  //clone means create copy of object for nums i.e a the values stored in a
        Arrays.sort(a);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],i);//index of array and its corresponds value

        }
        int swap=0,i=0;
        while(i<nums.length)
        {
            if(map.get(nums[i])==i)
            {
                i++;
            }
            else
            {
                swap(nums,i,map.get(nums[i]));
                swap++;
            }
        }
        return swap;

    }
}
