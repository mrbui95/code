import java.util.Arrays;

public class Pythagore {
    boolean checkTriplet(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Fix one element as c and find the other two elements using two-pointer approach
        for (int i = n - 1; i >= 2; i--) {
            int a = 0; // left pointer
            int b = i - 1; // right pointer

            while (a < b) {
                // If a^2 + b^2 is equal to c^2, then a triplet is found
                if (arr[a] + arr[b] == arr[i]) {
                    return true;
                }

                // If the sum is less than c^2, move the left pointer to the right
                else if (arr[a] + arr[b] < arr[i]) {
                    a++;
                }

                // If the sum is greater than c^2, move the right pointer to the left
                else {
                    b--;
                }
            }
        }

        return false;
    }
}
