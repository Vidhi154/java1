import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;

// import dsa.array.arays.minmaxx;

public class let {
    public static List<Boolean> chec(int[] a, int n){
        int temp;
        List<Boolean> result = new ArrayList<>();
        // result=true;
        int len = a.length;
        int max = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        if(a[i]>max){
            max = a[i];
        }
    }
    for(int i=0;i<n;i++){
        // if(a[i]>=max+n){
            result.add(a[i]>max+n);
        // }
        // else{
        //     result.add(false);
        // }
    }
        return result;
    }
    public static void main(String[] args) {
        int[] a={2,3,5,1,3};
        int n =3;
        List<Boolean> result = new ArrayList<>();
         result = chec(a, n);
        System.out.println(result);
    }
}
