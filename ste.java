import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ste {
    public static void main(String[] args) {
        Set<Integer> sett = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        Character[] ch = {'d','y','w','a'};
        // System.out.println(Arrays.asList(ch));
        List<Character> ls = Arrays.asList(ch);
        System.out.println(ls);

        for(int i =0;i<10;i++){
            int num= sc.nextInt();
            sett.add(num);
        }
        System.out.println(sett);
        // Set<Integer> set2 = new/ HashSet<>();
        // set2= set2.containsAll(sett);
    }
}
