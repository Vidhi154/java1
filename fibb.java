import java.util.Scanner;

public class fibb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int first=0;
        int second=1;
        // System.out.println(first);
        for(int i =0;i<n;i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;

        }
        System.out.println();
    }
}
