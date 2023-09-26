import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dic {
    public static void main(String[] args) {
        // Map<String,String> engspan = new HashMap<String,String>();
        // engspan.put("monday","sukrwaar");
        // engspan.put("come", "idhar aa");
        // engspan.put("work", null);
        // System.out.println("checking...");
        // System.out.println(engspan.containsKey("work"));
        // System.out.println(engspan.get("work"));
        // System.out.println(engspan.get("monday"));
        // System.out.println(engspan.containsKey("home"));
        // engspan.put("method", "vidhi");
        // engspan.put("monday", "hello");
        // System.out.println(engspan.get("monday"));
        // System.out.println(engspan.keySet());
        // System.out.println(engspan.values());
        // System.out.println(engspan.size());
        // System.out.println(engspan.entrySet());
        // System.out.println(engspan.);

        Map<String,Integer> shop = new HashMap<String,Integer>();
        System.out.println("put the things on the list");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no. of shoppings you are doing---");
        int items = sc.nextInt();

        for(int i =0;i<items;i++){
            System.out.println("enter the item");
            String name = sc.next();
            System.out.println("enter the no. of items");
            int no = sc.nextInt();
            shop.put(name,no);
            System.out.println(shop.get(name));


        }

        // System.out.println("here is the shoping list---");
        // System.out.println(shop.get(sc));
        System.out.println(shop.entrySet());
        System.out.println(shop.toString());
    }
}
