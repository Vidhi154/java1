import java.util.Arrays;

public class def {
    public static void main(String[] args) {
        // int[][] ay= new int[3][5];
        // System.out.println("efauly value " + ay[0][0] + ay[2][3]);

        // boolean[][] bol = new boolean[2][3];
        // System.out.println("defalut boolan :" + bol[0][0]);

        // String[][] str = new String[2][4];
        // System.out.println("deafault value :" + str[0][0]);

        String[][] str = {{"my name is vidhi" , "my name is disha " , "my name is chintu"},
                            {"2nd year","9th class","kg 2"},
                            {"patna","indore","ghar"}};

        System.out.println("what is your name ? : " + str[0][0]);
        System.out.println(Arrays.deepToString(str));


        int[][] ay = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("my number is : " + ay[2][1]);
        System.out.println(Arrays.deepToString(ay));


    }
}
