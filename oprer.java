import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class oprer {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();

        a.addAll(Arrays.asList(new Integer[] {2,3,4,5,6,7,8}));

        Set<Integer> b = new HashSet<Integer>();

        System.out.println(a);

        b.addAll(Arrays.asList(new Integer[] {2,4,6,7,9,9,9,76,4,3}));


        System.out.println(b);

        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("the union is ");
        System.out.println(union);


        Set<Integer> diff = new HashSet<Integer>(a);
        diff.retainAll(b);
        System.out.println(diff);


        Set<Integer> re = new HashSet<Integer>(a);
        re.removeAll(b);
        System.out.println(re);







    }
}
