import java.util.ArrayList;
import java.util.Arrays;

public class movee {
    public static int[] mov(int[] a , int n){
    //     int[] temp={};
        
    // 
    ArrayList<Integer> temp = new ArrayList<Integer>();
    for(int i =0;i<n;i++){
        if(a[i]!=0){
            temp.add(i);
        }
    }

    int s = temp.size();

    for(int i =0;i<s;i++){
        a[i]=temp.get(i);
    }

    for(int i =s;i<n-1;i++){
        a[i]=0;


    }
    return a;

    }
    public static void main(String[] args) {
        int[] a={1,3,4,0,4,0,2,0};
        int len = a.length;
        System.out.println(mov(a, len));
        System.out.println(Arrays.toString(a));
        
    }
}
