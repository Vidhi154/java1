import java.util.Scanner;

public class dym {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0;i<T;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();//leaves
            int z= sc.nextInt();//join
            int to= (x-y);
            // int x = sc.nextInt();//no. of sets 
            // int q= 15 ;
            //one set 15 squats 
            System.out.println("total no. of population " + "=" + (to+z));



        }
    }
}
