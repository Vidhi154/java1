import java.util.Scanner;

public class swi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day= sc.nextLine();
        switch(day){
            case "mon" : System.out.println("monday");
                        break;
            case "tue" : System.out.println("tuesday");
            break;
            case "wed" : System.out.println("wednesday");
            break;
            case "thu" : System.out.println("thusaday");
            break;
            default : System.out.println("holiday");
            break;
        }
    }
}
