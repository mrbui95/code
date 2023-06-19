import java.util.Stack;

public class Celebrity {
    boolean knows(int M[][],int i,int j){
        return M[i][j]==1;
    }

    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++) st.push(i);

        while(st.size()>1){
            int a = st.pop();
            int b = st.pop();
            if(knows(M,a,b)) st.push(b);
            else st.push(a);
        }

        int ans = st.peek();

        int zeroCount = 0;

        for(int i=0;i<n;i++){
            if(M[ans][i]==0) zeroCount++;
        }

        if(zeroCount!=n) return -1;

        int oneCount = 0;

        for(int i=0;i<n;i++){
            if(M[i][ans]==1) oneCount++;
        }

        if(oneCount!=n-1) return -1;

        return ans;
    }
}
