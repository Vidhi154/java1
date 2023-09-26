import java.util.Arrays;

public class ad {
    public static void main(String[] args) {
        int[][] ar1= {{1,2,3},{5,3,2}};
        int[][] ar2 = {{54,35,3},{54,2,5}};
        int[][] sum= new int[2][3];

        for(int i=0;i<ar1.length;i++){
            for(int j =0;j<ar1[0].length;i++){

                sum[i][j]=ar1[i][j] + ar2[i][j];


                // System.out.println(ar1[i][j]);
                // System.out.println();
                // System.out.println(ar2[i][j]);
            }
        }
        System.out.println();
        for(int i=0;i<sum.length;i++){
            System.out.println(Arrays.toString(sum[i]));

        }
        // System.out.println(Arrays.toString(sum));
    }
}
