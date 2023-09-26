import java.util.Scanner;

public class fibbb {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int first=0;
        int second=1;
        // System.out.println("the fiboonaci series are --);
        for(int i =0;i<n;i++){
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;

        }
        System.out.println();
    }
}