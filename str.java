public class str {
    public static void main(String[] args) {
        String str = "hello my name is vidhi";
        char[] rplace = str.toCharArray();
        rplace[4]='i';
        str = new String(rplace);
        System.out.println(str);
    }
}
