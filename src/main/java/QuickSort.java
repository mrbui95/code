public class QuickSort {
    static void swap(int[] arrNumber, int i, int j)
    {
        int temp = arrNumber[i];
        arrNumber[i] = arrNumber[j];
        arrNumber[j] = temp;
    }

    static int partition(int[] arrNumber, int l, int h)
    {
        int pivot = arrNumber[h];


        int i = (l - 1);

        for (int j = l; j <= h - 1; j++) {
            if (arrNumber[j] < pivot) {
                i++;
                swap(arrNumber, i, j);
            }
        }
        swap(arrNumber, i + 1, h);
        return (i + 1);
    }

    static void quickSort(int[] arrNumber, int l, int h)
    {
        if (l < h) {
            int pi = partition(arrNumber, l, h);

            quickSort(arrNumber, l, pi - 1);
            quickSort(arrNumber, pi + 1, h);
        }
    }

    public static void printArr(int[] arrNumber)
    {
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print(arrNumber[i] + " ");
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arrNumber = { 10, 7, 8, 9, 1, 5 };
        int N = arrNumber.length;

        // Function call
        quickSort(arrNumber, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arrNumber);
    }

}
