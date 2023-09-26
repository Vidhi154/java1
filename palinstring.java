import java.util.Scanner;

public class palinstring {
    public static boolean ispalin(String str){
        str= str.replaceAll("\\s+" + " ", str).toLowerCase();
        int left =0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                return true;
            }
            else{
                return false;
            }
        
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean result = ispalin(str);
        System.out.println(result);
    }
}
