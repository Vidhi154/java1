import java.util.Scanner;

public class strbu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        StringBuilder strodd = new StringBuilder();
        StringBuilder n = new StringBuilder();
        StringBuilder m = new StringBuilder();

        String s = sc.nextLine();
        for(int i =0 ; i<s.length();i++){
            if(i/2==0){
                 str.append(s.charAt(i));
            }else{
                 strodd.append(s.charAt(i));
            }
            // System.out.println(n + "  " + m);

        }
        System.out.println( str.toString()+ "  " + strodd.toString());
        

        
    }
}
