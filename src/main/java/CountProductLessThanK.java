public class CountProductLessThanK {
    public int countSubArrayProductLessThanK(long a[], int n, long k) {
        int l = 0, r = 0;
        long product = 1;
        int count = 0;
        while(r < n) {
            product *= a[r];

            while(l < n && product >= k) {
                product /= a[l];
                l++;
            }
            if(product < k)
                count += r-l+1;
            r++;
        }
        return count;
    }

}
