import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hasmap {
    public static void main(String[] args) {
        Map<String,Integer> student = new HashMap<String,Integer>();

        student.put("vidhi", 98);
        student.put("disha",53);
        student.put("cintu",63);

        System.out.println(student.entrySet());

        for(Map.Entry<String,Integer> e : student.entrySet()){

            System.out.println(e.getKey() + " " + e.getValue());
        }

    }

    private static Entry<String, Integer>[] entrySet() {
        return null;
    }
}
