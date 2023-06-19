public class TicketCounter {
    public static int distributeTicket(int N, int K) {
        int R = N % (2 * K);
        if (R == 0) {
            return N / 2 + 1;
        } else {
            int D = N / 2 / K;
            if (R >= K) {
                return (D + 1) * K + 1;
            } else {
                return D * K + R;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(distributeTicket(11 ,3));
    }
}
