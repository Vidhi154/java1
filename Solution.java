import java.util.Scanner;

public class Solution {
    public static void evenodd(String s){
        StringBuilder str = new StringBuilder();
        StringBuilder strodd = new StringBuilder();
        
        for(int i =0; i <s.length();i++){
            if(i/2==0){
            str.append(s.charAt(i));
            }else{
                strodd.append(s.charAt(i));
            }
        }
        System.out.println(str.toString() + "  " + strodd.toString());
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        // String S = sc.nextLine();
        int T = sc.nextInt();
        //int N;
        for(int i =0;i<T;i++){
            String S = sc.nextLine();
            evenodd(S);
        }
        
        
        
    }

}
