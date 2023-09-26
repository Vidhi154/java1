import java.util.Scanner;

public class a6 {
    public static boolean ar(int[] aary){
        for(int i : aary){
            for(int j : aary){
                if((i*j)%2==1){
                    System.out.println(i);
                    System.out.println(j);
                    return true;
                }else{
                    return false;
                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] ary = {1,23,4,23,4,234,24};
        boolean ch= ar(ary);
        System.out.println(ch);
        //int num = sc.nextInt();
        ///sum(num);
    }
}
