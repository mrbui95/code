public class Sort2ArrAndFindKthElement {
    public static long kthElement(int A[], int B[], int N, int M, int K) {
        if (A.length <= B.length) {
            return findKthElement(A, B, K);
        } else {
            return findKthElement(B, A, K);
        }
    }

    private static int findKthElement(int[] Smaller, int[] Bigger, int K) {
        int First = 0;
        int Last = Smaller.length;
        while (First <= Last) {
            int Mid = (First + Last) / 2;

            int l1 = Mid - 1;
            int r1 = l1 + 1;
            int l2 = K - Mid - 1;
            int r2 = l2 + 1;

            int L1 = (l1 < 0) ? Integer.MIN_VALUE : (l1 >= Smaller.length) ? Integer.MAX_VALUE : Smaller[l1];
            int R1 = (r1 < 0) ? Integer.MIN_VALUE : (r1 >= Smaller.length) ? Integer.MAX_VALUE : Smaller[r1];
            int L2 = (l2 < 0) ? Integer.MIN_VALUE : (l2 >= Bigger.length) ? Integer.MAX_VALUE : Bigger[l2];
            int R2 = (r2 < 0) ? Integer.MIN_VALUE : (r2 >= Bigger.length) ? Integer.MAX_VALUE : Bigger[r2];

            if (L1 <= R2 && L2 <= R1) {
                return Math.max(L1, L2);
            } else if (!(L2 <= R1)) {
                First = Mid + 1;
            } else {
                Last = Mid - 1;
            }
        }
        return -1;
    }
}
