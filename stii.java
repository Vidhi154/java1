import java.util.Scanner;

public class stii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of students:");
        int t = sc.nextInt();
        for(int i =0; i <=t;i++){
            System.out.println("enter the name");
            String name = sc.next();
            System.out.println("roll number");
            long roll = sc.nextLong();
            System.out.println("branch");
            String br= sc.next();

            System.out.println("------------");
            System.out.println("name :"+ name + "\n" + " roll number :" + roll + "\n" + "branch :" + br) ;
            System.out.println("------------");
            System.out.println();

        }
    }
}
