public class MagicTriple {
    public int countTriplets(int[] nums){
        int fin=0;
        for(int i=0;i<nums.length;i++){
            int first=0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    first++;
                }
            }
            int second=0;
            for(int k=i+1;k<nums.length;k++){
                if(nums[i]<nums[k]){
                    second++;
                }
            }
            fin+=(first*second);
        }
        // code here
        return fin;
    }
}
