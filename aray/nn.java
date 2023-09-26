import java.util.HashMap;
import java.util.Map;

public class nn {
    public static void main(String[] args) {
        Map<String,Integer> my = new HashMap<String , Integer>();
        my.put("vidhi",19);
        my.size();
        System.out.println(my.toString());
        System.out.println(my.hashCode());
        System.out.println(my.replace("vidhi",82));
        System.out.println(my.isEmpty());my.put("disha", 63);
        System.out.println(my.containsKey("vidhi"));
        System.out.println(my.get("disha"));
        System.out.println(my.containsKey("babt"));
        System.out.println(my.getClass());
        System.out.println();
        System.out.println(my.equals("vidhi"));


        System.out.println(my.entrySet());


    }
}
