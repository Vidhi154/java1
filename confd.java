import java.util.Scanner;


public class confd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bob");
        int b = sc.nextInt();
        System.out.println("rob");
        int r = sc.nextInt();
        if(r>b){
            System.out.println("rob has higher marks than bob");

        }
        else if(b==r){
            System.out.println("bith scored same");
        }
        else{
            System.out.println("bob scored more than rob");
        }
    }
}
