import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class hashpp {

    public static void main(String[] args) {
        int[]a = new int[10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            a[i]= sc.nextInt();
            
        }
        System.out.println(Arrays.toString(a));

        //pre requite
        HashMap<Integer,Integer> hashi = new HashMap<>();
        for(int i =0;i<n;i++){
            int key = a[i];
            int value = 0;
            if(hashi.containsKey(key))
                hashi.get(key);
                value++;
            
            hashi.put(key,value);
        }
        // System.out.println();

        for(Entry<Integer, Integer> it : hashi.entrySet()){
            System.out.println(it);
        }



        int q = sc.nextInt();
        while(q-->=0){
            int num= sc.nextInt();
            if(hashi.containsKey(num)){
                hashi.get(num);
            }
            else{
                System.out.println(0);
            }
        }
    }
}