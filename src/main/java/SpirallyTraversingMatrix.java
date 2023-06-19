import java.util.ArrayList;

public class SpirallyTraversingMatrix {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer> Myarraylist= new ArrayList<>();
        int dir=0;
        int T=0;
        int B=r-1;
        int L=0;
        int R= c-1;
        while(T<=B && L<=R){
            if(dir==0){
                for(int i=L;i<=R;i++){
                    Myarraylist.add(matrix[T][i]);
                }
                T++;
            }
            else if(dir==1){
                for(int i=T;i<=B;i++){
                    Myarraylist.add(matrix[i][R]);

                }
                R--;
            }
            else if(dir==2){
                for(int i=R;i>=L;i--){
                    Myarraylist.add(matrix[B][i]);

                }
                B--;
            }
            else if(dir==3){
                for(int i=B;i>=T;i--){
                    Myarraylist.add(matrix[i][L]);

                }
                L++;
            }
            dir= (dir+1)%4;
        }
        return Myarraylist;
    }
}
