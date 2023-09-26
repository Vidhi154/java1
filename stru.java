import java.util.Scanner;

public class stru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "vidhi";
        String sur = sc.nextLine();
        String full = name.concat(sur);
        System.out.println(full);
        System.out.println(full.length());
        // name.charAt(3)='j';
        System.out.println(name);
        System.out.println(name.compareTo(sur));
        // System.out.println(ch);
        // char ch2= sur.charAt(2);
        // ch2='j';
        // ch='p';
        //System.out.println(name);
        String hi= "my name is vidhi yadav";
        String git=hi.substring(3);//="disha yadav";
        System.out.println(git);
        for(int i =0;i<name.length;i++){
            name= sc.nextInt();
        }

        // for(int i =0;i<name.length();i++){
        //     ch=name.charAt(i);
        //     System.out.println(ch);
        // }


    }
}
