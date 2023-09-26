import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
public class hasrgg {
//     import java.util.HashMap;
// import java.util.Map.Entry;

// import sun.security.provider.EntropySource;

    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        // Scanner sc = new Scanner(System.in);
        int len =v.length;
        
        int maxfr = 0;
        int minfr = len;
        // int maxele =0;
        // int minele =0;

        //pre requite 
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i =0;i<len;i++){
            if(hash.containsKey(v[i])){
                hash.put(v[i], hash.get(v[i])+1);
            }else{
                hash.put(v[i], 1);
            }
        }
        // int[] a = {0};
        // int[] a = new int[2];
        for(int it : hash.keySet()){
            int count = hash.get(it);
            // int keyy= hash.getKey(it);
            if(count>maxfr){
                maxfr = count ;
                // maxele = keyy;
                // a[0]=maxfr;
            }
            if( count< minfr){
                minfr = count;
                // minele = keyy;
                // a[1]=minfr;
            }



        }

        int[] a = {maxfr,minfr};

        return a;
    }

    public static void main(String[] args) {
        int[] a= {1,2,3,4,3,3,2,2,3,2,1};
        int[] result = getFrequencies(a);
        // System.out.println(result);
        System.out.println(Arrays.toString(result));


    }
}

