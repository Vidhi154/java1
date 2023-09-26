import java.util.Scanner;


public class q1 {
    String name ;
    int number;
    long price;
    //constructoer
    public q1(String nm,int num,long pr){
        name= nm;
        number = num;
        price = pr;

    }
    public static void setq(){
        System.out.println("enter the name of the flower:");
        name= sc.next();
        System.out.println("enter the number of petals:");
        number = sc.nextInt();
        System.out.println("enter the price:");
        price = sc.nextLong();
    }

    public static void getq(q1 c){
        System.out.println(c.name);
        System.out.println(c.number);
        System.out.println(c.price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }

}
