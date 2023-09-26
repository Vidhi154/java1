import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hassum {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,1,1,1,4,3,2};
        int n = a.length;
        
        //hasint 
        // int sum=0;
        HashMap<Integer,Integer> m = new HashMap<>();
        int len = m.size();
        int sum =0;
        for(int i =0;i<len;i++){
             sum +=a[i];
             m.put(sum, i);

        }

        int k =3;
        System.out.println(m.get(k));

    for(Entry<Integer, Integer> e : m.entrySet()){
        System.out.println(e.getKey() + " " + e.getValue());
    }
      
    }
}
