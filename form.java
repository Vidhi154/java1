import java.util.Scanner;
public class form {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                if( s1.length()<=10){
                    if(x>0 && x<=999){
                    System.out.println(s1 +"              "+ x);
                    }
                }
                // if(x>0 && x<=999){
                    
                // }
                
            }
            System.out.println("================================");

    }
}
