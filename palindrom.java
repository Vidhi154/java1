import java.util.Scanner;

public class palindrom {

    public static boolean isplain(int num){
        if(num<0){
            return false;
        }
        int orignal = num;
        int opp =0;
        while(num>0){
           int digit = num % 10;
           opp = opp * 10 + digit;
           num=num/10;

        }
        // System.out.println(orignal);
        // System.out.println(opp);

        if(orignal==opp){
            return true;
        }
        else{
            return false;

        }
        
        // return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num =sc.nextInt();
        boolean result =isplain(num);
        System.out.println(result);

        
    }
}
