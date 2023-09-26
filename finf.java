import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class finf {
    
    
    public static void main(String[] args) {
        int[] a ={1,2,3,4,6,7};
        int len = a.length;
        HashMap<Integer,Integer> has = new HashMap<Integer,Integer>();
        for(int i =0;i<len;i++){
            int key =a[i];
            int valu =1;
            if(has.containsKey(key)){
                has.get(key);
                valu++;
            }
            has.put(key, valu);
        }
        // System.out.println(Arrays.toString(has));

        for(Entry<Integer, Integer> e : has.entrySet()){
            if(e.equals(0)){
                System.out.println(e.getKey());
            }

            // System.out.println(e.getKey() + " " + e.getValue());
        }



    
        
    }
}
