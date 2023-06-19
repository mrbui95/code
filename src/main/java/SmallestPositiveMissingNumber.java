public class SmallestPositiveMissingNumber {
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int i = 0;
        while(i<size){
            if(arr[i]>0 && arr[i]<size+1 && arr[i]!=arr[arr[i]-1]){
                int x = arr[i]-1;
                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
            }else{
                i++;
            }
        }

        for(int j = 0;j<size;j++){
            if(arr[j]!=(j+1)){
                return j+1;
            }
        }
        return size+1;
    }
}
