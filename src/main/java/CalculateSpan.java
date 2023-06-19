import java.util.Stack;

public class CalculateSpan {
    public static int[] calculateSpan(int price[], int n)
    {
        int span[] = new int[n];
        Stack<Integer> stock = new Stack<>();

        for(int i=0;i<n;i++)
        {
            while(!stock.isEmpty() && price[i]>=price[stock.peek()])
                stock.pop();

            span[i] = (stock.isEmpty())?i+1:i-stock.peek();
            stock.push(i);
        }

        return span;
    }
}
