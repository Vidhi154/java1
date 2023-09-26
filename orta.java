import java.util.*;

public class orta {

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        s.add(2);
        s.addAll(Arrays.asList(new Integer[] {23,56,5,3,4,6,78}));
        System.out.println(s);
        s.add(4);
        System.out.println(s);
        s.remove(5);
        s.remove(9);
        System.out.println(s);
        System.out.println(s.contains(6));
        for(Integer e : s){
            System.out.print(e + " ");
        }
    }
}