public class MinSwapToGetSubArrayLessThanK {
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int count = 0;
        int infav = 0;
        int minSwap = 0;
        for (int i = 0; i < n ; i++) {
            if(arr[i] <= k) {
                count++;
            }
        }

        //now we got count of total number of numbers which are less than or equal to k
        // we will iterate with count size sliding window

        for (int i = 0; i < count ; i++) {
            if(arr[i] > k) {
                infav++;
            }
        }
        minSwap = infav;
        for(int i = 0, j = count ; j < n ; i++,j++) {
            if (arr[i] > k) {
                infav--;
            }

            if(arr[j] > k) {
                infav++;
            }

            minSwap = Math.min(minSwap,infav);
        }
        return minSwap;
    }
}
