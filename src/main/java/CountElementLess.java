import java.util.ArrayList;
import java.util.Arrays;

public class CountElementLess {
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            int count = binarySearchCount(arr1[i], arr2);
            ans.add(count);
        }

        return ans;
    }

    public static int binarySearchCount(int num, int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid=left+(right-left)/2;
            if (num >= arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
