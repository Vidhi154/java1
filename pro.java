import java.util.Scanner;


public class pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("weight of ram ");
        int ram = sc.nextInt();
        System.out.println("weight of karan");
        int karan = sc.nextInt();
        if(ram>karan){
            System.out.println("ram is heighver than karan");

        }else if (ram < karan){
            System.out.println("ram is lighter than karan");

        }else {
            System.out.println("same weight");
        }

    }
}
