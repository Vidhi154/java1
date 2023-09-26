import java.util.Scanner;



public class kmtom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the kg");
        float kg = sc.nextFloat();
        // System.out.println("enter the meter");
        // float meter = sc.nextFloat();
        float converter = kg%1000;
        System.out.println(converter+"meter");

    }
}
