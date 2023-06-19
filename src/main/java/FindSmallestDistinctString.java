import java.util.HashMap;

public class FindSmallestDistinctString {
    public int findSubString( String str) {
        // Your code goes here
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(!hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i),0);
        }
        int distcount=0;
        int j=0;
        int minlen=str.length()+1;
        for(int i=0;i<str.length();i++)
        {
            hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            if(hm.get(str.charAt(i))==1)
            {
                distcount++;
            }
            if(distcount==hm.size())
            {
                minlen=Math.min(minlen,i-j+1);
                while((i-j+1)>=hm.size())
                {
                    hm.put(str.charAt(j),hm.get(str.charAt(j))-1);
                    if(hm.get(str.charAt(j))==0)
                    {
                        distcount--;
                        minlen=Math.min(i-j+1,minlen);
                        j++;
                        break;
                    }
                    else
                        j++;
                }
            }
        }
        return minlen;
    }
}
