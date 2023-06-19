public class RowMax1 {
    int rowWithMax1s(int arr[][], int r, int c) {

        int max = findFirst(arr[0],0,c-1);
        int maxOneRow = 0;
        if(max==0) return 0;
        //System.out.println("runs");
        for(int i = 1;i<arr.length;i++){
            if(max>0 && arr[i][max-1]==1){
                int get = findFirst(arr[i],0,max-1);
                max = get;
                maxOneRow = i;
            }
            if(max==-1){
                max = findFirst(arr[i],0,c-1);
                maxOneRow = i;
            }
        }
        if(max==-1) return -1;
        return maxOneRow;

    }
    int findFirst(int row[],int start,int end){
        if(start>end) return -1;
        if(start==end){
            if(row[start]==1) return start;
        }

        int mid = start + (end-start)/2;

        if(row[mid]==0) return findFirst(row,mid+1,end);
        return findFirst(row,start,mid);
    }
}
