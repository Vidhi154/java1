import java.util.Arrays;

public class liner {
    public static void main(String[] args) {
        int[] a= {1,2,4,5};
        int m = 5;
        Arrays.sort(a);
        int n = a.length;
        int flag;
        int j ;
        for(int i =1;i<=m;i++){
            flag =0;
            for( j =0;j<n-1;j++){
                //  flag =0;
                if(a[j]==i){
                    flag =1;
                    break;

                }
            }
            if(flag ==0){
                System.out.println(j);

            }
        }
    }
}
