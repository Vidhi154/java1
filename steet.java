import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class steet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<7;i++){
            String num = sc.next();
            set1.add(num);
        }

        System.out.println(set1);

        Iterator value = (Iterator) set1.iterator();
        System.out.println(value);



    //    for(int i =0;i<7;i++){
    //     set1.iterator();
       }
        // int[] ele = {2,4,56,85,2};
        // Set set1 = new HashSet(Arrays.asList(ele));
        // set1.iterator();
        // System.out.println(set1);

        // ele = new int[]{2,4,56,};
        // Set set2 = new HashSet(Arrays.asList(ele));
        // System.out.println(set2);

        // System.out.println(set1.containsAll(set2));
    }

