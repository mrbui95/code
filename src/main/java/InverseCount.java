public class InverseCount {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N){
        long[] temp=new long[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }

        return sort(arr, 0, arr.length-1, temp);
    }


    static long sort(long[] arr, int low, int high, long[] temp){
        long count=0;

        if(low<high){
            int mid=(low+high)/2;

            count+=sort(arr, low, mid, temp);
            count+=sort(arr, mid+1, high, temp);

            count+=merge(arr, low, mid, high, temp);
        }

        return count;
    }


    static long merge(long[] arr, int low, int mid, int high, long[] temp){
        long count=0;

        int i=low;
        int j=mid+1;
        int k=low;
        while(i<=mid && j<=high){
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            }
            else{
                arr[k]=temp[j];
                j++;
                count+=mid-i+1;
            }
            k++;
        }
        while(i<=mid){
            arr[k]=temp[i];
            i++;
            k++;
        }
        while(j<=high){
            arr[k]=temp[j];
            j++;
            k++;
        }

        for(int q=low;q<=high;q++){
            temp[q]=arr[q];
        }

        return count;
    }
}
