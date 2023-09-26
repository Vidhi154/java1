public class replace {
    public static void main(String[] args) {
        String a = "vidhi yadav";
        char[] rplace = a.toCharArray();
         rplace[3]='r';
         a = new String(rplace);
        System.out.println(rplace);
    }
}
