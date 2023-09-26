import java.util.Random;
import java.util.Scanner;

public class guess{

    int number;
    int max =100;
    Scanner sc= new Scanner(System.in);

    public guess(){
        Random ran = new Random();
        number = Math.abs(ran.nextInt())%(max +1);

    }
    public void play(){
        // int move = sc.nextInt();
        while(true){
            int move = sc.nextInt();
            if(move>number){
             System.out.println("larger");
            }
            else if(move<number){
                System.out.println("smaller");
            }
            else{
                System.out.println("you got it");
                break;
            }
            
        }


    }

    public static void howlong(int x){
        if(x>=0 && x<11){
            System.out.println("smaller ");
        }
        if(x>=11 && x<=100){
            System.out.println("lager");
        }
        else{
            System.out.println("out of range");
        }
    }





    public static void main(String[] args) {
        guess vi = new guess();
        vi.play();
        
    }
}