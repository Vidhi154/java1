import java.util.Random;
import java.util.Scanner;

class rand{
    private Random rand ;
    int max ;
    int min;


    rand(){
        rand = new Random();
    }

    public Integer getinteger(int max , int min){
        return rand.nextInt(max - min +1) + min;
    


    }
    public Float geFloat(int max , int min){
        return rand.nextFloat(max -min +1) + min;
    }


    public Short geShort(int max , int min){
        return  (short)(rand.nextInt(max - min + 1) + min);
    }

    public Double getDouble(int max , int min){
        return rand.nextDouble(max - min +1) + min;
    }
    
    public long getlong(int max , int min){
        return rand.nextLong(max - min +1)+max;
    }



}

public class rann {
    public static void main(String[] args) {
        rand gener = new rand();
        if(args.length==0)
        {
            System.out.println("enter the number");
        }
        //Scanner sc = new Scanner(System.in);
        for(String e : args){
        int n = Integer.parseInt(e);
        System.out.println("HOW MANY NUMBERS YOU WANT");
        //int n = sc.nextInt();
        System.out.println("enter the maximun rang");
        int max = Integer.parseInt(e);
        //int max =  sc.nextInt();
        System.out.println("enter the minimum range");
        int min = Integer.parseInt(e);
        //int min = sc.nextInt();
        // int[] a = new int[n];
        System.out.println("-----------");
        System.out.println("integer random --");
        
        for(int i =0;i<n;i++){
            // System.out.println("integer random --");
           Integer num = gener.getinteger(max, min);
            System.out.println(num);
            
        }
        System.out.println("-----------");
        System.out.println("float random --");
        for(int i =0;i<n;i++){
            // System.out.println("integer random --");
           Float num = gener.geFloat(max, min);
            System.out.println(num);
            
        }
        System.out.println("-----------");
        System.out.println("double random --");
        for(int i =0;i<n;i++){
            // System.out.println("integer random --");
           Double num = gener.getDouble(max, min);
            System.out.println(num);
            
        }
        System.out.println("-----------");
        System.out.println("short random --");
        for(int i =0;i<n;i++){
            // System.out.println("integer random --");
           Short num = gener.geShort(max, min);
            System.out.println(num);
            
        }

    }
        


    }
    
}
