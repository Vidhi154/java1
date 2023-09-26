package dsa.array.arays;

import java.util.Arrays;

class students{
    int roll;
    String name;

    public students(int rol, String name){
        this.roll= rol;
        this.name=name;
    }

    // public String toString(int[] arry){
    //     return "one[ arry=" + Arrays.toString(arry) + "]";
        
    // }
}
public class one {
    public static void main(String[] args) {
        
    
    students[] arry = {new students(2208, "vidhi"), new students(2207, "disha")};

    // @Override
    // public String toString() {
    //     return "one [arry=" + Arrays.toString(arry) + "]";
    // }
    System.out.println(arry.toString());

    }

}
