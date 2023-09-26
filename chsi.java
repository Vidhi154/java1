import java.util.Scanner;


public class chsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i =0;i<t;i++){
            int com= 30;//complete one game
            int n= sc.nextInt();//total number of time is given to him
            int num= (n/com);
            int ti=n%num;
            System.out.println("total number of play " + "=" + num);
            System.out.println("reamaining time " + "=" + ti);
        }
    }
}
