public class Kadane {
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous sub array with maximum sum.
    public static long maxSubArraySum(int arr[], int n){

        long currSum=0;
        long maxSum =Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++){
            currSum += arr[i];

            if(currSum > maxSum){
                maxSum = currSum;
            }

            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void printArr(int[] arrNumber)
    {
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print(arrNumber[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arrNumber = { 10, 7, -2, 8, -15, 9, 1, 5, -3, 2 };
        int N = arrNumber.length;

        long max = maxSubArraySum(arrNumber, N);

        System.out.println("MAX: " + max);
    }
}
