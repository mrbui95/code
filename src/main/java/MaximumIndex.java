public class MaximumIndex {
    int maxIndexDiff(int arr[], int n) {
        int max = 0;
        int i = 0;
        int j = n-1;

        while(i<j){
            if(arr[i]<=arr[j]){
                max = Math.max(max,j-i);
                i++;
                j = n-1;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
