public class TrappingWater {
    static long trappingWater(int arr[], int n) {

        int left=0;
        int right=n-1;
        int leftmax=0;
        int rightmax=0;
        long water=0;
        while(left<=right){
            if(leftmax<rightmax){
                water+=Math.max(0,leftmax-arr[left]);
                leftmax=Math.max(leftmax,arr[left]);
                left++;
            }
            else{
                water+=Math.max(0,rightmax-arr[right]);
                rightmax=Math.max(rightmax,arr[right]);
                right--;
            }
        }
        return water;
    }
}
