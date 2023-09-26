import java.util.Arrays;
import java.util.HashMap;
// import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class hasg {
    public static int[] getfre(int []v) {
        // Write Your Code Here
        // Scanner sc = new Scanner(System.in);
        int len =v.length;
        for(int i =0;i<len;i++){

        }
        // int larger = Integer.MAX_VALUE;

        //pre requite 
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i =0;i<len;i++){
            if(hash.containsKey(v[i])){
                hash.put(v[i], hash.get(v[i])+1);
            }
            else{
                hash.put(v[i],1);
            }
        }

        int minfr = Integer.MIN_VALUE;
        int maxfr =Integer.MAX_VALUE;
        // int minele =0;
        // int maxele = 0;
        int[] ary = new int[2];
        for(int it : hash.keySet()){
            System.out.println(it);
            // int count= it;
            // int eleme= it;
            // System.out.println(count + " " + eleme);
            if(hash.get(it) > maxfr){
                ary[0]=it;

            }
            if(hash.get(it)<minfr){
                // minfr = it.getValue();
                // minele =it.getKey();
                ary[1]=it;

            }

            }
            return ary;
            // System.out.println("minimun value " + minfr + " elemenet " + minele);
            // System.out.println("maximum value " + maxfr + " element " + maxele);

        }
        public static void main(String[] args) {
            int[] a = {2,3,4,3,2,3,2};
            System.out.println(Arrays.toString(a));
           int[] aa = getfre(a);
           System.out.println(Arrays.toString(aa));

        }

    }
    

