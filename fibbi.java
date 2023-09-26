import java.util.Scanner;

public class fibbi {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // int n =sc.nextInt();
for(String ea : args){
int n=Integer.parseInt(ea);
System.out.println("entered number is " + n);

        int first=0;
        int second=1;
        // System.out.println(first);
System.out.println("the fibinnoii series of num" + n + " is-");
        for(int i =0;i<n;i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;

        }
}
        System.out.println();
    }
}
