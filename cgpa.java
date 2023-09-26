import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the cgpa of three subjets are-");
        System.out.println("marks of english");
        float eng = sc.nextFloat();
        System.out.println("hindi");
        float hindi = sc.nextFloat();
        System.out.println("maths :");
        float maths = sc.nextFloat();
        float sum = eng + maths + hindi ;
        float percent = (sum % 3);
        float cgpa = sum%10;
        System.out.println("the cgpa will be :");
        System.out.println(cgpa);



    }
}
