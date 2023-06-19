import java.util.HashMap;
import java.util.Map;

public class CountConcurentText {
    int search(String pat, String txt) {
        // code here

        Map<Character, Integer> map = new HashMap<>();

        for(Character c: pat.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int count = map.size();


        int start = 0;
        int end = 0;

        int result = 0;

        while(end < txt.length()){

            if(map.containsKey(txt.charAt(end))){
                map.put(txt.charAt(end), map.get(txt.charAt(end)) -1);

                if(map.get(txt.charAt(end)) == 0){
                    count--;
                }
            }

            if(end-start+1 == pat.length()){
                if(count == 0){
                    result++;
                }

                if(map.containsKey(txt.charAt(start))){
                    if(map.get(txt.charAt(start)) == 0){
                        count++;
                    }
                    map.put(txt.charAt(start), map.get(txt.charAt(start)) +1);
                }
                start++;
            }
            end++;
        }

        return result;
    }
}
