import java.util.Arrays;
import java.util.Scanner;
public class thed {
    private static int[][] ar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totaltest,values; 
        totaltest = sc.nextInt();
        int[][] ary = new int[totaltest][];

        for(int i =0;i<ary.length;i++){
            System.out.println("print the value");
            values=sc.nextInt();
            // ary[i]= new int[values];
            ary[i]= new int[values];
            // int len = ary.length;
            for(int j =0;j<ary[i].length;j++){
                System.out.println("enter the vzlue of j:");
                ary[i][j]=sc.nextInt();

            }
        }

        for(int i =0;i<ary.length;i++){
            int even =0;
            int odd= 0;
            
            System.out.println("test case :" + i + " " +"with" + ary[i].length + " "+"values:");
            System.out.println(Arrays.toString(ary[i]));

            for(int j =0;j<ary[i].length;j++){
                if(ary[i][j]%2==0){
                    even ++;

                }else{
                    odd++;
                }
            }
            System.out.println();

            System.out.println("even" + even + " " + "odd" + odd);
        }

        // int[][][] arr= new int[10][20][20];
        // int[][][] ar1= {}
    }
}
