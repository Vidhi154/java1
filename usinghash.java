import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class usinghash {
    public static void main(String[] args) {
        int[] a = {1,2,34,2,3,3,4,5};
         int len = a.length;
         System.out.println(Arrays.toString(a));

         HashMap<Integer,Integer> hashi = new HashMap<Integer,Integer>();
         for(int i =0;i<len ;i++){
            int key = a[i];
            int valu = 0;
             if(hashi.containsKey(key)){
                hashi.get(key);
                valu++;
             }

            hashi.put(key, valu);
         }

         for(Map.Entry<Integer,Integer> e : hashi.entrySet()){

            System.out.println(e.getKey() + "=" + e.getValue());
        }
    }
}
