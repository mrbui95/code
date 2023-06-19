public class MinJumps {
    static int minJumps(int[] arr)
    {
        if(arr.length==0)
            return -1;
        if(arr[0]==0)
            return -1;
        int jumps=1;
        int Maxreach=arr[0];
        int steps=arr[0];
        int i=0;
        for(i=1;i<arr.length-1;i++)
        {
            if(i==arr.length-1)
                return jumps;
            Maxreach=Math.max(Maxreach,i+arr[i]);
            steps--;
            if(steps==0)
            {
                jumps++;
                if(i>=Maxreach)
                    return -1;
                steps=Maxreach-i;
            }
        }
        if(i>=arr.length-1)
            return jumps;
        else
            return -1;

    }
}
