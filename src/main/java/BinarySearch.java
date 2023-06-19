public class BinarySearch {
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
