import java.util.Arrays;

public class kade {
    public static void main(String[] args) {
        int[] a ={1,1,0,0,1};
        int n = a.length;
        // int max =0;
        int sum =0;
        for(int i =0;i<n;i++){
            if(a[i]==0){
                a[i]=1;
            }
            sum++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);
    }
}
